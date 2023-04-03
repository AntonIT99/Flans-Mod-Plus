//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelAmericanOfficerChest extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelAmericanOfficerChest() {
        this.textureX = 256;
        this.textureY = 256;
        (this.bodyModel = new ModelRendererTurbo[18])[0] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 129, 49, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 145, 49, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 161, 49, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 233, 49, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 57, 57, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 105, 57, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 129, 57, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 201, 57, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 25, 65, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 233, 57, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 177, 73, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 201, 33, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 233, 57, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 87, 92, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 87, 92, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.5f, 0.0f, -2.0f, 16, 18, 4, 0.0f, 0.0f, 0.2f, 0.1f, -7.0f, 0.2f, 0.1f, -7.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, -6.0f, 0.1f, -7.0f, -6.0f, 0.1f, -7.0f, -6.0f, 0.1f, 0.0f, -6.0f, 0.1f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-2.2f, 9.4f, -2.5f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.7f, 9.4f, -2.5f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(0.3f, 9.4f, -2.5f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(2.8f, 9.4f, -2.5f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.5f, 9.6f, -2.2f, 16, 8, 5, 0.0f, 0.1f, 0.0f, 0.1f, -6.9f, 0.0f, 0.1f, -6.9f, 0.0f, -0.51f, 0.1f, 0.0f, -0.5f, 0.1f, -6.7f, 0.1f, -6.9f, -6.7f, 0.1f, -6.9f, -6.7f, -0.5f, 0.1f, -6.7f, -0.5f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-3.3f, 1.6f, -2.2f, 8, 15, 1, 0.0f, 0.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-3.3f, 0.3f, -2.2f, 8, 8, 1, 0.0f, 0.0f, 0.0f, 0.2f, -7.0f, 0.0f, 0.2f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.2f, -7.0f, -6.7f, 0.2f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(2.3f, 1.6f, -2.2f, 8, 15, 1, 0.0f, 0.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-3.3f, 0.0f, -2.2f, 8, 7, 5, 0.0f, 0.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, -7.0f, 0.1f, -0.6f, 0.0f, 0.1f, -0.6f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, -0.6f, 0.0f, -6.7f, -0.6f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(2.3f, 0.0f, -2.2f, 8, 7, 5, 0.0f, 0.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, -7.0f, 0.1f, -0.6f, 0.0f, 0.1f, -0.6f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, -0.6f, 0.0f, -6.7f, -0.6f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-4.7f, 0.4f, 1.8f, 8, 16, 1, 0.0f, -7.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, -0.6f, -7.0f, 0.1f, -0.6f, -6.0f, -6.0f, 0.1f, -1.0f, -6.0f, 0.1f, -1.0f, -6.0f, -0.6f, -6.0f, -6.0f, -0.6f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(2.3f, 0.3f, -2.2f, 8, 8, 1, 0.0f, 0.0f, 0.0f, 0.2f, -7.0f, 0.0f, 0.2f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.2f, -7.0f, -6.7f, 0.2f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addBox(1.0f, 9.0f, 2.0f, 3, 3, 2, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addBox(2.0f, 8.5f, 2.5f, 1, 1, 1, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-3.3f, 0.4f, 1.8f, 8, 16, 1, 0.0f, 0.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, -7.0f, 0.1f, -0.6f, 0.0f, 0.1f, -0.6f, -1.0f, -6.0f, 0.1f, -6.0f, -6.0f, 0.1f, -6.0f, -6.0f, -0.6f, -1.0f, -6.0f, -0.6f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-3.3f, 0.3f, -2.2f, 3, 2, 1, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-0.3f, 1.0f, -2.25f, 3, 2, 1, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.leftArmModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 177, 33, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 217, 73, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.1f, -2.0f, 8, 17, 4, 0.0f, 0.25f, 0.25f, 0.15f, -3.85f, 0.25f, 0.15f, -3.85f, 0.25f, 0.15f, 0.25f, 0.25f, 0.15f, 0.25f, -7.0f, 0.15f, -3.85f, -7.0f, 0.15f, -3.85f, -7.0f, 0.15f, 0.25f, -7.0f, 0.15f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(2.2f, 5.7f, -1.5f, 1, 1, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(2.2f, 5.7f, -0.8f, 1, 1, 1, 0.0f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(3.4f, -2.0f, -1.5f, 4, 9, 3, 0.0f, 0.1f, 0.0f, 0.15f, -3.85f, 0.0f, 0.15f, -3.85f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.15f, -8.0f, 0.15f, -3.85f, -8.0f, 0.15f, -3.85f, -8.0f, 0.15f, 0.15f, -8.0f, 0.15f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.rightArmModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 209, 17, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 241, 17, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 201, 73, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 70, 75, this.textureX, this.textureY);
        this.rightArmModel[5] = new ModelRendererTurbo((ModelBase)this, 70, 75, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.1f, -2.0f, 8, 17, 4, 0.0f, 0.25f, 0.25f, 0.15f, -3.85f, 0.25f, 0.15f, -3.85f, 0.25f, 0.15f, 0.25f, 0.25f, 0.15f, 0.25f, -7.0f, 0.15f, -3.85f, -7.0f, 0.15f, -3.85f, -7.0f, 0.15f, 0.25f, -7.0f, 0.15f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.2f, 5.7f, -1.5f, 1, 1, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-3.2f, 5.7f, -0.8f, 1, 1, 1, 0.0f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.4f, -2.0f, -1.5f, 4, 9, 3, 0.0f, 0.1f, 0.0f, 0.15f, -3.85f, 0.0f, 0.15f, -3.85f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.15f, -8.0f, 0.15f, -3.85f, -8.0f, 0.15f, -3.85f, -8.0f, 0.15f, 0.15f, -8.0f, 0.15f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-7.2f, -1.1f, -1.5f, 4, 93, 80, 0.0f, -3.85f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.1f, 0.0f, -76.85f, -3.85f, 0.0f, -76.85f, -3.85f, -90.0f, 0.15f, 0.15f, -90.0f, 0.15f, 0.15f, -90.0f, -76.85f, -3.85f, -90.0f, -76.85f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[5].addShapeBox(9.2f, -1.1f, -1.5f, 4, 93, 80, 0.0f, -3.85f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.1f, 0.0f, -76.85f, -3.85f, 0.0f, -76.85f, -3.85f, -90.0f, 0.15f, 0.15f, -90.0f, 0.15f, 0.15f, -90.0f, -76.85f, -3.85f, -90.0f, -76.85f);
        this.rightArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel = new ModelRendererTurbo[1];
        (this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 177, 57, this.textureX, this.textureY)).addShapeBox(-1.7f, -1.0f, -2.4f, 4, 3, 5, 0.0f, 0.3f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.1f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel = new ModelRendererTurbo[1];
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 153, 57, this.textureX, this.textureY)).addShapeBox(-2.3f, -1.0f, -2.4f, 4, 3, 5, 0.0f, 0.0f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.2f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
