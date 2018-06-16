/*
 * This file is part of Matter Overdrive
 * Copyright (C) 2018, Horizon Studio <contact@hrznstudio.com>, All rights reserved.
 *
 * Matter Overdrive is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Matter Overdrive is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Matter Overdrive.  If not, see <http://www.gnu.org/licenses>.
 */
// Date: 11/24/2015 8:47:13 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package matteroverdrive.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTritaniumArmor extends ModelBiped {
    public final ModelRenderer VisorUpperPart;
    public final ModelRenderer VisorFrontPart;
    public final ModelRenderer Chestplate;
    public final ModelRenderer ChestplateSupportLeft;
    public final ModelRenderer ChestplateSupportRight;
    public final ModelRenderer Backplate;
    public final ModelRenderer BackplateSupport;
    public final ModelRenderer FootLeft;
    public final ModelRenderer FootRight;
    public final ModelRenderer ShoulderLeft;
    public final ModelRenderer ShoulderRight;
    public final ModelRenderer ShoulderL1;
    public final ModelRenderer ShoulderR1;
    //fields
    int part;

    public ModelTritaniumArmor(float expand) {
        super(expand, 0, 64, 64);
        bipedHeadwear.isHidden = true;
        this.isChild = false;        //head
        VisorUpperPart = new ModelRenderer(this, 42, 8);
        VisorUpperPart.addBox(-4F, -8.4F, 0.5F, 8, 2, 3, expand);
        VisorUpperPart.setRotationPoint(0F, 0F, 0F);
        VisorUpperPart.setTextureSize(64, 64);
        VisorUpperPart.mirror = true;
        setRotation(VisorUpperPart, 0.8464847F, 0F, 0F);
        VisorFrontPart = new ModelRenderer(this, 44, 0);
        VisorFrontPart.addBox(-4F, -6F, -6F, 8, 6, 2, expand);
        VisorFrontPart.setRotationPoint(0F, 0F, 0F);
        VisorFrontPart.setTextureSize(64, 64);
        VisorFrontPart.mirror = true;
        setRotation(VisorFrontPart, 0F, 0F, 0F);
        bipedHead.addChild(VisorUpperPart);
        bipedHead.addChild(VisorFrontPart);

        //torso
        Chestplate = new ModelRenderer(this, 0, 32);
        Chestplate.addBox(-4F, 0F, -5F, 8, 6, 3, expand);
        Chestplate.setRotationPoint(0F, 0F, 0F);
        Chestplate.setTextureSize(64, 64);
        Chestplate.mirror = true;
        setRotation(Chestplate, 0F, 0F, 0F);
        ChestplateSupportLeft = new ModelRenderer(this, 0, 41);
        ChestplateSupportLeft.addBox(-4F, 1F, -7.5F, 2, 4, 2, expand);
        ChestplateSupportLeft.setRotationPoint(0F, 0F, 0F);
        ChestplateSupportLeft.setTextureSize(64, 64);
        ChestplateSupportLeft.mirror = true;
        setRotation(ChestplateSupportLeft, 0.7504916F, 0F, 0F);
        ChestplateSupportRight = new ModelRenderer(this, 14, 41);
        ChestplateSupportRight.addBox(2F, 1F, -7.5F, 2, 4, 2, expand);
        ChestplateSupportRight.setRotationPoint(0F, 0F, 0F);
        ChestplateSupportRight.setTextureSize(64, 64);
        ChestplateSupportRight.mirror = true;
        setRotation(ChestplateSupportRight, 0.7504916F, 0F, 0F);
        Backplate = new ModelRenderer(this, 42, 33);
        Backplate.addBox(-4F, 0F, 2F, 8, 6, 3, expand);
        Backplate.setRotationPoint(0F, 0F, 0F);
        Backplate.setTextureSize(64, 64);
        Backplate.mirror = true;
        setRotation(Backplate, 0F, 0F, 0F);
        BackplateSupport = new ModelRenderer(this, 44, 42);
        BackplateSupport.addBox(-4F, 3F, 4F, 8, 4, 2, expand);
        BackplateSupport.setRotationPoint(0F, 0F, 0F);
        BackplateSupport.setTextureSize(64, 64);
        BackplateSupport.mirror = true;
        setRotation(BackplateSupport, -0.3828089F, 0F, 0F);
        bipedBody.addChild(Chestplate);
        bipedBody.addChild(ChestplateSupportLeft);
        bipedBody.addChild(ChestplateSupportRight);
        bipedBody.addChild(Backplate);
        bipedBody.addChild(BackplateSupport);        //left shoulder
        ShoulderLeft = new ModelRenderer(this, 0, 47);
        ShoulderLeft.addBox(4.5F, -4.2F, -1F, 2, 3, 4, expand);
        ShoulderLeft.setRotationPoint(0F, 4F, -1F);
        ShoulderLeft.setTextureSize(64, 64);
        ShoulderLeft.mirror = true;
        setRotation(ShoulderLeft, 0F, 0F, -0.5159565F);
        ShoulderL1 = new ModelRenderer(this, 0, 55);
        ShoulderL1.addBox(3F, -0.2F, -2F, 2, 2, 4, expand);
        ShoulderL1.setRotationPoint(0F, 0F, 0F);
        ShoulderL1.setTextureSize(64, 64);
        ShoulderL1.mirror = true;
        setRotation(ShoulderL1, 0F, 0F, 0F);
        bipedLeftArm.addChild(ShoulderLeft);
        bipedLeftArm.addChild(ShoulderL1);

        //right shoulder
        ShoulderRight = new ModelRenderer(this, 14, 47);
        ShoulderRight.addBox(-4, -1, -2f, 2, 3, 4, expand);
        ShoulderRight.setRotationPoint(0F, 0F, 0F);
        ShoulderRight.setTextureSize(64, 64);
        ShoulderRight.mirror = true;
        setRotation(ShoulderRight, 0F, 0F, 0.5159542F);
        ShoulderR1 = new ModelRenderer(this, 14, 55);
        ShoulderR1.addBox(-4.5F, -0.2F, -2F, 2, 2, 4, expand);
        ShoulderR1.setRotationPoint(0F, 0F, 0F);
        ShoulderR1.setTextureSize(64, 64);
        ShoulderR1.mirror = true;
        setRotation(ShoulderR1, 0F, 0F, 0F);
        bipedRightArm.addChild(ShoulderR1);
        bipedRightArm.addChild(ShoulderRight);

        //feet
        FootLeft = new ModelRenderer(this, 29, 59);
        FootLeft.addBox(-1, 11F, -3F, 2, 1, 1, expand);
        FootLeft.setRotationPoint(0F, 0F, 0F);
        FootLeft.setTextureSize(64, 64);
        FootLeft.mirror = true;
        setRotation(FootLeft, 0F, 0F, 0F);
        FootRight = new ModelRenderer(this, 36, 59);
        FootRight.addBox(-1F, 11F, -3F, 2, 1, 1, expand);
        FootRight.setRotationPoint(0F, 0F, 0F);
        FootRight.setTextureSize(64, 64);
        FootRight.mirror = true;
        setRotation(FootRight, 0F, 0F, 0F);

        bipedLeftLeg.addChild(FootLeft);
        bipedRightLeg.addChild(FootRight);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        //setRotationAngles(f,f1,f2,f3,f4,f5,entity);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
