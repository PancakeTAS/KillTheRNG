package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockSkull;

@Mixin(BlockSkull.class)
public class MixinBlockSkull {

	/**
	* null
	*/
	@Redirect(method = "checkWitherSpawn(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/tileentity/TileEntitySkull;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_512_1(Random rand) {
		return KillTheRNG.randomness.random_512.nextDouble();
//		KillTheRNG.randomness.random_512.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "checkWitherSpawn(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/tileentity/TileEntitySkull;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_513_2(Random rand) {
		return KillTheRNG.randomness.random_513.nextDouble();
//		KillTheRNG.randomness.random_513.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "checkWitherSpawn(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/tileentity/TileEntitySkull;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_514_3(Random rand) {
		return KillTheRNG.randomness.random_514.nextDouble();
//		KillTheRNG.randomness.random_514.nextDouble();
//		return rand.nextDouble();
	}

}
