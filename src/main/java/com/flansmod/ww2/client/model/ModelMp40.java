//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;
import com.flansmod.common.vector.*;
import com.flansmod.client.model.*;

public class ModelMp40 extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelMp40() {
        this.textureX = 128;
        this.textureY = 128;
        (this.gunModel = new ModelRendererTurbo[32])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo((ModelBase)this, 73, 9, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.gunModel[27] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.gunModel[28] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.gunModel[29] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.gunModel[30] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.gunModel[31] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, -0.9f, 0.1f, 0.0f, 1.1f, 0.1f, 0.0f, 1.1f, 0.1f, 0.0f, -0.9f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f);
        this.gunModel[0].setRotationPoint(-0.9f, -2.4f, -0.5f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f);
        this.gunModel[1].setRotationPoint(1.0f, -3.5f, -0.5f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.4f, -0.3f, 0.0f, 0.4f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.4f, -0.3f, 0.0f, 0.4f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -4.0f, -0.5f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.gunModel[3].setRotationPoint(-0.2f, -4.0f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, -0.5f, -0.7f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.5f, -0.7f, -0.3f, -0.5f, -0.2f, -0.3f, 0.0f, 1.0f, -0.3f, 0.0f, 1.0f, -0.3f, -0.5f, -0.2f, -0.3f);
        this.gunModel[4].setRotationPoint(-1.2f, -4.0f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.25f, -0.25f);
        this.gunModel[5].setRotationPoint(8.0f, -4.0f, -0.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f);
        this.gunModel[6].setRotationPoint(7.5f, -4.0f, -0.5f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f, 0.0f, -0.4f, -0.3f, 0.4f, -0.4f, -0.3f, 0.4f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.3f, 0.0f, 0.4f, -0.3f, 0.0f, 0.4f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.gunModel[7].setRotationPoint(0.0f, -4.4f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.4f, -0.3f, 0.0f, 0.4f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.4f, -0.3f, 0.4f, -0.4f, -0.3f, 0.4f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f);
        this.gunModel[8].setRotationPoint(0.0f, -3.6f, -0.5f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, -0.2f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, -0.2f, -0.2f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f);
        this.gunModel[9].setRotationPoint(0.0f, -3.5f, -0.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.05f, 0.2f, 0.0f, -0.05f, 0.2f, 0.0f, -0.05f, 0.0f, 0.0f, -0.05f, 0.0f, 0.0f, -0.05f, 0.0f, 0.0f, -0.05f, 0.0f, 0.0f, -0.05f, 0.0f, 0.0f, -0.05f);
        this.gunModel[10].setRotationPoint(6.0f, -3.5f, -0.5f);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.03f, -0.05f, 0.0f, -0.03f, -0.05f, 0.0f, -0.03f, -0.05f, 0.0f, -0.03f, -0.05f, 0.0f, -0.03f, 0.02f, 0.0f, -0.03f, 0.02f, 0.0f, -0.03f, 0.02f, 0.0f, -0.03f, 0.02f);
        this.gunModel[11].setRotationPoint(1.0f, -4.1f, -0.5f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, -0.1f, -0.35f, 0.1f, -0.1f, -0.35f, 0.1f, -0.1f, -0.35f, 0.1f, -0.1f, -0.35f, 0.1f, -0.1f, -0.35f, 0.1f, -0.1f, -0.35f, 0.1f, -0.1f, -0.35f, 0.1f, -0.1f, -0.35f, 0.1f);
        this.gunModel[12].setRotationPoint(1.0f, -3.8f, -0.5f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f);
        this.gunModel[13].setRotationPoint(0.0f, -2.2f, -0.5f);
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.gunModel[14].setRotationPoint(1.6f, -2.6f, -0.5f);
        this.gunModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f);
        this.gunModel[15].setRotationPoint(1.0f, -3.25f, -0.5f);
        this.gunModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.25f, -0.25f, 0.3f, -0.25f, -0.25f, 0.3f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.3f, -0.25f, -0.25f, 0.3f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f);
        this.gunModel[16].setRotationPoint(11.5f, -4.0f, -0.5f);
        this.gunModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, 0.0f, -0.25f, -0.4f, 0.0f, -0.1f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, -0.4f, 0.0f, -0.1f, -0.4f);
        this.gunModel[17].setRotationPoint(10.5f, -3.8f, -0.5f);
        this.gunModel[18].addShapeBox(0.0f, -2.0f, 0.0f, 1, 2, 1, 0.0f, -0.35f, -0.8f, -0.47f, -0.35f, -0.8f, -0.47f, -0.35f, -0.8f, -0.47f, -0.35f, -0.8f, -0.47f, -0.35f, -0.8f, -0.4f, -0.35f, -0.8f, -0.4f, -0.35f, -0.8f, -0.4f, -0.35f, -0.8f, -0.4f);
        this.gunModel[18].setRotationPoint(11.7f, -2.95f, -0.5f);
        this.gunModel[19].addShapeBox(0.0f, -0.5f, -0.35f, 1, 1, 1, 0.0f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f);
        this.gunModel[19].setRotationPoint(11.7f, -4.15f, 0.0f);
        this.gunModel[19].rotateAngleX = 1.5707964f;
        this.gunModel[20].addShapeBox(0.0f, -0.5f, -0.35f, 1, 1, 1, 0.0f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f);
        this.gunModel[20].setRotationPoint(11.7f, -4.15f, 0.0f);
        this.gunModel[21].addShapeBox(0.0f, -0.5f, -0.35f, 1, 1, 1, 0.0f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f);
        this.gunModel[21].setRotationPoint(11.7f, -4.15f, 0.0f);
        this.gunModel[21].rotateAngleX = -1.5707964f;
        this.gunModel[22].addShapeBox(0.0f, -0.5f, -0.35f, 1, 1, 1, 0.0f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f, -0.35f, -0.35f, -0.45f);
        this.gunModel[22].setRotationPoint(11.7f, -4.15f, 0.0f);
        this.gunModel[22].rotateAngleX = 3.1415927f;
        this.gunModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.4f, -0.8f, -0.3f, -0.4f, -0.8f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.1f, -0.4f, -0.8f, -0.25f, -0.4f, -0.8f, -0.25f, -0.4f, 0.0f, -0.1f, -0.4f);
        this.gunModel[23].setRotationPoint(11.0f, -3.95f, -0.5f);
        this.gunModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f, -0.4f);
        this.gunModel[24].setRotationPoint(1.0f, -2.5f, -0.5f);
        this.gunModel[24].rotateAngleZ = 0.17453294f;
        this.gunModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f);
        this.gunModel[25].setRotationPoint(11.5f, -4.0f, -0.5f);
        this.gunModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f);
        this.gunModel[26].setRotationPoint(11.8f, -4.0f, -0.5f);
        this.gunModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.gunModel[27].setRotationPoint(3.0f, -4.1f, -0.5f);
        this.gunModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, -0.8f, -0.45f, -0.4f, -0.8f, -0.45f, -0.4f, -0.8f, -0.45f, -0.3f, -0.8f, -0.45f, -0.3f, 0.2f, -0.4f, -0.3f, 0.2f, -0.4f, -0.3f, 0.2f, -0.45f, -0.3f, 0.2f, -0.45f);
        this.gunModel[28].setRotationPoint(3.2f, -5.2f, -0.35f);
        this.gunModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.35f, 0.0f, -0.3f, -0.35f, 0.0f, -0.3f, -0.35f, 0.0f, -0.3f, -0.35f, 0.0f, -0.3f, -0.35f, 0.0f, -0.3f, -0.35f, 0.0f, -0.3f, -0.35f, 0.0f, -0.3f, -0.35f, 0.0f, -0.3f);
        this.gunModel[29].setRotationPoint(2.8f, -4.2f, -0.5f);
        this.gunModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, -0.8f, -0.45f, -0.4f, -0.8f, -0.45f, -0.4f, -0.8f, -0.45f, -0.3f, -0.8f, -0.45f, -0.3f, 0.2f, -0.45f, -0.3f, 0.2f, -0.45f, -0.3f, 0.2f, -0.4f, -0.3f, 0.2f, -0.4f);
        this.gunModel[30].setRotationPoint(3.2f, -5.2f, -0.65f);
        this.gunModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f, -0.4f, -0.38f, -0.9f, -0.4f, -0.38f, -0.9f, -0.4f, -0.38f, -0.9f, -0.4f, -0.38f, -0.9f, -0.4f, -0.38f, -0.9f, -0.4f, -0.38f, -0.9f, -0.4f, -0.38f, -0.9f, -0.4f, -0.38f, -0.9f);
        this.gunModel[31].setRotationPoint(2.15f, -3.8f, -0.7f);
        this.gunModel[31].rotateAngleX = 0.34906584f;
        (this.defaultStockModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.defaultStockModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.defaultStockModel[2] = new ModelRendererTurbo((ModelBase)this, 121, 9, this.textureX, this.textureY);
        this.defaultStockModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.defaultStockModel[4] = new ModelRendererTurbo((ModelBase)this, 9, 17, this.textureX, this.textureY);
        this.defaultStockModel[5] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.defaultStockModel[6] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.defaultStockModel[7] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.defaultStockModel[8] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.defaultStockModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.defaultStockModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f);
        this.defaultStockModel[0].setRotationPoint(-0.5f, -3.2f, 0.2f);
        this.defaultStockModel[0].rotateAngleZ = -0.06981317f;
        this.defaultStockModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f);
        this.defaultStockModel[1].setRotationPoint(-0.5f, -3.2f, -1.2f);
        this.defaultStockModel[1].rotateAngleZ = -0.06981317f;
        this.defaultStockModel[2].addShapeBox(-0.4f, 0.0f, 0.2f, 1, 1, 2, 0.0f, -0.45f, -0.45f, -0.25f, -0.45f, -0.45f, -0.25f, -0.45f, -0.45f, -0.25f, -0.45f, -0.45f, -0.25f, -0.45f, -0.45f, -0.25f, -0.45f, -0.45f, -0.25f, -0.45f, -0.45f, -0.25f, -0.45f, -0.45f, -0.25f);
        this.defaultStockModel[2].setRotationPoint(-0.5f, -3.2f, -1.2f);
        this.defaultStockModel[2].rotateAngleZ = -0.06981317f;
        this.defaultStockModel[3].addShapeBox(5.0f, -0.2f, -1.2f, 1, 1, 2, 0.0f, -0.9f, -0.6f, -0.4f, 0.0f, -0.6f, -0.4f, 0.0f, -0.6f, -0.4f, -0.9f, -0.6f, -0.4f, -0.9f, -0.25f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, -0.9f, -0.25f, -0.4f);
        this.defaultStockModel[3].setRotationPoint(-0.5f, -3.0f, 0.2f);
        this.defaultStockModel[3].rotateAngleZ = -0.06981317f;
        this.defaultStockModel[4].addShapeBox(4.0f, -0.2f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.6f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.6f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.2f, -0.4f);
        this.defaultStockModel[4].setRotationPoint(-0.5f, -3.0f, 0.2f);
        this.defaultStockModel[4].rotateAngleZ = -0.06981317f;
        this.defaultStockModel[5].addShapeBox(5.0f, -0.2f, -1.4f, 1, 1, 1, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, -0.6f, -0.4f, 0.0f, -0.6f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.4f, -0.4f);
        this.defaultStockModel[5].setRotationPoint(-0.5f, -3.0f, 0.2f);
        this.defaultStockModel[5].rotateAngleZ = -0.06981317f;
        this.defaultStockModel[6].addShapeBox(4.0f, -0.2f, -1.4f, 1, 1, 1, 0.0f, 0.0f, -0.6f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.6f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.2f, -0.4f);
        this.defaultStockModel[6].setRotationPoint(-0.5f, -3.0f, 0.2f);
        this.defaultStockModel[6].rotateAngleZ = -0.06981317f;
        this.defaultStockModel[7].addShapeBox(5.0f, -0.2f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, -0.6f, -0.4f, 0.0f, -0.6f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.4f, -0.4f);
        this.defaultStockModel[7].setRotationPoint(-0.5f, -3.0f, 0.2f);
        this.defaultStockModel[7].rotateAngleZ = -0.06981317f;
        this.defaultStockModel[8].addShapeBox(4.0f, -0.2f, -1.2f, 1, 1, 2, 0.0f, 0.0f, -0.6f, -0.4f, -0.9f, -0.6f, -0.4f, -0.9f, -0.6f, -0.4f, 0.0f, -0.6f, -0.4f, 0.0f, -0.2f, -0.4f, -0.9f, -0.25f, -0.4f, -0.9f, -0.25f, -0.4f, 0.0f, -0.2f, -0.4f);
        this.defaultStockModel[8].setRotationPoint(-0.5f, -3.0f, 0.2f);
        this.defaultStockModel[8].rotateAngleZ = -0.06981317f;
        this.defaultStockModel[9].addShapeBox(-0.4f, 0.0f, 0.2f, 1, 1, 2, 0.0f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f, -0.7f);
        this.defaultStockModel[9].setRotationPoint(-0.5f, -3.2f, -1.2f);
        this.defaultStockModel[9].rotateAngleZ = -0.06981317f;
        (this.ammoModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 17, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.ammoModel[3] = new ModelRendererTurbo((ModelBase)this, 9, 25, this.textureX, this.textureY);
        this.ammoModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.ammoModel[0].addShapeBox(6.0f, -2.5f, -0.5f, 1, 4, 1, 0.0f, -0.1f, 0.0f, -0.25f, -0.1f, 0.0f, -0.25f, -0.1f, 0.0f, -0.25f, -0.1f, 0.0f, -0.25f, -0.1f, 0.0f, -0.25f, -0.1f, 0.0f, -0.25f, -0.1f, 0.0f, -0.25f, -0.1f, 0.0f, -0.25f);
        this.ammoModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ammoModel[1].addShapeBox(6.0f, 1.0f, -0.5f, 1, 1, 1, 0.0f, -0.05f, -0.4f, -0.15f, -0.05f, -0.4f, -0.15f, -0.05f, -0.4f, -0.15f, -0.05f, -0.4f, -0.15f, -0.05f, -0.4f, -0.15f, -0.05f, -0.4f, -0.15f, -0.05f, -0.4f, -0.15f, -0.05f, -0.4f, -0.15f);
        this.ammoModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ammoModel[2].addShapeBox(6.0f, -2.5f, -0.5f, 1, 3, 1, 0.0f, -0.05f, -0.3f, -0.2f, -0.05f, -0.3f, -0.2f, -0.05f, -0.3f, -0.2f, -0.05f, -0.3f, -0.2f, -0.05f, 0.6f, -0.2f, -0.05f, 0.6f, -0.2f, -0.05f, 0.6f, -0.2f, -0.05f, 0.6f, -0.2f);
        this.ammoModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ammoModel[3].addShapeBox(5.7f, -2.0f, -0.5f, 1, 3, 1, 0.0f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f);
        this.ammoModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ammoModel[4].addShapeBox(5.9f, -2.0f, -0.5f, 1, 3, 1, 0.0f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f, -0.45f, 0.1f, -0.15f);
        this.ammoModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.slideModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.slideModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.slideModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, -0.4f, -0.4f, -0.6f, -0.4f, -0.4f, -0.6f, -0.4f, -0.4f, -0.6f, -0.4f, -0.4f, -0.6f, -0.4f, -0.4f, -0.6f, -0.4f, -0.4f, -0.6f, -0.4f, -0.4f, -0.6f, -0.4f, -0.4f, -0.6f);
        this.slideModel[0].setRotationPoint(5.0f, -3.8f, -0.7f);
        this.slideModel[0].rotateAngleX = 0.34906584f;
        this.slideModel[1].addShapeBox(0.0f, 0.0f, 0.5f, 1, 1, 2, 0.0f, -0.35f, -0.35f, -0.9f, -0.35f, -0.35f, -0.9f, -0.35f, -0.35f, -0.9f, -0.35f, -0.35f, -0.9f, -0.35f, -0.35f, -0.9f, -0.35f, -0.35f, -0.9f, -0.35f, -0.35f, -0.9f, -0.35f, -0.35f, -0.9f);
        this.slideModel[1].setRotationPoint(5.0f, -3.8f, -0.7f);
        this.slideModel[1].rotateAngleX = 0.34906584f;
        this.barrelAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.00625f, 0.25f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.09375f, 0.28125f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.5f, 0.28125f, 0.0f);
        this.gunSlideDistance = 0.17f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
        this.translateAll(0.0f, -1.2f, 0.0f);
        this.flipAll();
    }
}
