//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.ww2.client.model;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelGermanMedicHelmet extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGermanMedicHelmet() {
        this.textureX = 256;
        this.textureY = 256;
        (this.headModel = new ModelRendererTurbo[11])[0] = new ModelRendererTurbo((ModelBase)this, 35, 95, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 75, 90, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 75, 90, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 50, 110, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 55, 110, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 35, 90, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 45, 85, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 15, 105, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 45, 85, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 119, 121, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 119, 121, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.5f, -0.5f, -3.0f, 9, 1, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.5f, -4.0f, -3.0f, 1, 4, 1, 0.0f, 0.5f, -0.5f, -0.5f, -1.0f, -0.5f, -0.5f, -1.0f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(3.5f, -4.0f, -3.0f, 1, 4, 1, 0.0f, -1.0f, -0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f, 0.5f, -1.0f, -0.5f, 0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-3.5f, -5.0f, 3.5f, 7, 3, 1, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.5f, -0.5f, -1.0f, 1.5f, -0.5f, -1.0f, 1.5f, -0.5f, 1.0f, 1.5f, -0.5f, 1.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -8.0f, -4.0f, 16, 1, 16, 0.0f, -0.1f, 0.2f, -0.1f, -8.1f, 0.2f, -0.1f, -8.1f, 0.2f, -8.1f, -0.1f, 0.2f, -8.1f, 0.3f, -0.5f, 0.3f, -7.7f, -0.5f, 0.3f, -7.7f, -0.5f, -7.7f, 0.3f, -0.5f, -7.7f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, -6.0f, -5.0f, 9, 1, 1, 0.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(3.5f, -5.0f, -3.0f, 1, 3, 16, 0.0f, -0.5f, 0.0f, 2.5f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, -8.5f, -0.5f, 0.0f, -8.5f, -1.5f, -0.5f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, -0.5f, -7.5f, -1.5f, -0.5f, -7.5f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.0f, -7.0f, -4.0f, 8, 2, 16, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, -7.7f, 0.3f, 0.5f, -7.7f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, -7.5f, 0.5f, 0.0f, -7.5f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.5f, -5.0f, -3.0f, 1, 3, 16, 0.0f, 0.0f, 0.0f, 2.5f, -0.5f, 0.0f, 2.5f, -0.5f, 0.0f, -8.5f, 0.0f, 0.0f, -8.5f, 1.0f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, -7.5f, 1.0f, -0.5f, -7.5f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-5.0f, -8.0f, -1.5f, 1, 64, 64, 0.0f, -0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -61.0f, -0.7f, 0.0f, -61.0f, -0.2f, -61.0f, 0.0f, 0.0f, -61.0f, 0.0f, 0.0f, -61.0f, -61.0f, -0.2f, -61.0f, -61.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(4.0f, -8.0f, -1.5f, 1, 64, 64, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, -61.0f, 0.0f, 0.0f, -61.0f, 0.0f, -61.0f, 0.0f, -0.2f, -61.0f, 0.0f, -0.2f, -61.0f, -61.0f, 0.0f, -61.0f, -61.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
