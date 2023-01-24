package com.flansmod.common.teams;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.utils.ConfigMap;
import com.flansmod.utils.ConfigUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlayerClass extends InfoType {
    public static List<PlayerClass> classes = new ArrayList<>();

    public List<String[]> startingItemStrings = new ArrayList<>();
    public List<ItemStack> startingItems = new ArrayList<>();
    public int lvl = 0;

    /**
     * Override armour. If this is set, then it will override the team armour
     */
    public ItemStack hat, chest, legs, shoes;

    public PlayerClass(TypeFile file) {
        super(file);
        classes.add(this);
    }

    @Override
    protected void read(ConfigMap config, TypeFile file) {
        super.read(config, file);
        //todo setup for multiple AddItem
        if (config.containsKey("AddItem")) {
            startingItemStrings.add(ConfigUtils.getSplitFromKey(config, "AddItem"));
        }
        for (String item : config.items) {
            startingItemStrings.add(item.split(" "));
        }
        lvl = ConfigUtils.configInt(config, "UnlockLevel", lvl);
        texture = ConfigUtils.configString(config, "SkinOverride", texture);

        if(config.containsKey("Hat") || config.containsKey("Helmet")) {
            String key = "Hat";
            if (config.containsKey("Helmet"))
                key = "Helmet";
            if(config.get(key).equalsIgnoreCase("None"))
                return;
            for(Item item : FlansMod.armourItems)
            {
                ArmourType armour = ((ItemTeamArmour)item).type;
                if(armour != null && armour.shortName.equals(config.get(key)))
                    hat = new ItemStack(item);
            }
        }
        if (config.containsKey("Chest")  || config.containsKey("Top")) {
            String key = "Chest";
            if (config.containsKey("Top"))
                key = "Top";
            if(config.get(key).equalsIgnoreCase("None"))
                return;
            for(Item item : FlansMod.armourItems)
            {
                ArmourType armour = ((ItemTeamArmour)item).type;
                if(armour != null && armour.shortName.equals(config.get(key)))
                    chest = new ItemStack(item);
            }
        }
        if (config.containsKey("Legs")  || config.containsKey("Bottom")) {
            String key = "Legs";
            if (config.containsKey("Bottom"))
                key = "Bottom";
            if(config.get(key).equalsIgnoreCase("None"))
                return;
            for(Item item : FlansMod.armourItems)
            {
                ArmourType armour = ((ItemTeamArmour)item).type;
                if(armour != null && armour.shortName.equals(config.get(key)))
                    legs = new ItemStack(item);
            }
        }
        if (config.containsKey("Shoes")  || config.containsKey("Boots")) {
            String key = "Shoes";
            if (config.containsKey("Boots"))
                key = "Boots";
            if(config.get(key).equalsIgnoreCase("None"))
                return;
            for (Item item : FlansMod.armourItems) {
                ArmourType armour = ((ItemTeamArmour)item).type;
                if(armour != null && armour.shortName.equals(config.get(key)))
                    shoes = new ItemStack(item);
            }
        }
    }


    @Override
    protected void preRead(TypeFile file) { }

    /**
     * This loads the items once for clients connecting to remote servers, since the clients can't tell what attachments a gun has in the GUI and they need to load it at least once
     */
    @Override
    protected void postRead(TypeFile file) {
        onWorldLoad(null);
    }

    /**
     * In the loading phase item IDs are all up in the air and so too are NBT tags regarding ItemStacks
     * So to avoid guns with attachments having their attachments replaced with incorrect ones,
     * random guns and other silly things, we read the relevant lines here, as the world loads
     */
    @Override
    public void onWorldLoad(World world) {
        if (world != null && world.isRemote)
            return;
        try {
            startingItems.clear();
            long start = System.currentTimeMillis();
            for (String[] split : startingItemStrings) {
                Item matchingItem = null;
                int amount = 1;
                int damage = 0;
                String[] itemNames = split[1].split("\\+");

                // Attempt to match item from Flan's Mod or vanilla
                Item vanillaMatch = (Item) Item.itemRegistry.getObject(itemNames[0]);
                if (vanillaMatch != null)
                    matchingItem = vanillaMatch;
                else {
                    Item flansMatch = (Item) Item.itemRegistry.getObject(FlansMod.MODID + ":" + itemNames[0]);
                    if (flansMatch != null)
                        matchingItem = flansMatch;
                }

                // If no match found (not all items match their registry name with their unlocalized name),
                // iterate through the item registry and compare unlocalized names.
                if (matchingItem == null) {
                    for (Object object : Item.itemRegistry) {
                        Item item = (Item) object;
                        if (item != null && item.getUnlocalizedName() != null && (item.getUnlocalizedName().equals(itemNames[0]) || (item.getUnlocalizedName().split("\\.").length > 1 && item.getUnlocalizedName().split("\\.")[1].equals(itemNames[0]))))
                            matchingItem = item;
                    }
                }
                for (InfoType type : InfoType.infoTypes) {
                    if (type.shortName.equals(itemNames[0]) && type.item != null) {
                        matchingItem = type.item;
                    }
                }
                if (matchingItem == null) {
                    FlansMod.log("Tried to add " + split[1] + " to player class " + shortName + " but the item did not exist");
                    return;
                }
                if (split.length > 2) {
                    amount = Integer.parseInt(split[2]);
                }
                if (split.length > 3) {
                    damage = Integer.parseInt(split[3]);
                }
                ItemStack stack = new ItemStack(matchingItem, amount, damage);
                if (itemNames.length > 1 && matchingItem instanceof ItemGun) {
                    GunType gunType = ((ItemGun) matchingItem).type;
                    NBTTagCompound tags = new NBTTagCompound();
                    NBTTagCompound attachmentTags = new NBTTagCompound();
                    int genericID = 0;
                    for (int i = 0; i < itemNames.length - 1; i++) {
                        AttachmentType attachment = AttachmentType.getAttachment(itemNames[i + 1]);
                        if (attachment != null) {
                            String tagName = null;
                            switch (attachment.type) {
                                case sights:
                                    tagName = "scope";
                                    break;
                                case barrel:
                                    tagName = "barrel";
                                    break;
                                case stock:
                                    tagName = "stock";
                                    break;
                                case grip:
                                    tagName = "grip";
                                    break;
                                case generic:
                                    tagName = "generic_" + genericID++;
                                    break;
                                // TODO: Implement new attachments to classes
                                case accessory:
                                    break;
                                case gadget:
                                    break;
                                case pump:
                                    break;
                                case slide:
                                    break;
                            }
                            NBTTagCompound specificAttachmentTags = new NBTTagCompound();
                            new ItemStack(attachment.item).writeToNBT(specificAttachmentTags);
                            attachmentTags.setTag(tagName, specificAttachmentTags);
                        }
                        //Maybe it was a paintjob
                        else {
                            Paintjob paintjob = gunType.getPaintjob(itemNames[i + 1]);
                            if (paintjob != null)
                                tags.setString("Paint", paintjob.iconName);
                        }
                    }
                    tags.setTag("attachments", attachmentTags);
                    stack.stackTagCompound = tags;
                }
                startingItems.add(stack);
            }
            // Log how long it took to load
            long end = System.currentTimeMillis() - start;
            if (!startingItemStrings.isEmpty())
                FlansMod.log("Loaded PlayerClass for " + name + " (" + packName + ") in " + end + " ms");
        } catch (Exception e) {
            FlansMod.log("Interpreting player class file failed.");
            e.printStackTrace();
        }
    }

    public static PlayerClass getClass(String s) {
        for (PlayerClass playerClass : classes) {
            if (playerClass.shortName.equals(s))
                return playerClass;
        }
        return null;
    }

    @Override
    public float GetRecommendedScale() {
        return 50.0f;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBase GetModel() {
        return null;
    }
}
