package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.entity.monster.EntityGhast$GhastMoveHelper")
public class MixinEntityGhast$GhastMoveHelper {

	/**
	* null
	*/
	@Redirect(method = "onUpdateMoveHelper()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_859_0(Random rand, int i) {
		return KillTheRNG.randomness.random_859.nextInt(i);
	}

}
