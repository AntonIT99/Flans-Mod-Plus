package com.flansmod.common.types;

import com.flansmod.api.IInfoType;
import com.flansmod.common.FlansMod;
import com.flansmod.utils.ConfigMap;
import com.flansmod.utils.ConfigUtils;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public abstract class InfoType implements IInfoType {
    public ConfigMap configMap = new ConfigMap();
    /**
     * infoTypes
     */
    public static List<InfoType> infoTypes = new ArrayList<>();

    public String contentPack;
    public Item item;
    public int colour = 0xffffff;
    public String iconPath;
    public Object[] recipe;
    public String[] recipeLine;
    public int recipeOutput = 1;
    public boolean shapeless;
    public String smeltableFrom = null;
    public String name;
    public String shortName;
    public String texture;
    public String modelString;
    public String description;
    public float modelScale = 1F;
    /**
     * If this is set to false, then this item cannot be dropped
     */
    public boolean canDrop = true;

    public final String packName;

    public InfoType(TypeFile file) {
        contentPack = file.name;
        packName = file.pack;
        infoTypes.add(this);
    }

    /**
     * Method for performing actions prior to reading the type file
     */
    protected abstract void preRead(TypeFile file);

    /**
     * Method for performing actions after reading the type file
     */
    protected abstract void postRead(TypeFile file);

    public void read(TypeFile file) {
        preRead(file);
        boolean readRecipe = false;
        int recipePart = 0;
        for (; ; ) {
            String line = file.readLine();

            //If its after a Recipe line, its a recipe
            if (readRecipe && recipePart <= 2) {
                if (line != null) {
                    if (line.length() == 3)
                        configMap.put("Recipe" + recipePart++, line);
                    else if (line.length() == 2)
                        configMap.put("Recipe" + recipePart++, line + " ");
                    else if (line.length() == 1)
                        configMap.put("Recipe" + recipePart++, line + "  ");
                } else {
                    configMap.put("Recipe" + recipePart++, "   ");
                }
                continue;
            }

                //Ignore the line in these cases
                if (line == null)
                    break;
                if (line.startsWith("//"))
                    continue;
                String[] split = line.split(" ");

                //If its ammo, add it to the ammo list
                if (split[0].equalsIgnoreCase("ammo")) {
                    configMap.ammos.add(split[1]);
                    continue;
                } else if (split[0].equalsIgnoreCase("additem")) {
                    configMap.items.add(line);
                    continue;
                }

                if (split.length > 2) {
                    String data = "";
                    for (int i = 1; i < split.length; i++) {
                        data += split[i] + " ";
                    }
                    configMap.put(split[0].toLowerCase(), data.trim());
                    if (split[0].equalsIgnoreCase("recipe")) {
                        readRecipe = true;
                    }
                } else if (split.length == 2){
                    configMap.put(split[0].toLowerCase(), split[1]);
                } else {
                    continue;
                }
        }

        shortName = ConfigUtils.configString(configMap, "ShortName", shortName);

        if (shortName == null ) {
            infoTypes.remove(this);
        } else {
            read(configMap, file);
            postRead(file);
        }
    }

    /**
     * Pack reader
     */
    protected void read(ConfigMap config, TypeFile file) {

        modelString = ConfigUtils.configString(configMap, "Model", modelString);
        if (config.containsKey("ModelScale"))
            modelScale = Float.parseFloat(config.get("ModelScale"));
        name = ConfigUtils.configString(configMap, "Name", name);
        description = ConfigUtils.configString(configMap, "Description", description);
        shortName = ConfigUtils.configString(configMap, "ShortName", shortName);

        if (config.containsKey("Color")) {
            String[] rgb = config.get("Color").split(" ");
            colour = (Integer.parseInt(rgb[0]) << 16) + ((Integer.parseInt(rgb[1])) << 8) + ((Integer.parseInt(rgb[2])));
        } else if (config.containsKey("Colour")) {
            String[] rgb = config.get("Colour").split(" ");
            colour = (Integer.parseInt(rgb[0]) << 16) + ((Integer.parseInt(rgb[1])) << 8) + ((Integer.parseInt(rgb[2])));
        }

        iconPath = (config.get("Icon") == null || config.get("Icon").isEmpty()) ? "Missing-Icon-" + shortName : config.get("Icon");
        if (config.containsKey("RecipeOutput"))
            recipeOutput = ConfigUtils.configInt(config, "RecipeOutput", recipeOutput);
        if (config.containsKey("Recipe")) {
            recipeLine = ("Recipe " + config.get("Recipe")).split(" ");
            String[] split = ConfigUtils.getSplitFromKey(config, "Recipe");
            recipe = new Object[split.length + 2];
            recipe[0] = config.get("recipe0");
            recipe[1] = config.get("recipe1");
            recipe[2] = config.get("recipe2");
        } else if (config.containsKey("ShapelessRecipe")) {
            recipeLine = ("Recipe " + config.get("Recipe")).split(" ");
            shapeless = true;
        }
        smeltableFrom = ConfigUtils.configString(configMap, "SmeltableFrom", smeltableFrom);
        if (config.containsKey("CanDrop"))
            canDrop = Boolean.parseBoolean(config.get("CanDrop"));
    }

    public void addRecipe() {
        this.addRecipe(getItem());
    }

    /**
     * Reimported from old code
     */
    public void addRecipe(Item par1Item) {
        if (smeltableFrom != null) {
            GameRegistry.addSmelting(getRecipeElement(smeltableFrom, 0), new ItemStack(item), 0.0F);
        }
        if (recipeLine == null)
            return;
        try {
            if (!shapeless) {
                // Fix oversized recipes
                int rows = 3;
                // First column
                if (((String) recipe[0]).charAt(0) == ' ' && ((String) recipe[1]).charAt(0) == ' ' && ((String) recipe[2]).charAt(0) == ' ') {
                    for (int i = 0; i < 3; i++)
                        recipe[i] = ((String) recipe[i]).substring(1);
                    // New first column
                    if (((String) recipe[0]).charAt(0) == ' ' && ((String) recipe[1]).charAt(0) == ' ' && ((String) recipe[2]).charAt(0) == ' ') {
                        for (int i = 0; i < 3; i++)
                            recipe[i] = ((String) recipe[i]).substring(1);
                    }
                }
                // Last column
                int last = ((String) recipe[0]).length() - 1;
                if (((String) recipe[0]).charAt(last) == ' ' && ((String) recipe[1]).charAt(last) == ' ' && ((String) recipe[2]).charAt(last) == ' ') {
                    for (int i = 0; i < 3; i++)
                        recipe[i] = ((String) recipe[i]).substring(0, last);
                    // New last column
                    last--;
                    if (((String) recipe[0]).charAt(last) == ' ' && ((String) recipe[1]).charAt(last) == ' ' && ((String) recipe[2]).charAt(last) == ' ') {
                        for (int i = 0; i < 3; i++)
                            recipe[i] = ((String) recipe[i]).substring(0, 0);
                    }
                }
                // Top row
                if (recipe[0].equals(" ") || recipe[0].equals("  ") || recipe[0].equals("   ")) {
                    Object[] newRecipe = new Object[recipe.length - 1];
                    newRecipe[0] = recipe[1];
                    newRecipe[1] = recipe[2];
                    recipe = newRecipe;
                    rows--;
                    // Next top row
                    if (recipe[0].equals(" ") || recipe[0].equals("  ") || recipe[0].equals("   ")) {
                        Object[] newRecipe1 = new Object[recipe.length - 1];
                        newRecipe1[0] = recipe[1];
                        recipe = newRecipe1;
                        rows--;
                    }
                }
                // Bottom row
                if (recipe[rows - 1].equals(" ") || recipe[rows - 1].equals("  ") || recipe[rows - 1].equals("   ")) {
                    Object[] newRecipe = new Object[recipe.length - 1];
                    newRecipe[0] = recipe[0];
                    newRecipe[1] = recipe[1];
                    recipe = newRecipe;
                    rows--;
                    // Next bottom row
                    if (recipe[rows - 1].equals(" ") || recipe[rows - 1].equals("  ") || recipe[rows - 1].equals("   ")) {
                        Object[] newRecipe1 = new Object[recipe.length - 1];
                        newRecipe1[0] = recipe[0];
                        recipe = newRecipe1;
                        rows--;
                    }
                }
                for (int i = 0; i < (recipeLine.length - 1) / 2; i++) {
                    recipe[i * 2 + rows] = recipeLine[i * 2 + 1].charAt(0);
                    // Split ID with . and if it contains a second part, use it
                    // as damage value.
                    if (recipeLine[i * 2 + 2].contains("."))
                        recipe[i * 2 + rows + 1] = getRecipeElement(recipeLine[i * 2 + 2].split("\\.")[0], Integer.parseInt(recipeLine[i * 2 + 2].split("\\.")[1]));
                    else
                        recipe[i * 2 + rows + 1] = getRecipeElement(recipeLine[i * 2 + 2], 0);
                }
                    GameRegistry.addRecipe(new ItemStack(item, recipeOutput), recipe);
            } else {

                recipe = new Object[recipeLine.length - 1];
                for (int i = 0; i < (recipeLine.length - 1); i++) {
                    if (recipeLine[i + 1].contains("."))
                        recipe[i] = getRecipeElement(recipeLine[i + 1].split("\\.")[0], Integer.parseInt(recipeLine[i + 1].split("\\.")[1]));
                    else
                        recipe[i] = getRecipeElement(recipeLine[i + 1], 0);
                }
                GameRegistry.addShapelessRecipe(new ItemStack(item, recipeOutput), recipe);
            }
        } catch (Exception e) {
            FlansMod.log("Failed to add recipe for : " + shortName);
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }

    public static ItemStack getRecipeElement(String s, int damage) {
        return getRecipeElement(s, 1, damage);
    }

    public static ItemStack getRecipeElement(String s, int amount, int damage) {
        return getRecipeElement(s, amount, damage, "nothing");
    }

    public static ItemStack getRecipeElement(String s, int amount, int damage, String requester) {
        if (s.equals("doorIron")) {
            return new ItemStack(Items.iron_door, amount);
        }
        if (s.equals("doorWood")) {
            return new ItemStack(Items.wooden_door, amount);
        }
        if (s.equals("clayItem")) {
            return new ItemStack(Items.clay_ball, amount);
        }
        for (Object object : Item.itemRegistry) {
            Item item = (Item) object;
            if (item != null && item.getUnlocalizedName() != null && (item.getUnlocalizedName().equals("item." + s) || item.getUnlocalizedName().equals("tile." + s))) {
                return new ItemStack(item, amount, damage);
            }
        }
        for (InfoType type : infoTypes) {
            if (type.shortName.equals(s))
                return new ItemStack(type.item, amount, damage);
        }
        if (s.equals("gunpowder")) {
            return new ItemStack(Items.gunpowder, amount);
        }
        if (s.equals("iron")) {
            return new ItemStack(Items.iron_ingot, amount);
        }
        FlansMod.log("Could not find " + s + " when adding recipe for " + requester);
        return null;
    }

    /**
     * Return a dye damage value from a string name
     */
    protected int getDyeDamageValue(String dyeName) {
        int damage = -1;
        for (int i = 0; i < ItemDye.field_150923_a.length; i++) {
            if (ItemDye.field_150923_a[i].equals(dyeName))
                damage = i;
        }
        if (damage == -1)
            FlansMod.log("Failed to find dye colour : " + dyeName + " while adding " + contentPack);

        return damage;
    }

    /**
     * To be overriden by subtypes for model reloading
     */
    public void reloadModel() {

    }

    public static InfoType getType(String s) {
        for (InfoType type : infoTypes) {
            if (type.shortName.equals(s))
                return type;
        }
        return null;
    }

    public void onWorldLoad(World world) {

    }

    public abstract float GetRecommendedScale();

    @SideOnly(Side.CLIENT)
    public abstract ModelBase GetModel();

    public static InfoType getType(ItemStack itemStack) {
        if (itemStack == null)
            return null;
        Item item = itemStack.getItem();
        if (item instanceof IFlanItem)
            return ((IFlanItem) item).getInfoType();
        return null;
    }

    public static PotionEffect getPotionEffect(String[] split) {
        int potionID = Integer.parseInt(split[1]);
        int duration = Integer.parseInt(split[2]);
        int amplifier = Integer.parseInt(split[3]);
        return new PotionEffect(potionID, duration, amplifier, false);
    }

    //TODO: This seems to always return "Material.ground", regardless of the input...
    public static Material getMaterial(String material) {
        return Material.ground;
    }

    @Override
    public String getContentPack() {
        return contentPack;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getShortName() {
        return shortName;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
