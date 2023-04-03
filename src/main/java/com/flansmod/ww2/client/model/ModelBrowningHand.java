//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;
import com.flansmod.client.model.*;

public class ModelBrowningHand extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelBrowningHand() {
        this.textureX = 32;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(-6.0f, -2.3f, -1.0f, 7, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.gunModel[0].setRotationPoint(6.0f, -1.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.5f, -1.8f, -0.5f, 10, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].setRotationPoint(6.0f, -1.0f, 0.0f);
        this.gunModel[2].addShapeBox(1.0f, -1.8f, -0.5f, 10, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        this.gunModel[2].setRotationPoint(6.0f, -1.0f, 0.0f);
        this.gunModel[3].addShapeBox(-7.5f, -1.3f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[3].setRotationPoint(6.0f, -1.0f, 0.0f);
        this.gunModel[4].addShapeBox(-7.5f, -1.3f, -0.5f, 1, 3, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 1.0f, -0.2f, -0.2f, -1.0f, -0.2f, -0.2f, -1.0f, -0.2f, -0.2f, 1.0f, -0.2f, -0.2f);
        this.gunModel[4].setRotationPoint(6.0f, -1.0f, 0.0f);
        this.gunModel[5].addShapeBox(-0.1f, -3.0f, -0.5f, 1, 1, 1, 0.0f, -0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9f, 0.0f, 0.0f, -0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.9f, 0.0f, 0.0f);
        this.gunModel[5].setRotationPoint(6.0f, -1.0f, 0.0f);
        this.gunModel[6].addShapeBox(-5.5f, -2.5f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[6].setRotationPoint(6.0f, -1.0f, 0.0f);
        this.gunModel[7].addShapeBox(-5.5f, -3.25f, -0.5f, 1, 1, 1, 0.0f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f);
        this.gunModel[7].setRotationPoint(6.0f, -1.0f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY)).addShapeBox(-4.5f, -1.7f, 1.0f, 4, 2, 3, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.5f, -0.6f, 0.0f, 0.5f, -0.6f, 0.5f, 0.0f, -0.6f, 0.5f, 0.0f, -0.6f, 0.5f, 0.5f, -0.6f, 0.5f, 0.5f);
        this.ammoModel[0].setRotationPoint(6.0f, -1.0f, 0.0f);
        this.animationType = EnumAnimationType.SIDE_CLIP;
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
