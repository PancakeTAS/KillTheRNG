package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenReed;

@Mixin(WorldGenReed.class)
public class MixinWorldGenReed {

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1205_1(Random rand, int i) {
//		return KillTheRNG.randomness.random_1205.nextInt(i);
		KillTheRNG.randomness.random_1205.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1206_2(Random rand, int i) {
//		return KillTheRNG.randomness.random_1206.nextInt(i);
		KillTheRNG.randomness.random_1206.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1207_3(Random rand, int i) {
//		return KillTheRNG.randomness.random_1207.nextInt(i);
		KillTheRNG.randomness.random_1207.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1208_4(Random rand, int i) {
//		return KillTheRNG.randomness.random_1208.nextInt(i);
		KillTheRNG.randomness.random_1208.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1209_5(Random rand, int i) {
//		return KillTheRNG.randomness.random_1209.nextInt(i);
		KillTheRNG.randomness.random_1209.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1210_6(Random rand, int i) {
//		return KillTheRNG.randomness.random_1210.nextInt(i);
		KillTheRNG.randomness.random_1210.nextInt(i);
		return rand.nextInt(i);
	}

}
