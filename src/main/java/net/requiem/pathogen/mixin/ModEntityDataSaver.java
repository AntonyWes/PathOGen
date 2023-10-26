package net.requiem.pathogen.mixin;

import net.minecraft.nbt.CompoundTag;
import net.requiem.pathogen.util.IEntityDataSaver;
import org.spongepowered.asm.mixin.Mixin;

import javax.swing.text.html.parser.Entity;

@Mixin(Entity.class)
public abstract class ModEntityDataSaver implements IEntityDataSaver {

    private CompoundTag persistentData;

    @Override
    public CompoundTag getPersistentData() {
        if(this.persistentData == null) {
            this.persistentData = new CompoundTag();
        }
        return persistentData;
    }
}
