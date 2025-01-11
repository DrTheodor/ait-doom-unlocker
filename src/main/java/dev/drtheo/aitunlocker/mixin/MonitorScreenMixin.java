package dev.drtheo.aitunlocker.mixin;

import loqor.ait.client.screens.MonitorScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MonitorScreen.class)
public class MonitorScreenMixin {

    @Redirect(method = "changeCategory", at = @At(value = "INVOKE", target = "Lloqor/ait/client/screens/MonitorScreen;changeCategory(Z)V"))
    public void changeDirection(MonitorScreen instance, boolean direction) { }
}
