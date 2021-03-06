// Date: 5/6/2012 1:09:16 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.SkeletonQuadruped;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelEevee extends PixelmonModelBase {
	// fields
	ModelRenderer BODY;
	ModelRenderer TailX, TailY;

	public ModelEevee() {
		ModelRenderer HEADBASE;
		ModelRenderer legBR;
		ModelRenderer legBL;
		ModelRenderer legFR;
		ModelRenderer legFL;
		textureWidth = 64;
		textureHeight = 64;
		BODY = new ModelRenderer(this, "Body");
		BODY.setRotationPoint(-0.5f, 18, -2);
		ModelRenderer Body = new ModelRenderer(this, 0, 13);
		Body.addBox(-1.5F, -2F, -3F, 3, 6, 3);
		Body.setTextureSize(64, 64);
		Body.mirror = true;
		setRotation(Body, 1.570796F, 0F, 0F);
		BODY.addChild(Body);
		ModelRenderer Mane = new ModelRenderer(this, 0, 7);
		Mane.addBox(-2F, -2F, -2F, 4, 4, 2);
		Mane.setRotationPoint(0, -1, 0);
		Mane.setTextureSize(64, 64);
		Mane.mirror = true;
		setRotation(Mane, 1.937315F, 0F, 0F);
		BODY.addChild(Mane);
		ModelRenderer fluff1 = new ModelRenderer(this, 24, 4);
		fluff1.addBox(-2F, 0F, 0F, 4, 3, 0);
		fluff1.setRotationPoint(2, -1, -1);
		fluff1.setTextureSize(64, 64);
		fluff1.mirror = true;
		setRotation(fluff1, 0.1047198F, 1.570796F, 0.3490659F);
		BODY.addChild(fluff1);
		ModelRenderer fluff2 = new ModelRenderer(this, 24, 0);
		fluff2.addBox(-2F, 0F, 0F, 4, 3, 0);
		fluff2.setRotationPoint(0, -0.2F, -2.8F);
		fluff2.setTextureSize(64, 64);
		fluff2.mirror = true;
		setRotation(fluff2, 0F, 0F, 0F);
		BODY.addChild(fluff2);
		ModelRenderer fluff3 = new ModelRenderer(this, 24, 8);
		fluff3.addBox(-2F, 0F, 0F, 4, 3, 0);
		fluff3.setRotationPoint(-2, -1, -1);
		fluff3.setTextureSize(64, 64);
		fluff3.mirror = true;
		setRotation(fluff3, -0.1047198F, 1.570796F, 0.3490659F);
		BODY.addChild(fluff3);
		ModelRenderer fluff4 = new ModelRenderer(this, 24, 12);
		fluff4.addBox(-2F, 0F, 0F, 4, 2, 0);
		fluff4.setRotationPoint(0, -1.7F, 0.9F);
		fluff4.setTextureSize(64, 64);
		fluff4.mirror = true;
		setRotation(fluff4, 0.5585054F, 0F, 0F);
		BODY.addChild(fluff4);
		legBR = new ModelRenderer(this, 12, 0);
		legBR.addBox(-1F, 0F, 0F, 1, 3, 1);
		legBR.setRotationPoint(-0.5F, 3F, 3F);
		legBR.setTextureSize(64, 64);
		legBR.mirror = true;
		BODY.addChild(legBR);
		legBL = new ModelRenderer(this, 12, 0);
		legBL.addBox(0F, 0F, 0F, 1, 3, 1);
		legBL.setRotationPoint(0.5F, 3F, 3F);
		legBL.setTextureSize(64, 64);
		legBL.mirror = true;
		BODY.addChild(legBL);
		legFR = new ModelRenderer(this, 12, 0);
		legFR.addBox(-1F, 0F, -1F, 1, 3, 1);
		legFR.setRotationPoint(-0.5F, 3F, -1F);
		legFR.setTextureSize(64, 64);
		legFR.mirror = true;
		BODY.addChild(legFR);
		legFL = new ModelRenderer(this, 12, 0);
		legFL.addBox(0F, 0F, -1F, 1, 3, 1);
		legFL.setRotationPoint(0.5F, 3F, -1F);
		legFL.setTextureSize(64, 64);
		legFL.mirror = true;
		BODY.addChild(legFL);
		TailX = new ModelRenderer(this, 0, 18);
		TailX.addBox(0F, 0F, -2.5F, 0, 6, 5);
		TailX.setRotationPoint(0, 0.5F, 3.5F);
		TailX.setTextureSize(64, 64);
		TailX.mirror = true;
		setRotation(TailX, 2.356194F, 0F, 0F);
		TailY = new ModelRenderer(this, 0, 23);
		TailY.addBox(-2.5F, 0F, 0F, 5, 6, 0);
		TailY.setRotationPoint(0, 0.5F, 3.5F);
		TailY.setTextureSize(64, 64);
		TailY.mirror = true;
		setRotation(TailY, 2.356194F, 0F, 0F);
		BODY.addChild(TailX);
		BODY.addChild(TailY);
		HEADBASE = new ModelRenderer(this, "HEADBASE");
		HEADBASE.setRotationPoint(0F, 0F, -1F);
		setRotation(HEADBASE, 0F, 0F, 0F);
		HEADBASE.mirror = true;
		ModelRenderer Nose = new ModelRenderer(this, 18, 4);
		Nose = new ModelRenderer(this, 18, 4);
		Nose.addBox(-0.5F, -2.3F, -0.5F, 1, 0, 1);
		Nose.setRotationPoint(0F, 0F, 0F);
		Nose.setTextureSize(64, 64);
		Nose.mirror = true;
		setRotation(Nose, 0.3839724F, 0.7679449F, 0.3839724F);
		ModelRenderer rightear = new ModelRenderer(this, 17, 0);
		rightear = new ModelRenderer(this, 17, 0);
		rightear.addBox(-4.5F, -6.2F, 1F, 3, 3, 0);
		rightear.setRotationPoint(0F, 0F, 0F);
		rightear.setTextureSize(64, 64);
		rightear.mirror = true;
		setRotation(rightear, 0F, 0F, 0.1396263F);
		ModelRenderer leftear = new ModelRenderer(this, 17, 0);
		leftear = new ModelRenderer(this, 17, 0);
		leftear.addBox(-6.2F, -4.5F, 1F, 3, 3, 0);
		leftear.setRotationPoint(0F, 0F, 0F);
		leftear.setTextureSize(64, 64);
		leftear.mirror = true;
		setRotation(leftear, 0F, 0F, 1.43117F);
		ModelRenderer Head = new ModelRenderer(this, 0, 0);
		Head = new ModelRenderer(this, 0, 0);
		Head.addBox(-1.5F, -4F, -1.5F, 3, 4, 3);
		Head.setRotationPoint(0F, 0F, 0F);
		Head.setTextureSize(64, 64);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		HEADBASE.addChild(Nose);
		HEADBASE.addChild(rightear);
		HEADBASE.addChild(leftear);
		HEADBASE.addChild(Head);
		BODY.addChild(HEADBASE);
		ModuleHead head = new ModuleHead(HEADBASE);
		skeleton = new SkeletonQuadruped(BODY, head, legFL, legFR, legBL, legBR, 1f, 1f, 1f);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		BODY.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		TailX.rotateAngleY = MathHelper.cos(f * 1F) * .9F * f1;
		TailY.rotateAngleY = MathHelper.cos(f * 1F) * .9F * f1;
	}

}
