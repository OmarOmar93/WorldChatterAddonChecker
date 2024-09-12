package me.omaromar93.worldchatteraddonchecker;


import WorldChatterCore.API.Addon;
import WorldChatterCore.API.WCA;
import org.bukkit.plugin.java.JavaPlugin;

public final class WCAC extends JavaPlugin {

    @Override
    public void onEnable() {
        // new
        final WCA api = new WCA();
        final Addon main = api.createWCAddon(this.getName(),this.getDescription().getAuthors().get(0),this.getDescription().getDescription(),"WCAC","1.0");
        api.addListener(main, new Listener());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
