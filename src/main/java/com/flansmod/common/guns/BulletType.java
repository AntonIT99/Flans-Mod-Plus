package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.flansmod.utils.ConfigMap;
import com.flansmod.utils.ConfigUtils;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.guns.boxes.BlockGunBox;



public class BulletType extends ShootableType
{
	public float speedMultiplier = 1F;
	/** The number of flak particles to spawn upon exploding */
	public int flak = 0;
	/** The type of flak particles to spawn */
	public String flakParticles = "largesmoke";

	/** If true then this bullet will burn entites it hits */
	public boolean setEntitiesOnFire = false;

	/** If > 0 this will act like a mine and explode when a living entity comes within this radius of the grenade */
	public float livingProximityTrigger = -1F;
	/** If > 0 this will act like a mine and explode when a driveable comes within this radius of the grenade */
	public float driveableProximityTrigger = -1F;
	/** How much damage to deal to the entity that triggered it */
	public float damageToTriggerer = 0F;
	/** Detonation will not occur until after this time */
	public int primeDelay = 0;
	/** Particles given off in the detonation */
	public int explodeParticles = 0;
	public String explodeParticleType = "largesmoke";

	/** Exclusively for driveable usage. Replaces old isBomb and isShell booleans with something more flexible */
	public EnumWeaponType weaponType = EnumWeaponType.NONE;

	public String hitSound;
	public float hitSoundRange;
	public boolean hitSoundEnable = false;
	public boolean entityHitSoundEnable = false;

	public float penetratingPower = 1F;
	// In % of penetration to remove per tick.
	public float penetrationDecay = 0F;
	// Knocback modifier. less gives less kb, more gives more kb, 1 = normal kb.
	public float knockbackModifier;
	/** Lock on variables. If true, then the bullet will search for a target at the moment it is fired */
	public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;
	/** Lock on maximum angle for finding a target */
	public float maxLockOnAngle = 45F;
	/** Lock on force that pulls the bullet towards its prey */
	public float lockOnForce = 1F;
	public int maxDegreeOfMissile = 20;
	public int tickStartHoming = 5;
	public boolean enableSACLOS = false;
	public int maxDegreeOfSACLOS = 5;
	public int maxRangeOfMissile = 150;
	//public int maxDegreeOfMissileXAxis = 10;
	//public int maxDegreeOfMissileYAxis = 10;
	//public int maxDegreeOfMissileZAxis = 10;

	public boolean manualGuidance = false;
	public int lockOnFuse = 10;

	public ArrayList<PotionEffect> hitEffects = new ArrayList<PotionEffect>();

	/** Number of bullets to fire per shot if allowNumBulletsByBulletType = true */
	public int numBullets = -1;
	/** Ammo based spread setting if allowSpreadByBullet = true */
	public float bulletSpread = -1;

	public float dragInAir   = 0.99F;
	public float dragInWater = 0.80F;

	public boolean canSpotEntityDriveable = false;

	public int maxRange = -1;

	public boolean shootForSettingPos = false;
	public int shootForSettingPosHeight = 100;

	public boolean isDoTopAttack = false;
	
	
	//Smoke
	/** Time to remain after detonation */
	public int smokeTime = 0;
	/** Particles given off after detonation */
	
	public String smokeParticleType = "explode";
	/** The effects to be given to people coming too close */
	
	public ArrayList<PotionEffect> smokeEffects = new ArrayList<PotionEffect>();
	/** The radius for smoke effects to take place in */
	
	public float smokeRadius = 5F;
	public boolean TVguide = true;
	
	//Other stuff
	public boolean VLS = false;
	public int VLSTime = 0;
	public boolean fixedDirection = false;
	public float turnRadius = 3;
	public String boostPhaseParticle;
	public float trackPhaseSpeed = 2;
	public float trackPhaseTurn = 0.2F;
	
	public boolean torpedo = false;

	public boolean fancyDescription = true;
	
	public boolean laserGuidance = false;

	/** The static bullets list */
	
	public static List<BulletType> bullets = new ArrayList<BulletType>();

	public BulletType(TypeFile file)
	{
		super(file);
		texture = "defaultBullet";
		bounciness = 0f;
		bullets.add(this);
	}

	@Override
	protected void read(ConfigMap config, TypeFile file) {
		super.read(config, file);
		try {
			flak = ConfigUtils.configInt(config, "FlakParticles", flak);
			flakParticles = ConfigUtils.configString(config, "FlakParticleType", flakParticles);
			setEntitiesOnFire = ConfigUtils.configBool(config, "SetEntitiesOnFire", setEntitiesOnFire);
			hitSoundEnable = ConfigUtils.configBool(config, "HitSoundEnable", hitSoundEnable);
			entityHitSoundEnable = ConfigUtils.configBool(config, "EntityHitSoundEnable", entityHitSoundEnable);
			hitSound = ConfigUtils.configSound(contentPack, config, "HitSound", hitSound);
			hitSoundRange = ConfigUtils.configFloat(config, "HitSoundRange", hitSoundRange);
			//Dont know why its like this
			if (config.containsKey("Penetrates")) {
				boolean pens = Boolean.parseBoolean(config.get("Penetrates"));
				penetratingPower = pens ? 1F : 0.7F;
			}
			penetratingPower = ConfigUtils.configFloat(config, "Penetration", "PenetratingPower", penetratingPower);
			penetrationDecay = ConfigUtils.configFloat(config, "PenetrationDecay", penetrationDecay);
			dragInAir = ConfigUtils.configFloat(config, "DragInAir", dragInAir);
			dragInAir = dragInAir<0? 0: dragInAir>1? 1: dragInAir;
			dragInWater = ConfigUtils.configFloat(config, "DragInWater", dragInWater);
			dragInWater = dragInWater<0? 0: dragInWater>1? 1: dragInWater;
			numBullets = ConfigUtils.configInt(config, "NumBullets", numBullets);
			bulletSpread = ConfigUtils.configFloat(config, "Accuracy", "Spread", bulletSpread);
			livingProximityTrigger = ConfigUtils.configFloat(config, "LivingProximityTrigger", livingProximityTrigger);
			driveableProximityTrigger = ConfigUtils.configFloat(config, "VehicleProximityTrigger", driveableProximityTrigger);
			damageToTriggerer = ConfigUtils.configFloat(config, "DamageToTriggerer", damageToTriggerer);
			primeDelay = ConfigUtils.configInt(config, "PrimeDelay", "TriggerDelay", primeDelay);
			explodeParticles = ConfigUtils.configInt(config, "NumExplodeParticles", explodeParticles);
			explodeParticleType = ConfigUtils.configString(config, "ExplodeParticles", explodeParticleType);
			smokeTime = ConfigUtils.configInt(config, "SmokeTime", smokeTime);
			smokeParticleType = ConfigUtils.configString(config, "SmokeParticles", smokeParticleType);
			//todo this is prob broken
			if (config.containsKey("SmokeEffect"))
				smokeEffects.add(getPotionEffect(ConfigUtils.getSplitFromKey(config, "SmokeEffect")));
//			else if(split[0].equals("SmokeEffect"))
//				smokeEffects.add(getPotionEffect(split));

			smokeRadius = ConfigUtils.configFloat(config, "SmokeRadius", smokeRadius);
			VLS = ConfigUtils.configBool(config, "VLS", "HasDeadZone", VLS);
			VLSTime = ConfigUtils.configInt(config, "DeadZoneTime", VLSTime);
			fixedDirection = ConfigUtils.configBool(config, "FixedTrackDirection", fixedDirection);
			turnRadius = ConfigUtils.configFloat(config, "GuidedTurnRadius", turnRadius);
			trackPhaseSpeed = ConfigUtils.configFloat(config, "GuidedPhaseSpeed", trackPhaseSpeed);
			trackPhaseTurn = ConfigUtils.configFloat(config, "GuidedPhaseTurnSpeed", trackPhaseTurn);
			boostPhaseParticle = ConfigUtils.configString(config, "BoostParticle", boostPhaseParticle);
			torpedo = ConfigUtils.configBool(config, "Torpedo", torpedo);
			if (config.containsKey("Bomb"))
				weaponType = EnumWeaponType.BOMB;
			if (config.containsKey("Shell"))
				weaponType = EnumWeaponType.SHELL;
			if (config.containsKey("Missile"))
				weaponType = EnumWeaponType.MISSILE;
			if (config.containsKey("WeaponType"))
				weaponType = EnumWeaponType.valueOf(config.get("WeaponType").toUpperCase());
			if (config.containsKey("LockOnToDriveables"))
				lockOnToPlanes = lockOnToVehicles = lockOnToMechas = Boolean.parseBoolean(config.get("LockOnToDriveables").toLowerCase());
			lockOnToVehicles = ConfigUtils.configBool(config, "LockOnToVehicles", lockOnToVehicles);
			lockOnToPlanes = ConfigUtils.configBool(config, "LockOnToPlanes", lockOnToPlanes);
			lockOnToMechas = ConfigUtils.configBool(config, "LockOnToMechas", lockOnToMechas);
			lockOnToPlayers = ConfigUtils.configBool(config, "LockOnToPlayers", lockOnToPlayers);
			lockOnToLivings = ConfigUtils.configBool(config, "LockOnToLivings", lockOnToLivings);
			maxLockOnAngle = ConfigUtils.configFloat(config, "MaxLockOnAngle", maxLockOnAngle);
			lockOnForce = ConfigUtils.configFloat(config, "LockOnForce", "TurningForce", lockOnForce);
			maxDegreeOfMissile = ConfigUtils.configInt(config, "MaxDegreeOfLockOnMissile", maxDegreeOfMissile);
			tickStartHoming = ConfigUtils.configInt(config, "TickStartHoming", tickStartHoming);
			enableSACLOS = ConfigUtils.configBool(config, "EnableSACLOS", enableSACLOS);
			maxDegreeOfSACLOS = ConfigUtils.configInt(config, "MaxDegreeOFSACLOS", maxDegreeOfSACLOS);
			maxRangeOfMissile = ConfigUtils.configInt(config, "MaxRangeOfMissile", maxRangeOfMissile);
			canSpotEntityDriveable = ConfigUtils.configBool(config, "CanSpotEntityDriveable", canSpotEntityDriveable);
			shootForSettingPos = ConfigUtils.configBool(config, "ShootForSettingPos", shootForSettingPos);
			shootForSettingPosHeight = ConfigUtils.configInt(config, "ShootForSettingPosHeight", shootForSettingPosHeight);
			isDoTopAttack = ConfigUtils.configBool(config, "IsDoTopAttack", isDoTopAttack);
			knockbackModifier = ConfigUtils.configFloat(config, "KnockbackModifier", knockbackModifier);
			if (config.containsKey("PotionEffect"))
				hitEffects.add(getPotionEffect(ConfigUtils.getSplitFromKey(config, "PotionEffect")));
			//todo verify
//			else if(split[0].equals("PotionEffect"))
//				hitEffects.add(getPotionEffect(split));

			manualGuidance = ConfigUtils.configBool(config, "ManualGuidance", manualGuidance);
			laserGuidance = ConfigUtils.configBool(config, "LaserGuidance", laserGuidance);
			lockOnFuse = ConfigUtils.configInt(config, "LockOnFuse", lockOnFuse);
			maxRange = ConfigUtils.configInt(config, "MaxRange", maxRange);
			fancyDescription = ConfigUtils.configBool(config, "FancyDescription", fancyDescription);
			speedMultiplier = ConfigUtils.configFloat(config, "BulletSpeedMultiplier", speedMultiplier);

		} catch (Exception e) {
			FlansMod.log("Reading bullet file failed.");
			if(FlansMod.printStackTrace)
				e.printStackTrace();
		}
	}

	public static BulletType getBullet(String s)
	{
		for(BulletType bullet : bullets)
		{
			if(bullet.shortName.equals(s))
				return bullet;
		}
		return null;
	}

	public static BulletType getBullet(Item item)
	{
		for(BulletType bullet : bullets)
		{
			if(bullet.item == item)
				return bullet;
		}
		return null;
	}

	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelBase.class);
	}
}
