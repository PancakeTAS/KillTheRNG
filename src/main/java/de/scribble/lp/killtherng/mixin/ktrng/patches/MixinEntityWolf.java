package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityWolf;

@Mixin(EntityWolf.class)
public class MixinEntityWolf {

	/**
	* Whether the wolf makes an ambient sound or health related sounds
	*/
	@Redirect(method = "getAmbientSound()Lnet/minecraft/util/SoundEvent;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_wolfAmbientSound_1(Random rand, int i) {
		return KillTheRNG.randomness.wolfAmbientSound.nextInt(i);
//		KillTheRNG.randomness.wolfAmbientSound.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of wolf shaking sound
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_wolfShakeSound_2(Random rand) {
		return KillTheRNG.randomness.wolfShakeSound.nextFloat();
//		KillTheRNG.randomness.wolfShakeSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of wolf shaking sound
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_wolfShakeSound_3(Random rand) {
		return KillTheRNG.randomness.wolfShakeSound.nextFloat();
//		KillTheRNG.randomness.wolfShakeSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of wolf shaking sound
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_wolfShakeSound_4(Random rand) {
		return KillTheRNG.randomness.wolfShakeSound.nextFloat();
//		KillTheRNG.randomness.wolfShakeSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of wolf shaking sound
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_wolfShakeSound_5(Random rand) {
		return KillTheRNG.randomness.wolfShakeSound.nextFloat();
//		KillTheRNG.randomness.wolfShakeSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* If taming is successful
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_wolfTamingChance_6(Random rand, int i) {
		return KillTheRNG.randomness.wolfTamingChance.nextInt(i);
//		KillTheRNG.randomness.wolfTamingChance.nextInt(i);
//		return rand.nextInt(i);
	}

}
