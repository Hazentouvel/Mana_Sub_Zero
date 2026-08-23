package net.hazen.mana_sub_zero.Entities.Projectiles.Chakrams.PyriumChakram;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import dev.obscuria.aquamirae.Aquamirae;
import dev.obscuria.aquamirae.client.model.AquamiraeModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class PyriumChakramRenderer<T extends PyriumChakram> extends EntityRenderer<T> {
    public static final ResourceLocation TEXTURE = Aquamirae.id("textures/entity/maze_rose.png");
    private final PyriumChakramModel<T> model;

    public PyriumChakramRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new PyriumChakramModel<>(context.bakeLayer(AquamiraeModelLayers.MAZE_ROSE));
    }

    public void render(T entity, float entityYaw, float partialTicks, PoseStack pose, MultiBufferSource buffer, int packedLight) {
        pose.pushPose();
        float yaw = Mth.rotLerp(partialTicks, entity.yRotO, entity.getYRot());
        float pitch = Mth.lerp(partialTicks, entity.xRotO, entity.getXRot());
        pose.mulPose(Axis.YP.rotationDegrees(yaw + 180.0F));
        pose.mulPose(Axis.XP.rotationDegrees(pitch));
        pose.scale(-1.0F, -1.0F, 1.0F);
        pose.translate(0.0F, -1.501F, 0.0F);
        float ageInTicks = (float)entity.tickCount + partialTicks;
        this.model.setupAnim(entity, 0.0F, 0.0F, ageInTicks, yaw, pitch);
        VertexConsumer consumer = buffer.getBuffer(this.model.renderType(this.getTextureLocation(entity)));
        this.model.renderToBuffer(pose, consumer, packedLight, OverlayTexture.NO_OVERLAY, -1);
        pose.popPose();
        super.render(entity, entityYaw, partialTicks, pose, buffer, packedLight);
    }

    public ResourceLocation getTextureLocation(T entity) {
        return TEXTURE;
    }
}
