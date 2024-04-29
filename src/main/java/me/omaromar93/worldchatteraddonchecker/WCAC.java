package me.omaromar93.worldchatteraddonchecker;

import API.APICore;
import UniversalFunctions.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class WCAC extends JavaPlugin {

    @Override
    public void onEnable() {
        // new
        APICore api = new APICore();
        api.addListener(new Plugin(this.getName(),this.getDescription().getDescription(),this.getDescription().getAuthors()), new Listener());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
