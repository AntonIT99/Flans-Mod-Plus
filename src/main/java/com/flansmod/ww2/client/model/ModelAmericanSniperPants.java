//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelAmericanSniperPants extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelAmericanSniperPants() {
        this.textureX = 256;
        this.textureY = 256;
        (this.leftLegModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 153, 33, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 5, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 5.0f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.rightLegModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 129, 33, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 5, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 5.0f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
