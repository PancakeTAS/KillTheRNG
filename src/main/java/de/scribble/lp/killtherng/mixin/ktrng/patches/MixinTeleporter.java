package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.Teleporter;

@Mixin(Teleporter.class)
public class MixinTeleporter {

	/**
	* null
	*/
	@Redirect(method = "makePortal(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1640_1(Random rand, int i) {
//		return KillTheRNG.randomness.random_1640.nextInt(i);
		KillTheRNG.randomness.random_1640.nextInt(i);
		return rand.nextInt(i);
	}

}
