package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAILeapAtTarget;

@Mixin(EntityAILeapAtTarget.class)
public class MixinEntityAILeapAtTarget {

	/**
	* If the entity should leap at the target
	*/
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiLeapAtTargetLeapChance_1(Random rand, int i) {
		return KillTheRNG.randomness.aiLeapAtTargetLeapChance.nextInt(i);
//		KillTheRNG.randomness.aiLeapAtTargetLeapChance.nextInt(i);
//		return rand.nextInt(i);
	}

}
