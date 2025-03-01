package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIBeg;

@Mixin(EntityAIBeg.class)
public class MixinEntityAIBeg {

	/**
	* How long a wolf should beg for the item in the players hands
	*/
	@Redirect(method = "startExecuting()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiBeg_1(Random rand, int i) {
		return KillTheRNG.randomness.aiBeg.nextInt(i);
//		KillTheRNG.randomness.aiBeg.nextInt(i);
//		return rand.nextInt(i);
	}

}
