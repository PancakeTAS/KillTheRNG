package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntitySlime;

@Mixin(EntitySlime.class)
public class MixinEntitySlime {

	/**
	* Pitch of slime attack sound
	*/
	@Redirect(method = "dealDamage(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_slimeSoundAttack_1(Random rand) {
		return KillTheRNG.randomness.slimeSoundAttack.nextFloat();
//		KillTheRNG.randomness.slimeSoundAttack.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of slime attack sound
	*/
	@Redirect(method = "dealDamage(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_slimeSoundAttack_2(Random rand) {
		return KillTheRNG.randomness.slimeSoundAttack.nextFloat();
//		KillTheRNG.randomness.slimeSoundAttack.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Whether slimes spawn in a flat world
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_slimeSpawnFlatWorld_3(Random rand) {
		return KillTheRNG.randomness.slimeSpawnFlatWorld.nextFloat();
//		KillTheRNG.randomness.slimeSpawnFlatWorld.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Whether slimes spawn in a flat world
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_slimeSpawnFlatWorld_4(Random rand) {
		return KillTheRNG.randomness.slimeSpawnFlatWorld.nextFloat();
//		KillTheRNG.randomness.slimeSpawnFlatWorld.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Whether slimes spawn in a flat world
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_slimeSpawnFlatWorld_5(Random rand, int i) {
		return KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
//		KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Whether slimes spawn in a flat world
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_slimeSpawnFlatWorld_6(Random rand, int i) {
		return KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
//		KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Whether slimes spawn in a flat world
	*/
	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_slimeSpawnFlatWorld_7(Random rand, int i) {
		return KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
//		KillTheRNG.randomness.slimeSpawnFlatWorld.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* A delay between jumps of the slime
	*/
	@Redirect(method = "getJumpDelay()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_slimeJumpDelay_8(Random rand, int i) {
		return KillTheRNG.randomness.slimeJumpDelay.nextInt(i);
//		KillTheRNG.randomness.slimeJumpDelay.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Does a water splash effect when slime is in water
	*/
	@Redirect(method = "notifyDataManagerChange(Lnet/minecraft/network/datasync/DataParameter;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_slimeWaterSplashEffect_9(Random rand, int i) {
		return KillTheRNG.randomness.slimeWaterSplashEffect.nextInt(i);
//		KillTheRNG.randomness.slimeWaterSplashEffect.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How big the slime is when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_slimeSize_10(Random rand, int i) {
		return KillTheRNG.randomness.slimeSize.nextInt(i);
//		KillTheRNG.randomness.slimeSize.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How big the slime is when spawning
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_slimeSize_11(Random rand) {
		return KillTheRNG.randomness.slimeSize.nextFloat();
//		KillTheRNG.randomness.slimeSize.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of slime particle on slimes duh
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_slimeParticle_12(Random rand) {
		return KillTheRNG.randomness.slimeParticle.nextFloat();
//		KillTheRNG.randomness.slimeParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of slime particle on slimes duh
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_slimeParticle_13(Random rand) {
		return KillTheRNG.randomness.slimeParticle.nextFloat();
//		KillTheRNG.randomness.slimeParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of slime particle on slimes duh
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_slimeParticle_14(Random rand) {
		return KillTheRNG.randomness.slimeParticle.nextFloat();
//		KillTheRNG.randomness.slimeParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of slime particle on slimes duh
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_slimeParticle_15(Random rand) {
		return KillTheRNG.randomness.slimeParticle.nextFloat();
//		KillTheRNG.randomness.slimeParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* How many slimes will be spawned after splitting up
	*/
	@Redirect(method = "setDead()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_slimeSplitting_16(Random rand, int i) {
		return KillTheRNG.randomness.slimeSplitting.nextInt(i);
//		KillTheRNG.randomness.slimeSplitting.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How many slimes will be spawned after splitting up
	*/
	@Redirect(method = "setDead()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_slimeSplitting_17(Random rand) {
		return KillTheRNG.randomness.slimeSplitting.nextFloat();
//		KillTheRNG.randomness.slimeSplitting.nextFloat();
//		return rand.nextFloat();
	}

}
