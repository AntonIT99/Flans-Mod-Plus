package com.flansmod.common.driveables;

import java.util.ArrayList;
import java.util.HashMap;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType.ParticleEmitter;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Vector3i;
import com.flansmod.utils.ConfigMap;
import com.flansmod.utils.ConfigUtils;

public class VehicleType extends DriveableType {
    /**
     * Movement modifiers
     */
    public float turnLeftModifier = 1F, turnRightModifier = 1F;
    /**
     * If true, this will crush any living entity under the wheels
     */
    public boolean squashMobs = false;
    /**
     * If this is true, the vehicle will drive from all wheels
     */
    public boolean fourWheelDrive = false;
    /**
     * If true, then wheels will rotate as the vehicle drives
     */
    public boolean rotateWheels = false;
    /**
     * Tank movement system. Uses track collision box for thrust, rather than the wheels
     */
    public boolean tank = false;

    /**
     * Amount to decrease throttle by each tick.
     */
    public float throttleDecay = 0.0035F;

    /**
     * Shoot delays
     */
    public int vehicleShootDelay, vehicleShellDelay;
    /**
     * Aesthetic door variable
     */
    public boolean hasDoor = false;
    /**
     * Mass of the vehicle, for use in realistic acceleration calculation
     */
    public float mass = 1000F;

    public boolean useRealisticAcceleration = false;

    // Braking modifier.
    public float brakingModifier = 1;

    public float maxFallSpeed = 0.85F;
    public float gravity = 0.175F;

    //Door animations
    public Vector3f doorPos1 = new Vector3f(0, 0, 0);
    public Vector3f doorPos2 = new Vector3f(0, 0, 0);
    public Vector3f doorRot1 = new Vector3f(0, 0, 0);
    public Vector3f doorRot2 = new Vector3f(0, 0, 0);
    public Vector3f doorRate = new Vector3f(0, 0, 0);
    public Vector3f doorRotRate = new Vector3f(0, 0, 0);
    public Vector3f door2Pos1 = new Vector3f(0, 0, 0);
    public Vector3f door2Pos2 = new Vector3f(0, 0, 0);
    public Vector3f door2Rot1 = new Vector3f(0, 0, 0);
    public Vector3f door2Rot2 = new Vector3f(0, 0, 0);
    public Vector3f door2Rate = new Vector3f(0, 0, 0);
    public Vector3f door2RotRate = new Vector3f(0, 0, 0);
    public boolean shootWithOpenDoor = false;

    public int trackLinkFix = 5;
    public boolean flipLinkFix = false;

    public String driftSound = "";
    public int driftSoundLength;

    public ArrayList<SmokePoint> smokers = new ArrayList<SmokePoint>();
    public static ArrayList<VehicleType> types = new ArrayList<VehicleType>();

    public VehicleType(TypeFile file) {
        super(file);
        types.add(this);
    }

    @Override
    public void preRead(TypeFile file) {
        super.preRead(file);
        wheelPositions = new DriveablePosition[4];
    }

    @Override
    public void postRead(TypeFile file) {
        super.postRead(file);
    }

    @Override
    protected void read(ConfigMap config, TypeFile file) {
        super.read(config, file);
        try {
            //Movement modifiers
            turnLeftModifier = ConfigUtils.configFloat(config,"TurnLeftSpeed", turnLeftModifier);
            turnRightModifier = ConfigUtils.configFloat(config,"TurnRightSpeed", turnRightModifier);
            squashMobs = ConfigUtils.configBool(config,"SquashMobs", squashMobs);
            fourWheelDrive = ConfigUtils.configBool(config,"FourWheelDrive", fourWheelDrive);
            tank = ConfigUtils.configBool(config,"Tank", "TankMode", tank);
            throttleDecay = ConfigUtils.configFloat(config,"ThrottleDecay", throttleDecay);
            mass = ConfigUtils.configFloat(config,"Mass", mass);
            useRealisticAcceleration = ConfigUtils.configBool(config,"UseRealisticAcceleration", useRealisticAcceleration);
            gravity = ConfigUtils.configFloat(config,"Gravity", gravity);
            maxFallSpeed = ConfigUtils.configFloat(config,"MaxFallSpeed", maxFallSpeed);
            brakingModifier = ConfigUtils.configFloat(config,"BrakingModifier", brakingModifier);

            //Visuals
            hasDoor = ConfigUtils.configBool(config,"HasDoor", hasDoor);
            shootWithOpenDoor = ConfigUtils.configBool(config,"ShootWithOpenDoor", shootWithOpenDoor);
            rotateWheels = ConfigUtils.configBool(config,"RotateWheels", rotateWheels);
            trackLinkFix = ConfigUtils.configInt(config,"FixTrackLink", trackLinkFix);
            flipLinkFix = ConfigUtils.configBool(config,"FlipLinkFix", flipLinkFix);

            //Animations
            ConfigUtils.configVector(config, "DoorPosition1", doorPos1, shortName);
            ConfigUtils.configVector(config, "DoorPosition2", doorPos2, shortName);
            ConfigUtils.configVector(config, "DoorRotation1", doorRot1, shortName);
            ConfigUtils.configVector(config, "DoorRotation2", doorRot2, shortName);
            ConfigUtils.configVector(config, "DoorRate", doorRate, shortName);
            ConfigUtils.configVector(config, "DoorRotRate", doorRotRate, shortName);

            ConfigUtils.configVector(config, "Door2Position1", door2Pos1, shortName);
            ConfigUtils.configVector(config, "Door2Position2", door2Pos2, shortName);
            ConfigUtils.configVector(config, "Door2Rotation1", door2Rot1, shortName);
            ConfigUtils.configVector(config, "Door2Rotation2", door2Rot2, shortName);
            ConfigUtils.configVector(config, "Door2Rate", door2Rate, shortName);
            ConfigUtils.configVector(config, "Door2RotRate", door2RotRate, shortName);


            //Armaments
            vehicleShootDelay = ConfigUtils.configInt(config,"ShootDelay", vehicleShootDelay);
            vehicleShellDelay = ConfigUtils.configInt(config,"ShellDelay", vehicleShellDelay);

            //Sound
            shootSoundPrimary = ConfigUtils.configDriveableSound(contentPack, config, "ShootSound", shootSoundPrimary);
            shootSoundSecondary = ConfigUtils.configDriveableSound(contentPack, config, "ShellSound", shootSoundSecondary);
            driftSoundLength = ConfigUtils.configInt(config,"DriftSoundLength", driftSoundLength);
            driftSound = ConfigUtils.configDriveableSound(contentPack, config, "DriftSound", driftSound);
            if (config.containsKey("AddSmokePoint") || config.containsKey("AddSmokeDispenser")) {
                String key = "AddSmokePoint";
                if (config.containsKey("AddSmokeDispenser"))
                    key = "AddSmokeDispenser";
                String[] split = ConfigUtils.getSplitFromKey(config, key);
                SmokePoint smoke = new SmokePoint();
                smoke.position = new Vector3f(split[1], shortName);
                smoke.direction = new Vector3f(split[2], shortName);
                smoke.detTime = Integer.parseInt(split[3]);
                smoke.part = split[4];
                smokers.add(smoke);
            }
        } catch (Exception ignored) {
        }
    }

    public static VehicleType getVehicle(String find) {
        for (VehicleType type : types) {
            if (type.shortName.equals(find))
                return type;
        }
        return null;
    }

    public class SmokePoint {
        public Vector3f position;
        public Vector3f direction;
        public int detTime;
        public String part;
    }

    /**
     * To be overriden by subtypes for model reloading
     */
    public void reloadModel() {
        model = FlansMod.proxy.loadModel(modelString, shortName, ModelVehicle.class);
    }
}