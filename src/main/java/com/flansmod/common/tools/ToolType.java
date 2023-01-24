package com.flansmod.common.tools;

import java.util.ArrayList;
import java.util.HashMap;

import com.flansmod.utils.ConfigMap;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.utils.ConfigUtils;

public class ToolType extends InfoType 
{
	public static HashMap<String, ToolType> tools = new HashMap<String, ToolType>();
	
	@SideOnly(value = Side.CLIENT)
	/** The parachute model */
	public ModelBase model;
	
	/** Boolean switches that decide whether the tool should heal players and / or driveables */
	public boolean healPlayers = false, healDriveables = false;
	/** The amount to heal per use (one use per click) */
	public int healAmount = 0;
	/** The amount of uses the tool has. 0 means infinite */
	public int toolLife = 0;
	/** If true, the tool will destroy itself when finished. Disable this for rechargeable tools */
	public boolean destroyOnEmpty = true;
	/** The items required to be added (shapelessly) to recharge the tool */
	public ArrayList<ItemStack> rechargeRecipe = new ArrayList<ItemStack>();
	/** Not yet implemented. For making tools chargeable with IC2 EU */
	public int EUPerCharge = 0;
	/** If true, then this tool will deploy a parachute upon use (and consume itself) */
	public boolean parachute = false;
	/** If true, then this will detonate the least recently placed remote explosive */
	public boolean remote = false;
	/** If > 0, then the player can eat this and recover this much hunger */
	public int foodness = 0;
	public boolean key = false;
	
	public ToolType(TypeFile file) 
	{
		super(file);
	}
	
	@Override
	protected void postRead(TypeFile file)
	{
		tools.put(shortName, this);
	}



	/** Pack reader */
	@Override
	protected void read(ConfigMap config, TypeFile file)
	{
		super.read(config, file);

		if(FMLCommonHandler.instance().getSide().isClient() && config.containsKey("Model"))
			model = FlansMod.proxy.loadModel(config.get("Model"), shortName, ModelBase.class);
		texture = config.get("Texture");
		parachute = ConfigUtils.configBool(config, "Parachute", parachute);
		remote = ConfigUtils.configBool(config, "ExplosiveRemote", remote);
		key = ConfigUtils.configBool(config, "Key", key);
		healPlayers = ConfigUtils.configBool(config, "Heal", "HealPlayers", healPlayers);
		healDriveables = ConfigUtils.configBool(config, "Repair", "RepairVehicles", healDriveables);
		healAmount = ConfigUtils.configInt(config, "HealAmount", "RepairAmount", toolLife);
		toolLife = ConfigUtils.configInt(config, "ToolLife", "ToolUes", toolLife);
		EUPerCharge = ConfigUtils.configInt(config, "EUPerCharge", EUPerCharge);
		if(config.containsKey("RechargeRecipe")) {
			String[] split = ConfigUtils.getSplitFromKey(config, "RechargeRecipe");
			for(int i = 0; i < (split.length - 1) / 2; i++)
			{
				int amount = Integer.parseInt(split[2 * i + 1]);
				boolean damaged = split[2 * i + 2].contains(".");
				String itemName = damaged ? split[2 * i + 2].split("\\.")[0] : split[2 * i + 2];
				int damage = damaged ? Integer.parseInt(split[2 * i + 2].split("\\.")[1]) : 0;
				rechargeRecipe.add(getRecipeElement(itemName, amount, damage, shortName));
			}
		}
		destroyOnEmpty = ConfigUtils.configBool(config, "DestroyOnEmpty", destroyOnEmpty);
		foodness = ConfigUtils.configInt(config, "Food", "Foodness", foodness);
	}
	
	@Override
	public void addRecipe(Item item)
	{
		super.addRecipe(item);
		//Add the recharge recipe if there is one
		if(rechargeRecipe.size() < 1)
			return;
		rechargeRecipe.add(new ItemStack(item, 1, toolLife));
		GameRegistry.addShapelessRecipe(new ItemStack(item, 1, 0), rechargeRecipe.toArray());
	}
	
	public static ToolType getType(String shortName)
	{
		return tools.get(shortName);
	}

	@Override
	protected void preRead(TypeFile file) 
	{
		
	}

	@Override
	public float GetRecommendedScale() 
	{
		return 0.0f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() 
	{
		return null;
	}
}
