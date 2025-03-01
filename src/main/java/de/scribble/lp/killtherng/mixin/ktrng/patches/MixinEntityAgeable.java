package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.EntityAgeable;

@Mixin(EntityAgeable.class)
public class MixinEntityAgeable {

	/**
	* Particles when a child grows up
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_ageableGrowUpParticle_1(Random rand) {
		return KillTheRNG.randomness.ageableGrowUpParticle.nextFloat();
//		KillTheRNG.randomness.ageableGrowUpParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when a child grows up
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_ageableGrowUpParticle_2(Random rand) {
		return KillTheRNG.randomness.ageableGrowUpParticle.nextFloat();
//		KillTheRNG.randomness.ageableGrowUpParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Particles when a child grows up
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_ageableGrowUpParticle_3(Random rand) {
		return KillTheRNG.randomness.ageableGrowUpParticle.nextFloat();
//		KillTheRNG.randomness.ageableGrowUpParticle.nextFloat();
//		return rand.nextFloat();
	}

}
