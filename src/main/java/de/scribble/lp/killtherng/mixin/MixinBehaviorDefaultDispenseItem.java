package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;

@Mixin(BehaviorDefaultDispenseItem.class)
public class MixinBehaviorDefaultDispenseItem {

	/**
	* null
	*/
	@Redirect(method = "doDispense(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/dispenser/IPosition;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	private static double redirect_random_334_0(Random rand) {
		return KillTheRNG.randomness.random_334.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "doDispense(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/dispenser/IPosition;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	private static double redirect_random_335_1(Random rand) {
		return KillTheRNG.randomness.random_335.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "doDispense(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/dispenser/IPosition;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	private static double redirect_random_336_2(Random rand) {
		return KillTheRNG.randomness.random_336.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "doDispense(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/dispenser/IPosition;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	private static double redirect_random_337_3(Random rand) {
		return KillTheRNG.randomness.random_337.nextGaussian();
	}

}
