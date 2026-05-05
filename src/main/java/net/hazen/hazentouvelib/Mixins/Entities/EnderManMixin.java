package net.hazen.hazentouvelib.Mixins.Entities;
import net.hazen.hazentouvelib.Datagen.HLTags;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.EnderMan;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EnderMan.class)
public class EnderManMixin {
    @Inject(method = "registerGoals", at = @At("HEAD"))
    void astralConstructHatred(CallbackInfo ci)
    {
        EnderMan self = (EnderMan) (Object) this;

        self.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(self, Mob.class, true, entity -> entity.getType().is(HLTags.ASTRAL_CONSTRUCT)));
        self.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(self, Mob.class, true, (entity) -> !entity.getType().is(HLTags.SPAWNS_OF_ENDER)));
    }
}