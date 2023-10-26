package net.requiem.pathogen.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class keyBinding {

    public static final String KEYCATEGORYGUI = "key.category.pagn.gui";
    public static final String KEYOPENGUI = "key.pagn.opengui";

    public static final KeyMapping OPENGUIKEY = new KeyMapping(KEYOPENGUI, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_M, KEYCATEGORYGUI);



}
