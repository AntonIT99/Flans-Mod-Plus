//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelGermanMedicChest extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGermanMedicChest() {
        this.textureX = 256;
        this.textureY = 256;
        (this.bodyModel = new ModelRendererTurbo[17])[0] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 113, 65, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 113, 73, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 135, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 135, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.5f, 7.3f, -2.2f, 16, 8, 5, 0.0f, 0.1f, 0.0f, 0.1f, -6.9f, 0.0f, 0.1f, -6.9f, 0.0f, -0.51f, 0.1f, 0.0f, -0.5f, 0.1f, -6.7f, 0.1f, -6.9f, -6.7f, 0.1f, -6.9f, -6.7f, -0.5f, 0.1f, -6.7f, -0.5f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-3.3f, 1.3f, -2.2f, 8, 13, 1, 0.0f, 0.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-3.3f, 0.3f, -2.2f, 8, 8, 1, 0.0f, 0.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(2.3f, 0.3f, -2.2f, 8, 8, 1, 0.0f, 0.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(2.3f, 1.3f, -2.2f, 8, 13, 1, 0.0f, 0.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, 0.0f, -6.7f, 0.1f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-2.2f, 8.5f, -2.5f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-3.3f, 0.0f, -2.2f, 8, 7, 5, 0.0f, 0.0f, 0.2f, 0.1f, -7.0f, 0.2f, 0.1f, -7.0f, 0.2f, -0.6f, 0.0f, 0.2f, -0.6f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, -0.6f, 0.0f, -6.7f, -0.6f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(2.3f, 0.0f, -2.2f, 8, 7, 5, 0.0f, 0.0f, 0.2f, 0.1f, -7.0f, 0.2f, 0.1f, -7.0f, 0.2f, -0.6f, 0.0f, 0.2f, -0.6f, 0.0f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, -0.6f, 0.0f, -6.7f, -0.6f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-3.3f, 0.4f, 1.8f, 8, 10, 1, 0.0f, 0.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, -7.0f, 0.1f, -0.6f, 0.0f, 0.1f, -0.6f, -3.0f, -6.0f, 0.1f, -5.0f, -7.7f, 0.1f, -5.0f, -7.7f, -0.6f, -3.0f, -6.0f, -0.6f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-4.7f, 0.4f, 1.8f, 8, 10, 1, 0.0f, -7.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, -0.6f, -7.0f, 0.1f, -0.6f, -5.0f, -7.7f, 0.1f, -3.0f, -6.0f, 0.1f, -3.0f, -6.0f, -0.6f, -5.0f, -7.7f, -0.6f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-0.5f, 2.7f, 1.8f, 8, 12, 1, 0.0f, 0.1f, 0.0f, 0.1f, -7.0f, 0.0f, 0.1f, -7.0f, 0.0f, -0.51f, 0.1f, 0.0f, -0.5f, 0.1f, -6.7f, 0.1f, -7.0f, -6.7f, 0.1f, -7.0f, -6.7f, -0.5f, 0.1f, -6.7f, -0.5f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-4.7f, 8.5f, -2.5f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(0.3f, 8.5f, -2.5f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(2.8f, 8.5f, -2.5f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-4.5f, 0.0f, -2.0f, 16, 18, 4, 0.0f, 0.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, -7.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, -6.0f, 0.1f, -7.0f, -6.0f, 0.1f, -7.0f, -6.0f, 0.1f, 0.0f, -6.0f, 0.1f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-4.5f, 0.0f, -3.1f, 16, 18, 1, 0.0f, 0.0f, 0.1f, -0.3f, -7.0f, 0.1f, -0.3f, -7.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, -6.0f, -0.3f, -7.0f, -6.0f, -0.3f, -7.0f, -6.0f, -0.3f, 0.0f, -6.0f, -0.3f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-4.5f, 0.0f, 2.1f, 16, 18, 1, 0.0f, 0.0f, 0.1f, -0.3f, -7.0f, 0.1f, -0.3f, -7.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, -6.0f, -0.3f, -7.0f, -6.0f, -0.3f, -7.0f, -6.0f, -0.3f, 0.0f, -6.0f, -0.3f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.leftArmModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 89, 65, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 119, 121, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, 4.8f, -2.0f, 4, 1, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(0.2f, -2.6f, -0.5f, 2, 1, 1, 0.0f, 0.4f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-1.0f, -2.2f, -2.0f, 8, 15, 4, 0.0f, 0.2f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, 0.2f, 0.0f, 0.15f, 0.2f, -8.0f, 0.15f, -3.8f, -8.0f, 0.15f, -3.8f, -8.0f, 0.15f, 0.2f, -8.0f, 0.15f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(2.3f, 0.0f, -1.5f, 1, 64, 64, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -61.0f, 0.0f, 0.0f, -61.0f, 0.0f, -61.0f, 0.0f, 0.0f, -61.0f, 0.0f, 0.0f, -61.0f, -61.0f, 0.0f, -61.0f, -61.0f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.rightArmModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 65, 65, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 119, 121, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.2f, -2.0f, 8, 15, 4, 0.0f, 0.2f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, -3.8f, 0.0f, 0.15f, 0.2f, 0.0f, 0.15f, 0.2f, -7.0f, 0.15f, -3.8f, -7.0f, 0.15f, -3.8f, -7.0f, 0.15f, 0.2f, -7.0f, 0.15f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 5.8f, -2.0f, 4, 1, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-2.2f, -2.6f, -0.5f, 2, 1, 1, 0.0f, 0.1f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f, 0.4f, 0.0f, 0.15f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.3f, 0.0f, -1.5f, 1, 64, 64, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -61.0f, 0.0f, 0.0f, -61.0f, 0.0f, -61.0f, 0.0f, 0.0f, -61.0f, 0.0f, 0.0f, -61.0f, -61.0f, 0.0f, -61.0f, -61.0f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
