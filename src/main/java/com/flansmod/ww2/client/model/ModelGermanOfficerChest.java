//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.ww2.client.model;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelGermanOfficerChest extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGermanOfficerChest() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 133, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 159, 12, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 159, 12, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 159, 12, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 159, 12, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 159, 12, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 159, 12, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.5f, 0.0f, -2.0f, 16, 18, 4, 0.0f, 0.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, -6.0f, 0.1f, -7.0f, -6.0f, 0.1f, -7.0f, -6.0f, 0.1f, 0.0f, -6.0f, 0.1f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.5f, 0.0f, -2.0f, 16, 18, 4, 0.0f, 0.45f, 0.55f, 0.3f, -6.7f, 0.55f, 0.3f, -6.7f, 0.55f, 0.3f, 0.45f, 0.55f, 0.3f, 0.45f, -5.3f, 0.3f, -6.7f, -5.3f, 0.3f, -6.7f, -5.3f, 0.35f, 0.45f, -5.3f, 0.35f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, -1.0f, -2.0f, 2, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(2.0f, -1.0f, -2.0f, 2, 1, 4, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.5f, 1.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, -1.0f, -3.0f, 2, 1, 1, 0.0f, -0.5f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.5f, 1.0f, -0.5f, -0.5f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(2.0f, -1.0f, -3.0f, 2, 1, 1, 0.0f, -1.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 1.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-5.0f, -0.5f, -3.0f, 3, 4, 1, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(2.0f, -0.5f, -3.0f, 3, 4, 1, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.leftArmModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 89, 65, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 184, 1, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, 7.8f, -2.0f, 4, 1, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(0.2f, -2.8f, -0.5f, 2, 1, 1, 0.0f, 0.4f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-1.0f, -2.2f, -2.0f, 8, 15, 4, 0.0f, 0.2f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, 0.2f, 0.0f, 0.15f, 0.2f, -5.0f, 0.15f, -3.8f, -5.0f, 0.15f, -3.8f, -5.0f, 0.15f, 0.2f, -5.0f, 0.15f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-1.0f, -2.2f, -2.0f, 8, 15, 4, 0.0f, 0.5f, 0.3f, 0.45f, -3.5f, 0.3f, 0.45f, -3.5f, 0.3f, 0.45f, 0.5f, 0.3f, 0.45f, 0.5f, -5.5f, 0.45f, -3.5f, -5.5f, 0.45f, -3.5f, -5.5f, 0.45f, 0.5f, -5.5f, 0.45f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.rightArmModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 65, 65, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 184, 1, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.2f, -2.0f, 8, 15, 4, 0.0f, 0.2f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, 0.2f, 0.0f, 0.15f, 0.2f, -5.0f, 0.15f, -3.8f, -5.0f, 0.15f, -3.8f, -5.0f, 0.15f, 0.2f, -5.0f, 0.15f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 7.8f, -2.0f, 4, 1, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-2.2f, -2.8f, -0.5f, 2, 1, 1, 0.0f, 0.1f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, -2.2f, -2.0f, 8, 15, 4, 0.0f, 0.5f, 0.3f, 0.45f, -3.5f, 0.3f, 0.45f, -3.5f, 0.3f, 0.45f, 0.5f, 0.3f, 0.45f, 0.5f, -5.5f, 0.45f, -3.5f, -5.5f, 0.45f, -3.5f, -5.5f, 0.45f, 0.5f, -5.5f, 0.45f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel = new ModelRendererTurbo[1];
        (this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 133, 49, this.textureX, this.textureY)).addShapeBox(-1.5f, 1.1f, -2.0f, 11, 15, 4, 0.0f, 0.5f, 0.6f, 0.3f, -6.5f, 0.6f, 0.3f, -6.5f, 0.6f, 0.3f, 0.5f, 0.6f, 0.3f, 0.5f, -5.3f, 0.5f, -6.5f, -5.3f, 0.5f, -6.5f, -5.3f, 0.5f, 0.5f, -5.3f, 0.5f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel = new ModelRendererTurbo[1];
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 133, 29, this.textureX, this.textureY)).addShapeBox(-2.5f, 1.1f, -2.0f, 11, 15, 4, 0.0f, 0.5f, 0.6f, 0.3f, -6.5f, 0.6f, 0.3f, -6.5f, 0.6f, 0.3f, 0.5f, 0.6f, 0.3f, 0.5f, -5.3f, 0.5f, -6.5f, -5.3f, 0.5f, -6.5f, -5.3f, 0.5f, 0.5f, -5.3f, 0.5f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
