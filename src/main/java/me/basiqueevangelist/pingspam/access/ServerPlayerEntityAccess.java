package me.basiqueevangelist.pingspam.access;

import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;

import java.util.List;

public interface ServerPlayerEntityAccess {
    List<Text> pingspam$getPings();

    List<String> pingspam$getShortnames();

    SoundEvent pingspam$getPingSound();
    void pingspam$setPingSound(SoundEvent sound);
}
