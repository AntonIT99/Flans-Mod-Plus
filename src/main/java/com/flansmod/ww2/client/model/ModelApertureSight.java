//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelApertureSight extends ModelAttachment
{
    int textureX;
    int textureY;
    
    public ModelApertureSight() {
        this.textureX = 64;
        this.textureY = 64;
        (this.attachmentModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo((ModelBase)this, 13, 1, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.attachmentModel[7] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.attachmentModel[8] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.attachmentModel[9] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.attachmentModel[10] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.attachmentModel[11] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.attachmentModel[12] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.attachmentModel[13] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.attachmentModel[0].addShapeBox(-1.0f, -1.0f, -1.0f, 2, 1, 1, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.attachmentModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[1].addShapeBox(-0.5f, -1.25f, -1.0f, 1, 1, 2, 0.0f, 0.0f, -0.3f, -0.45f, 0.25f, -0.3f, -0.45f, 0.25f, -0.3f, -0.45f, 0.0f, -0.3f, -0.45f, 0.0f, -0.3f, -0.45f, 0.25f, -0.3f, -0.45f, 0.25f, -0.3f, -0.45f, 0.0f, -0.3f, -0.45f);
        this.attachmentModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[2].addShapeBox(-0.5f, -1.65f, -1.0f, 1, 1, 2, 0.0f, -0.2f, -0.3f, -0.8f, 0.0f, -0.3f, -0.8f, 0.0f, -0.3f, -0.8f, -0.2f, -0.3f, -0.8f, -0.2f, -0.3f, -0.5f, 0.2f, -0.3f, -0.5f, 0.2f, -0.3f, -0.5f, -0.2f, -0.3f, -0.5f);
        this.attachmentModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[3].addShapeBox(-0.5f, -2.5f, -0.5f, 1, 15, 15, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -14.0f, -0.4f, 0.0f, -14.0f, -0.4f, -14.0f, 0.0f, -0.4f, -14.0f, 0.0f, -0.4f, -14.0f, -14.0f, -0.4f, -14.0f, -14.0f);
        this.attachmentModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[4].addShapeBox(-0.5f, -1.95f, -1.0f, 1, 1, 2, 0.0f, -0.3f, -0.45f, -0.5f, -0.3f, -0.45f, -0.5f, -0.3f, -0.45f, -0.5f, -0.3f, -0.45f, -0.5f, -0.3f, -0.4f, -0.7f, -0.3f, -0.4f, -0.7f, -0.3f, -0.4f, -0.7f, -0.3f, -0.4f, -0.7f);
        this.attachmentModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[5].addShapeBox(-0.5f, -3.0f, -1.1f, 1, 2, 1, 0.0f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, -0.5f, -0.4f);
        this.attachmentModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[6].addShapeBox(-0.5f, -1.55f, -1.0f, 1, 1, 2, 0.0f, -0.4f, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f, -0.4f, -0.4f, -0.3f);
        this.attachmentModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[7].addShapeBox(-0.5f, -1.55f, 0.25f, 1, 1, 1, 0.0f, -0.38f, -0.38f, -0.45f, -0.38f, -0.38f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.38f, -0.38f, -0.45f, -0.38f, -0.38f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f);
        this.attachmentModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[8].addShapeBox(-0.8f, -1.55f, -1.0f, 1, 1, 2, 0.0f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f);
        this.attachmentModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[9].addShapeBox(-1.0f, -1.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.attachmentModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[10].addShapeBox(-1.0f, -1.0f, -0.5f, 2, 1, 1, 0.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f);
        this.attachmentModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[11].addShapeBox(-0.5f, -1.55f, -1.25f, 1, 1, 1, 0.0f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.38f, -0.38f, -0.45f, -0.38f, -0.38f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.45f, -0.38f, -0.38f, -0.45f, -0.38f, -0.38f, -0.45f);
        this.attachmentModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[12].addShapeBox(-0.5f, -3.0f, 0.1f, 1, 2, 1, 0.0f, -0.3f, -0.5f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, -0.5f, -0.4f, -0.3f, -0.8f, -0.4f, -0.3f, -0.8f, -0.4f);
        this.attachmentModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[13].addShapeBox(-0.5f, -3.05f, -1.0f, 1, 1, 2, 0.0f, -0.3f, -0.4f, -0.7f, -0.3f, -0.4f, -0.7f, -0.3f, -0.4f, -0.7f, -0.3f, -0.4f, -0.7f, -0.3f, -0.45f, -0.5f, -0.3f, -0.45f, -0.5f, -0.3f, -0.45f, -0.5f, -0.3f, -0.45f, -0.5f);
        this.attachmentModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
