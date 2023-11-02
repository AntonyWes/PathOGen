package net.requiem.pathogen.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.requiem.pathogen.PathOGen;
import net.requiem.pathogen.gui.ModGui;
import net.requiem.pathogen.util.keyBinding;

public class ClientEvents {


    static Boolean GuiFL = false;
    @Mod.EventBusSubscriber(modid = PathOGen.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(keyBinding.OPENGUIKEY);
        }
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if (keyBinding.OPENGUIKEY.consumeClick()) {
                Minecraft.getInstance().setScreen(new ModGui());
            }
        }

    }

    @Mod.EventBusSubscriber(modid = PathOGen.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(keyBinding.OPENGUIKEY);
        }

    }
}
