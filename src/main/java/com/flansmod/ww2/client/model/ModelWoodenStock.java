//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelWoodenStock extends ModelAttachment
{
    int textureX;
    int textureY;
    
    public ModelWoodenStock() {
        this.textureX = 32;
        this.textureY = 32;
        (this.attachmentModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo((ModelBase)this, 13, 1, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.attachmentModel[0].addShapeBox(-8.0f, 0.0f, -0.5f, 3, 1, 1, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.attachmentModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[1].addShapeBox(-8.0f, 1.0f, -0.5f, 8, 1, 1, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.2f, 1.0f, 0.2f, 0.0f, -1.0f, 0.2f, 0.0f, -1.0f, 0.2f, 0.2f, 1.0f, 0.2f);
        this.attachmentModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[2].addShapeBox(-5.0f, 0.0f, -0.5f, 5, 1, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.attachmentModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
