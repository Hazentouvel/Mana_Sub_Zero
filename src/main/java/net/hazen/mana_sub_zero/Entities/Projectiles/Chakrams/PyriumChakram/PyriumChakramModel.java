package net.hazen.mana_sub_zero.Entities.Projectiles.Chakrams.PyriumChakram;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.obscuria.aquamirae.common.entity.projectile.MazeRose;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class PyriumChakramModel<T extends PyriumChakram> extends EntityModel<T> {
    public final ModelPart main;

    public PyriumChakramModel(ModelPart root) {
        this.main = root.getChild("pyrium_chakram");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();
        PartDefinition pyrium_chakram = partDefinition.addOrReplaceChild("pyrium_chakram", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 0.0F));
        pyrium_chakram.addOrReplaceChild("part1", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.0F, 13.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(0.5F, -1.0F, 12.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.5F, -1.0F, 11.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(0.5F, -1.0F, 10.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(0.5F, -1.0F, 9.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(0.5F, -1.0F, 8.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(6.5F, -1.0F, 9.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(0.5F, -1.0F, 7.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(0.5F, -1.0F, 6.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(0.5F, -1.0F, 5.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(0.5F, -1.0F, 4.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(0.5F, -1.0F, 3.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(0.5F, -1.0F, 2.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(2.5F, -1.0F, 1.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(2.5F, -1.0F, 0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(1.5F, -1.0F, -0.5F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.5F, 0.0F));
        pyrium_chakram.addOrReplaceChild("part2", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.0F, 13.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(0.5F, -1.0F, 12.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.5F, -1.0F, 11.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(0.5F, -1.0F, 10.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(0.5F, -1.0F, 9.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(0.5F, -1.0F, 8.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(6.5F, -1.0F, 9.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(0.5F, -1.0F, 7.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(0.5F, -1.0F, 6.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(0.5F, -1.0F, 5.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(0.5F, -1.0F, 4.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(0.5F, -1.0F, 3.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(0.5F, -1.0F, 2.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(2.5F, -1.0F, 1.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(2.5F, -1.0F, 0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(1.5F, -1.0F, -0.5F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, -1.5708F, 0.0F));
        pyrium_chakram.addOrReplaceChild("part3", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.0F, 13.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(0.5F, -1.0F, 12.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.5F, -1.0F, 11.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(0.5F, -1.0F, 10.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(0.5F, -1.0F, 9.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(0.5F, -1.0F, 8.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(6.5F, -1.0F, 9.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(0.5F, -1.0F, 7.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(0.5F, -1.0F, 6.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(0.5F, -1.0F, 5.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(0.5F, -1.0F, 4.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(0.5F, -1.0F, 3.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(0.5F, -1.0F, 2.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(2.5F, -1.0F, 1.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(2.5F, -1.0F, 0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(1.5F, -1.0F, -0.5F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -3.1416F, 0.0F, 3.1416F));
        pyrium_chakram.addOrReplaceChild("part4", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.0F, 13.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(0.5F, -1.0F, 12.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(0.5F, -1.0F, 11.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(0.5F, -1.0F, 10.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(0.5F, -1.0F, 9.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(0.5F, -1.0F, 8.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 8).addBox(6.5F, -1.0F, 9.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(0.5F, -1.0F, 7.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(0.5F, -1.0F, 6.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(0.5F, -1.0F, 5.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(0.5F, -1.0F, 4.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(0.5F, -1.0F, 3.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(0.5F, -1.0F, 2.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(2.5F, -1.0F, 1.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(2.5F, -1.0F, 0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(1.5F, -1.0F, -0.5F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 1.5708F, 0.0F));
        return LayerDefinition.create(meshDefinition, 64, 64);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int modulate) {
        this.main.render(poseStack, vertexConsumer, packedLight, packedOverlay, modulate);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.main.yRot = ageInTicks * 0.8F;
    }
}
