//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelGermanSniperPants extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGermanSniperPants() {
        this.textureX = 256;
        this.textureY = 256;
        (this.bodyModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(2.3f, 1.3f, -2.2f, 8, 13, 1, 0.0f, 0.0f, 1.5f, 0.1f, -7.0f, 1.5f, 0.1f, -7.0f, 1.5f, 0.1f, 0.0f, 1.5f, 0.1f, 0.0f, -5.7f, 0.1f, -7.0f, -5.7f, 0.1f, -7.0f, -5.7f, 0.1f, 0.0f, -5.7f, 0.1f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(2.3f, 1.3f, 1.2f, 8, 13, 1, 0.0f, 0.0f, 1.5f, 0.1f, -7.0f, 1.5f, 0.1f, -7.0f, 1.5f, 0.1f, 0.0f, 1.5f, 0.1f, 0.0f, -5.7f, 0.1f, -7.0f, -5.7f, 0.1f, -7.0f, -5.7f, 0.1f, 0.0f, -5.7f, 0.1f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-3.3f, 1.3f, 1.2f, 8, 13, 1, 0.0f, 0.0f, 1.5f, 0.1f, -7.0f, 1.5f, 0.1f, -7.0f, 1.5f, 0.1f, 0.0f, 1.5f, 0.1f, 0.0f, -5.7f, 0.1f, -7.0f, -5.7f, 0.1f, -7.0f, -5.7f, 0.1f, 0.0f, -5.7f, 0.1f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-3.3f, 1.3f, -2.2f, 8, 13, 1, 0.0f, 0.0f, 1.5f, 0.1f, -7.0f, 1.5f, 0.1f, -7.0f, 1.5f, 0.1f, 0.0f, 1.5f, 0.1f, 0.0f, -5.7f, 0.1f, -7.0f, -5.7f, 0.1f, -7.0f, -5.7f, 0.1f, 0.0f, -5.7f, 0.1f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-3.3f, -6.7f, -0.5f, 8, 13, 1, 0.0f, 0.0f, -6.0f, 1.8f, -7.0f, -6.0f, 1.8f, -7.0f, -6.0f, 1.8f, 0.0f, -6.0f, 1.8f, 0.0f, -6.0f, 1.8f, -7.0f, -6.0f, 1.8f, -7.0f, -6.0f, 1.8f, 0.0f, -6.0f, 1.8f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(2.3f, -6.7f, -0.5f, 8, 13, 1, 0.0f, 0.0f, -6.0f, 1.8f, -7.0f, -6.0f, 1.8f, -7.0f, -6.0f, 1.8f, 0.0f, -6.0f, 1.8f, 0.0f, -6.0f, 1.8f, -7.0f, -6.0f, 1.8f, -7.0f, -6.0f, 1.8f, 0.0f, -6.0f, 1.8f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel = new ModelRendererTurbo[1];
        (this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY)).addShapeBox(-2.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f, 0.2f, 2.0f, 0.2f, 0.2f, 2.0f, 0.2f, 0.2f, 2.0f, 0.2f, 0.2f, 2.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel = new ModelRendererTurbo[1];
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY)).addShapeBox(-2.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f, 0.2f, 2.0f, 0.2f, 0.2f, 2.0f, 0.2f, 0.2f, 2.0f, 0.2f, 0.2f, 2.0f, 0.2f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
