package me.omaromar93.worldchatteraddonchecker;

import me.omaromar93.worldchatter.WorldChatter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WCAC extends JavaPlugin {

    @Override
    public void onEnable() {
        WorldChatter main = (WorldChatter) Bukkit.getPluginManager().getPlugin("WorldChatter");

        main.getAPICore().addListener(this, new Listener());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
