//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.ww2.client.model;

import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;
import com.flansmod.client.model.*;

public class ModelMG42Hand extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelMG42Hand() {
        this.textureX = 64;
        this.textureY = 64;
        (this.gunModel = new ModelRendererTurbo[16])[0] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo((ModelBase)this, 9, 17, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(1.0f, -1.3f, -0.5f, 12, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.2f);
        this.gunModel[0].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[1].addShapeBox(-2.0f, -1.3f, -0.5f, 3, 1, 1, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f);
        this.gunModel[1].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[2].addShapeBox(-7.0f, -1.3f, -0.5f, 5, 1, 1, 0.0f, 0.0f, 0.2f, -0.2f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.2f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, -0.2f);
        this.gunModel[2].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[3].addShapeBox(14.0f, -1.3f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.0f, 0.0f);
        this.gunModel[3].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[4].addShapeBox(13.0f, -1.3f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[5].addShapeBox(0.0f, -1.5f, -2.0f, 1, 2, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.gunModel[5].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[6].addShapeBox(0.0f, -1.5f, -1.5f, 1, 2, 1, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f);
        this.gunModel[6].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[7].addShapeBox(12.0f, -2.3f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.gunModel[7].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[8].addShapeBox(2.0f, -2.0f, -1.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f);
        this.gunModel[8].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[9].addShapeBox(-4.9f, -1.8f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[9].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[10].addShapeBox(-9.0f, -1.3f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 1.0f, 0.0f);
        this.gunModel[10].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[11].addShapeBox(-6.0f, 0.2f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f);
        this.gunModel[11].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[12].addShapeBox(1.0f, -1.3f, -0.5f, 12, 1, 1, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f);
        this.gunModel[12].setRotationPoint(4.0f, -2.0f, 0.0f);
        this.gunModel[13].addShapeBox(-1.0f, -1.5f, -2.0f, 2, 3, 4, 0.0f, -1.5f, -1.0f, -1.5f, -1.5f, -1.0f, -1.5f, -1.5f, -1.0f, -1.5f, -1.5f, -1.0f, -1.5f, -1.5f, -1.0f, -1.5f, -1.5f, -1.0f, -1.5f, -1.5f, -1.0f, -1.5f, -1.5f, -1.0f, -1.5f);
        this.gunModel[13].setRotationPoint(15.0f, -2.5f, 0.0f);
        this.gunModel[13].rotateAngleZ = 0.29670596f;
        this.gunModel[14].addShapeBox(-1.0f, 0.5f, -2.0f, 2, 3, 4, 0.0f, -0.8f, 0.0f, -1.8f, -0.8f, 0.0f, -1.8f, -0.8f, 0.0f, -1.8f, -0.8f, 0.0f, -1.8f, -0.8f, 2.0f, -1.8f, -0.8f, 2.0f, -1.8f, -0.8f, 2.0f, -1.8f, -0.8f, 2.0f, -1.8f);
        this.gunModel[14].setRotationPoint(15.0f, -2.25f, 0.0f);
        this.gunModel[14].rotateAngleY = -0.34906584f;
        this.gunModel[14].rotateAngleZ = -1.3089969f;
        this.gunModel[15].addShapeBox(-1.0f, 0.5f, -2.0f, 2, 3, 4, 0.0f, -0.8f, 0.0f, -1.8f, -0.8f, 0.0f, -1.8f, -0.8f, 0.0f, -1.8f, -0.8f, 0.0f, -1.8f, -0.8f, 2.0f, -1.8f, -0.8f, 2.0f, -1.8f, -0.8f, 2.0f, -1.8f, -0.8f, 2.0f, -1.8f);
        this.gunModel[15].setRotationPoint(15.0f, -2.25f, 0.0f);
        this.gunModel[15].rotateAngleY = 0.34906584f;
        this.gunModel[15].rotateAngleZ = -1.3089969f;
        (this.ammoModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.ammoModel[0].addShapeBox(2.5f, -2.8f, 1.0f, 2, 3, 4, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.ammoModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ammoModel[1].addShapeBox(2.5f, -3.5f, 0.4f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ammoModel[2].addShapeBox(2.5f, -2.9f, 1.0f, 2, 3, 4, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.ammoModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.animationType = EnumAnimationType.SIDE_CLIP;
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
