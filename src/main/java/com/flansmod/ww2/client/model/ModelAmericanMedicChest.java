//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.ww2.client.model;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelAmericanMedicChest extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelAmericanMedicChest() {
        this.textureX = 256;
        this.textureY = 256;
        (this.bodyModel = new ModelRendererTurbo[27])[0] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 185, 25, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 233, 25, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 153, 33, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 177, 41, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 209, 41, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 73, 49, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 97, 49, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 249, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 185, 9, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 193, 9, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 249, 9, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 121, 49, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 153, 49, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 153, 17, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 193, 17, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 249, 17, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 137, 25, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 153, 25, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.5f, 0.0f, -2.0f, 16, 18, 4, 0.0f, 0.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, -6.0f, 0.1f, -7.0f, -6.0f, 0.1f, -7.0f, -6.0f, 0.1f, 0.0f, -6.0f, 0.1f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.5f, 9.6f, -2.2f, 16, 8, 5, 0.0f, 0.1f, 0.0f, 0.1f, -6.9f, 0.0f, 0.1f, -6.9f, 0.0f, -0.51f, 0.1f, 0.0f, -0.5f, 0.1f, -6.7f, 0.1f, -6.9f, -6.7f, 0.1f, -6.9f, -6.7f, -0.5f, 0.1f, -6.7f, -0.5f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-3.3f, 1.6f, -2.2f, 8, 15, 1, 0.0f, 0.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-3.3f, 0.3f, -2.2f, 8, 8, 1, 0.0f, 0.0f, 0.0f, 0.2f, -7.0f, 0.0f, 0.2f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.2f, -7.0f, -6.7f, 0.2f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(2.3f, 1.6f, -2.2f, 8, 15, 1, 0.0f, 0.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-3.3f, 0.0f, -2.2f, 8, 7, 5, 0.0f, 0.0f, 0.2f, 0.1f, -7.0f, 0.2f, 0.1f, -7.0f, 0.2f, -0.6f, 0.0f, 0.2f, -0.6f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, -0.6f, 0.0f, -6.7f, -0.6f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(2.3f, 0.0f, -2.2f, 8, 7, 5, 0.0f, 0.0f, 0.2f, 0.1f, -7.0f, 0.2f, 0.1f, -7.0f, 0.2f, -0.6f, 0.0f, 0.2f, -0.6f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, -0.6f, 0.0f, -6.7f, -0.6f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-4.7f, 0.4f, 1.8f, 8, 16, 1, 0.0f, -7.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, -0.6f, -7.0f, 0.1f, -0.6f, -6.0f, -6.0f, 0.1f, -1.0f, -6.0f, 0.1f, -1.0f, -6.0f, -0.6f, -6.0f, -6.0f, -0.6f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-3.3f, 0.4f, 1.8f, 8, 16, 1, 0.0f, 0.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, -7.0f, 0.1f, -0.6f, 0.0f, 0.1f, -0.6f, -1.0f, -6.0f, 0.1f, -6.0f, -6.0f, 0.1f, -6.0f, -6.0f, -0.6f, -1.0f, -6.0f, -0.6f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-3.5f, 1.0f, 4.2f, 7, 7, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-3.5f, 1.0f, 2.2f, 7, 7, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-3.5f, 0.0f, 2.5f, 7, 5, 3, 0.0f, 0.05f, 0.0f, 0.3f, 0.05f, 0.0f, 0.3f, 0.05f, -1.0f, 0.0f, 0.05f, -1.0f, 0.0f, 0.05f, 0.0f, 0.3f, 0.05f, 0.0f, 0.3f, 0.05f, -1.0f, 0.0f, 0.05f, -1.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-3.0f, 2.0f, 4.6f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-3.0f, 4.0f, 4.6f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(2.0f, 4.0f, 4.6f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(2.0f, 2.0f, 4.6f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(2.0f, 5.0f, 4.6f, 1, 1, 1, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-3.0f, 5.0f, 4.6f, 1, 1, 1, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(2.3f, 0.3f, -2.2f, 8, 8, 1, 0.0f, 0.0f, 0.0f, 0.2f, -7.0f, 0.0f, 0.2f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.2f, -7.0f, -6.7f, 0.2f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addBox(-4.0f, 9.0f, 2.0f, 3, 3, 2, 0.0f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addBox(-3.0f, 8.5f, 2.5f, 1, 1, 1, 0.0f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-3.3f, 0.3f, -2.2f, 3, 2, 1, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-0.3f, 1.0f, -2.25f, 3, 2, 1, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(-0.5f, 3.7f, -1.8f, 1, 1, 1, 0.0f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(-0.5f, 5.7f, -1.8f, 1, 1, 1, 0.0f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(-0.5f, 7.7f, -1.8f, 1, 1, 1, 0.0f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-1.0f, 2.7f, -1.8f, 1, 7, 1, 0.0f, -0.4f, -0.2f, 0.35f, -0.4f, -0.2f, 0.35f, -0.4f, -0.2f, 0.35f, -0.4f, -0.2f, 0.35f, -0.4f, -0.2f, 0.35f, -0.4f, -0.2f, 0.35f, -0.4f, -0.2f, 0.35f, -0.4f, -0.2f, 0.35f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.leftArmModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 70, 93, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 153, 57, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 161, 9, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(3.2f, -1.1f, -1.0f, 4, 92, 69, 0.0f, 0.1f, 0.0f, 0.15f, -3.85f, 0.0f, 0.15f, -3.85f, 0.0f, -66.85f, 0.1f, 0.0f, -66.85f, 0.15f, -89.0f, 0.15f, -3.85f, -89.0f, 0.15f, -3.85f, -89.0f, -66.85f, 0.15f, -89.0f, -66.85f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(2.1f, 4.7f, -1.5f, 1, 1, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(2.1f, 4.7f, -0.8f, 1, 1, 1, 0.0f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-1.1f, 5.9f, -2.0f, 8, 1, 4, 0.0f, 0.2f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, 0.2f, 0.0f, 0.15f, 0.0f, 0.0f, 0.15f, -3.9f, 0.0f, 0.15f, -3.9f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(-1.1f, -2.1f, -2.0f, 8, 15, 4, 0.0f, 0.1f, 0.2f, 0.15f, -3.8f, 0.2f, 0.15f, -3.8f, 0.2f, 0.15f, 0.1f, 0.2f, 0.15f, 0.15f, -7.0f, 0.15f, -3.8f, -7.0f, 0.15f, -3.8f, -7.0f, 0.15f, 0.15f, -7.0f, 0.15f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.rightArmModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 161, 9, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 70, 93, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 153, 57, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.1f, -2.1f, -2.0f, 8, 15, 4, 0.0f, 0.1f, 0.2f, 0.15f, -3.8f, 0.2f, 0.15f, -3.8f, 0.2f, 0.15f, 0.1f, 0.2f, 0.15f, 0.15f, -7.0f, 0.15f, -3.8f, -7.0f, 0.15f, -3.8f, -7.0f, 0.15f, 0.15f, -7.0f, 0.15f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.2f, 4.7f, -1.5f, 1, 1, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-3.2f, 4.7f, -0.8f, 1, 1, 1, 0.0f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-7.3f, -1.1f, -1.0f, 4, 92, 69, 0.0f, -3.85f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.1f, 0.0f, -66.85f, -3.85f, 0.0f, -66.85f, -3.85f, -89.0f, 0.15f, 0.15f, -89.0f, 0.15f, 0.15f, -89.0f, -66.85f, -3.85f, -89.0f, -66.85f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-3.1f, 5.9f, -2.0f, 8, 1, 4, 0.0f, 0.2f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, 0.2f, 0.0f, 0.15f, 0.0f, 0.0f, 0.15f, -3.9f, 0.0f, 0.15f, -3.9f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
