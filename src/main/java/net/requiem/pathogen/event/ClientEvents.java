package net.requiem.pathogen.event;

import jdk.jfr.Registered;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.requiem.pathogen.PathOGen;
import net.requiem.pathogen.util.keyBinding;

import javax.swing.text.JTextComponent;

import static org.lwjgl.opengl.GL11.*;

public class ClientEvents {

    @Mod.EventBusSubscriber(modid = PathOGen.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

        public static Boolean guiFl = false;

        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(keyBinding.OPENGUIKEY);
        }

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if (keyBinding.OPENGUIKEY.consumeClick())
                {
                    Minecraft.getInstance().player.sendSystemMessage(Component.literal("4"));
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
