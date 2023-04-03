//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelWoodenGrip extends ModelAttachment
{
    int textureX;
    int textureY;
    
    public ModelWoodenGrip() {
        this.textureX = 32;
        this.textureY = 32;
        (this.attachmentModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.attachmentModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.attachmentModel[0].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.1f, -0.3f, -0.1f, 0.25f, -0.3f, -0.1f, 0.25f, -0.3f, -0.1f, -0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f);
        this.attachmentModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[1].addShapeBox(-0.9f, 1.8f, -0.5f, 1, 1, 1, 0.0f, 0.05f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.05f, 0.0f, -0.1f, 0.2f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.2f, 0.0f, -0.1f);
        this.attachmentModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[2].addShapeBox(-0.5f, 0.4f, -0.5f, 1, 1, 1, 0.0f, 0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, 0.2f, -0.5f, -0.1f, 0.0f, -0.5f, -0.1f, 0.0f, -0.5f, -0.1f, 0.2f, -0.5f, -0.1f);
        this.attachmentModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[3].addShapeBox(-0.5f, 0.3f, -0.5f, 1, 1, 1, 0.0f, 0.2f, -0.6f, -0.1f, 0.0f, -0.6f, -0.1f, 0.0f, -0.6f, -0.1f, 0.2f, -0.6f, -0.1f, 0.3f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.3f, -0.1f, -0.1f);
        this.attachmentModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[4].addShapeBox(-0.5f, 0.6f, -0.5f, 1, 1, 1, 0.0f, 0.3f, -0.6f, -0.1f, 0.0f, -0.6f, -0.1f, 0.0f, -0.6f, -0.1f, 0.3f, -0.6f, -0.1f, 0.4f, -0.1f, -0.1f, -0.1f, -0.1f, -0.1f, -0.1f, -0.1f, -0.1f, 0.4f, -0.1f, -0.1f);
        this.attachmentModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[5].addShapeBox(-0.5f, 0.9f, -0.5f, 1, 1, 1, 0.0f, 0.4f, -0.6f, -0.1f, -0.1f, -0.6f, -0.1f, -0.1f, -0.6f, -0.1f, 0.4f, -0.6f, -0.1f, 0.45f, -0.1f, -0.1f, -0.3f, -0.1f, -0.1f, -0.3f, -0.1f, -0.1f, 0.45f, -0.1f, -0.1f);
        this.attachmentModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[6].addShapeBox(-1.0f, 2.8f, -0.5f, 1, 1, 1, 0.0f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, -0.1f, -0.5f, -0.2f, -0.1f, -0.5f, -0.2f, -0.1f, -0.5f, -0.2f, -0.1f, -0.5f, -0.2f);
        this.attachmentModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[7].addShapeBox(-0.5f, -0.6f, -0.5f, 1, 1, 1, 0.0f, 0.2f, -0.5f, 0.0f, 0.4f, -0.5f, 0.0f, 0.4f, -0.5f, 0.0f, 0.2f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.attachmentModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
