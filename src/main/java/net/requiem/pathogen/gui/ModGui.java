package net.requiem.pathogen.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class ModGui extends Screen {
    public ModGui() {
        super(Component.literal("ScreenGui"));
    }

    static final int BLACK_GREEN = 0x99247725;
    static final int BLACK = 0x99000000;

    @Override
    public void render(@NotNull PoseStack stack, int MouseX, int MouseY, float ParticalTicks) {
        this.renderBackground(stack);
        drawString(stack, this.font, Minecraft.getInstance().player.getName(), 5, 5, 99999);
        super.render(stack, MouseX, MouseY, ParticalTicks);
    }

    @Override
    public void renderBackground(PoseStack stack) {
        draw(stack, 0.0, 0.0, 0.2, 0.8, BLACK_GREEN, BLACK);
        draw(stack, 0.0, 0.8, 0.2, 1.0, BLACK, BLACK);
        draw(stack, 0.2, 0.8, 1.0, 1.0, BLACK, BLACK);
        super.renderBackground(stack);
    }

    private void draw(PoseStack stack, double x, double y, double x1, double y1, int color1, int color2){
        fillGradient(stack,
                (int) (this.width - Math.abs((1.0 - x) * this.width)),
                (int) (this.height - Math.abs((1.0 - y) * this.height)),
                (int) (this.width - Math.abs((1.0 - x1) * this.width)),
                (int) (this.height - Math.abs((1.0 - y1) * this.height)),
                color1, color2);
    }


}
