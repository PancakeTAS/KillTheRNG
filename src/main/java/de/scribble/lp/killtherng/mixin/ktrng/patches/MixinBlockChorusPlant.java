package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockChorusPlant;

@Mixin(BlockChorusPlant.class)
public class MixinBlockChorusPlant {

	/**
	* null
	*/
	@Redirect(method = "quantityDropped(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_542_1(Random rand, int i) {
		return KillTheRNG.randomness.random_542.nextInt(i);
//		KillTheRNG.randomness.random_542.nextInt(i);
//		return rand.nextInt(i);
	}

}
