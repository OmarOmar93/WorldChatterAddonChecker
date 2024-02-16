package me.omaromar93.worldchatteraddonchecker;

import me.omaromar93.worldchatter.utils.API.WorldChatterAPI;
import org.bukkit.command.CommandSender;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.List;

public class Listener implements WorldChatterAPI {
    @Override
    public void messageDetect(AsyncPlayerChatEvent asyncPlayerChatEvent, List<String> list) {
        System.out.println("Event Check: " + asyncPlayerChatEvent.getMessage() + " flags: " + String.join(", ", list));
    }

    @Override
    public void chatLockToggle(CommandSender commandSender, boolean b) {
        System.out.println("ChatLock Toggled to " + b);
    }

    @Override
    public void updateChecked(boolean b) {
        System.out.println("Is it updated?: " + (b ? "yes" : "no"));
    }

    @Override
    public void configReload(CommandSender commandSender) {
        if (commandSender == null) {
            System.out.println("Config has been executed by WorldChatter");
        } else {
            System.out.println("Config has been executed by " + commandSender.getName());
        }
    }
}
