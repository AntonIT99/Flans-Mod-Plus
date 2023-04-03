//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.ww2.client.model;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelGermanSniperHat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGermanSniperHat() {
        this.textureX = 256;
        this.textureY = 256;
        (this.headModel = new ModelRendererTurbo[9])[0] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 175, 54, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 6, 87, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 225, 41, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 129, 49, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -6.0f, -6.0f, 8, 1, 2, 0.0f, 0.0f, -0.5f, -2.0f, 0.0f, -0.5f, -2.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -8.0f, -4.0f, 16, 3, 16, 0.0f, 0.1f, 0.0f, 0.1f, -7.9f, 0.0f, 0.1f, -7.9f, 0.0f, -7.9f, 0.1f, 0.0f, -7.9f, 0.1f, 0.0f, 0.1f, -7.9f, 0.0f, 0.1f, -7.9f, 0.0f, -7.9f, 0.1f, 0.0f, -7.9f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-11.75f, -7.7f, -4.3f, 150, 68, 1, 0.0f, -10.5f, 0.0f, 0.0f, -137.0f, 0.0f, 0.0f, -137.0f, 0.0f, 0.0f, -10.5f, 0.0f, 0.0f, -10.5f, -67.0f, 0.0f, -137.0f, -67.0f, 0.0f, -137.0f, -67.0f, 0.0f, -10.5f, -67.0f, 0.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -8.26f, -4.5f, 8, 3, 1, 0.0f, 0.3f, -0.5f, -0.3f, 0.3f, -0.5f, -0.3f, 0.3f, -0.5f, -0.3f, 0.3f, -0.5f, -0.3f, 0.3f, 0.0f, -0.3f, 0.3f, 0.0f, -0.3f, 0.3f, 0.0f, -0.3f, 0.3f, 0.0f, -0.3f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -8.26f, -4.1f, 1, 3, 7, 0.0f, 0.3f, -0.5f, -0.3f, -0.7f, -0.5f, -0.3f, -0.7f, -0.5f, -0.3f, 0.3f, -0.5f, -0.3f, 0.3f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, 0.3f, 0.0f, -0.3f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(4.0f, -8.26f, -4.1f, 1, 3, 7, 0.0f, 0.3f, -0.5f, -0.3f, -0.7f, -0.5f, -0.3f, -0.7f, -0.5f, -0.3f, 0.3f, -0.5f, -0.3f, 0.3f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, 0.3f, 0.0f, -0.3f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-0.5f, -6.4f, -4.3f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-0.5f, -6.9f, -4.3f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.0f, -9.0f, -4.0f, 8, 1, 8, 0.0f, -0.9f, -0.5f, -0.9f, -0.9f, -0.5f, -0.9f, -0.9f, -0.5f, -0.9f, -0.9f, -0.5f, -0.9f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
