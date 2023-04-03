//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Desktop\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelAmericanOfficerHelmet extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelAmericanOfficerHelmet() {
        this.textureX = 256;
        this.textureY = 256;
        (this.headModel = new ModelRendererTurbo[12])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 153, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 60, 99, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 41, 81, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.5f, -6.5f, -4.5f, 9, 1, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.5f, -7.5f, -4.5f, 9, 1, 9, 0.0f, -0.3f, 1.0f, -0.2f, -0.3f, 1.0f, -0.2f, -0.3f, 0.5f, -0.2f, -0.3f, 0.5f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.5f, -8.5f, -4.5f, 18, 1, 18, 0.0f, -1.0f, 0.9f, -1.5f, -10.0f, 0.9f, -1.5f, -10.0f, 0.5f, -10.2f, -1.0f, 0.5f, -10.2f, -0.3f, -1.0f, -0.2f, -9.3f, -1.0f, -0.2f, -9.3f, -0.5f, -9.2f, -0.3f, -0.5f, -9.2f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.5f, -5.5f, -5.0f, 9, 1, 10, 0.0f, 0.2f, 0.0f, -0.2f, 0.2f, 0.0f, -0.2f, 0.2f, -1.0f, 0.0f, 0.2f, -1.0f, 0.0f, 0.2f, -0.5f, 0.5f, 0.2f, -0.5f, 0.5f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.5f, -0.5f, -3.5f, 9, 1, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, -5.5f, -4.5f, 1, 6, 1, 0.0f, 0.0f, -0.5f, -2.0f, -0.5f, -0.5f, -2.0f, -0.5f, -0.5f, 2.0f, 0.0f, -0.5f, 2.0f, 0.0f, -0.5f, -1.0f, -0.5f, -0.5f, -1.0f, -0.5f, -0.5f, 1.0f, 0.0f, -0.5f, 1.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.5f, -6.5f, -5.0f, 1, 3, 1, 0.0f, 0.5f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.0f, 0.5f, -3.0f, -0.5f, 0.5f, -3.0f, -0.5f, -0.5f, 2.0f, 0.0f, -0.5f, 2.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-6.0f, -6.5f, -5.0f, 11, 2, 1, 0.0f, -1.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(3.5f, -5.5f, -4.5f, 1, 6, 1, 0.0f, -0.5f, -0.5f, -2.0f, 0.0f, -0.5f, -2.0f, 0.0f, -0.5f, 2.0f, -0.5f, -0.5f, 2.0f, -0.5f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, 1.0f, -0.5f, -0.5f, 1.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(3.5f, -6.5f, -5.0f, 1, 3, 1, 0.0f, -1.0f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -0.5f, 0.5f, -3.0f, 0.0f, 0.5f, -3.0f, 0.0f, -0.5f, 2.0f, -0.5f, -0.5f, 2.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-2.0f, -8.4f, -4.5f, 47, 25, 1, 0.0f, 0.0f, 0.0f, 0.0f, -43.0f, 0.0f, 0.0f, -43.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -23.0f, 0.0f, -43.0f, -23.0f, 0.0f, -43.0f, -23.0f, 0.0f, 0.0f, -23.0f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-4.5f, -8.0f, -4.5f, 9, 1, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
