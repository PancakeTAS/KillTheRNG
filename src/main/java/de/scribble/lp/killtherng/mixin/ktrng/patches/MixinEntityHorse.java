package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityHorse;

@Mixin(EntityHorse.class)
public class MixinEntityHorse {

	/**
	* Sets the horse variant for the child
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseVariantChild_1(Random rand, int i) {
		return KillTheRNG.randomness.horseVariantChild.nextInt(i);
//		KillTheRNG.randomness.horseVariantChild.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Sets the horse variant for the child
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_horseVariantChild_2(Random rand, int i) {
		return KillTheRNG.randomness.horseVariantChild.nextInt(i);
//		KillTheRNG.randomness.horseVariantChild.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Sets the horse variant for the child
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_horseVariantChild_3(Random rand, int i) {
		return KillTheRNG.randomness.horseVariantChild.nextInt(i);
//		KillTheRNG.randomness.horseVariantChild.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Sets the horse variant for the child
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_horseVariantChild_4(Random rand, int i) {
		return KillTheRNG.randomness.horseVariantChild.nextInt(i);
//		KillTheRNG.randomness.horseVariantChild.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Picks a random variant if genes are not set
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseInitialVariant_5(Random rand, int i) {
		return KillTheRNG.randomness.horseInitialVariant.nextInt(i);
//		KillTheRNG.randomness.horseInitialVariant.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Picks a random variant if genes are not set
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_horseInitialVariant_6(Random rand, int i) {
		return KillTheRNG.randomness.horseInitialVariant.nextInt(i);
//		KillTheRNG.randomness.horseInitialVariant.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Plays horse breath sound
	*/
	@Redirect(method = "playGallopSound(Lnet/minecraft/block/SoundType;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_horseBreathSound_7(Random rand, int i) {
		return KillTheRNG.randomness.horseBreathSound.nextInt(i);
//		KillTheRNG.randomness.horseBreathSound.nextInt(i);
//		return rand.nextInt(i);
	}

}
