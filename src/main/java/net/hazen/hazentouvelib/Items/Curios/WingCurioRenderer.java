package net.hazen.hazentouvelib.Items.Curios;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.client.ICurioRenderer;

@OnlyIn(Dist.CLIENT)
public class WingCurioRenderer implements ICurioRenderer {
    ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();

    @Override
    public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack, SlotContext slotContext, PoseStack poseStack, RenderLayerParent<T, M> renderLayerParent, MultiBufferSource renderTypeBuffer, int light, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        if (renderLayerParent.getModel() instanceof HumanoidModel<?>)
        {
            var humanoidModel = (HumanoidModel<LivingEntity>) renderLayerParent.getModel();

            poseStack.pushPose();
            humanoidModel.body.translateAndRotate(poseStack);
            // x = sideways, y = up/down, z = forward/back
            poseStack.translate(0.0D, 0.25D, -0.05D);

            poseStack.mulPose(Axis.XP.rotationDegrees(180.0F));

            poseStack.scale(1f, 1f, 1f);

            itemRenderer.renderStatic(stack, ItemDisplayContext.FIXED, light, OverlayTexture.NO_OVERLAY, poseStack, renderTypeBuffer, null, 0);
            poseStack.popPose();
        }
    }
}