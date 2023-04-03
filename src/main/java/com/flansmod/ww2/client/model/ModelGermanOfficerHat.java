//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelGermanOfficerHat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGermanOfficerHat() {
        this.textureX = 512;
        this.textureY = 512;
        (this.headModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo((ModelBase)this, 0, 180, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 126, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 71, 126, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 148, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 125, 127, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 125, 127, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 281, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-11.75f, -7.9f, -4.6f, 150, 68, 1, 0.0f, -10.5f, 0.0f, 0.5f, -137.0f, 0.0f, 0.5f, -137.0f, 0.0f, 0.0f, -10.5f, 0.0f, 0.0f, -10.5f, -67.0f, 0.0f, -137.0f, -67.0f, 0.0f, -137.0f, -67.0f, 0.0f, -10.5f, -67.0f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -7.4f, -4.0f, 16, 2, 16, 0.0f, -0.1f, 0.0f, 0.2f, -8.1f, 0.0f, 0.2f, -8.1f, 0.0f, -7.8f, -0.1f, 0.0f, -7.8f, 0.2f, 0.0f, 0.2f, -7.8f, 0.0f, 0.2f, -7.8f, 0.0f, -7.8f, 0.2f, 0.0f, -7.8f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -8.4f, -4.0f, 16, 2, 16, 0.0f, 1.0f, 0.0f, 1.0f, -7.2f, 0.0f, 1.0f, -7.2f, -0.3f, -7.0f, 1.0f, -0.3f, -7.0f, 0.0f, -0.2f, 0.2f, -8.0f, -0.2f, 0.2f, -8.0f, -0.2f, -7.8f, 0.0f, -0.2f, -7.8f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -5.9f, -5.0f, 16, 1, 16, 0.0f, 0.2f, -0.5f, -0.3f, -7.8f, -0.5f, -0.3f, -7.8f, -0.5f, -6.8f, 0.2f, -0.5f, -6.8f, 0.2f, 0.0f, 0.6f, -7.8f, 0.0f, 0.6f, -7.8f, 0.0f, -6.8f, 0.2f, 0.0f, -6.8f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -6.8f, -4.0f, 8, 1, 8, 0.0f, 0.2f, -0.4f, 0.2f, 0.2f, -0.4f, 0.2f, 0.2f, -0.4f, 0.2f, 0.2f, -0.4f, 0.2f, 0.25f, -0.4f, 0.25f, 0.25f, -0.4f, 0.25f, 0.25f, -0.4f, 0.25f, 0.25f, -0.4f, 0.25f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.0f, -6.3f, -4.0f, 8, 1, 8, 0.0f, 0.2f, -0.4f, 0.2f, 0.2f, -0.4f, 0.2f, 0.2f, -0.4f, 0.2f, 0.2f, -0.4f, 0.2f, 0.25f, -0.4f, 0.25f, 0.25f, -0.4f, 0.25f, 0.25f, -0.4f, 0.25f, 0.25f, -0.4f, 0.25f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-1.6f, -7.0f, -4.3f, 95, 59, 1, 0.0f, 0.0f, 0.0f, 0.0f, -92.0f, 0.0f, 0.0f, -92.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -57.5f, 0.0f, -92.0f, -57.5f, 0.0f, -92.0f, -57.5f, 0.0f, 0.0f, -57.5f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
