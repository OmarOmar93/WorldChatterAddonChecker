package me.omaromar93.worldchatteraddonchecker;

import API.WorldChatterAPI;
import UniversalFunctions.ChatEvent;
import UniversalFunctions.CommandSender;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.List;

public class Listener implements WorldChatterAPI {
    @Override
    public void messageDetect(ChatEvent chatEvent, List<String> list, Object o) {
        System.out.println("Event Check: " + chatEvent.getMessage() + " flags: " + String.join(", ", list));
    }

    @Override
    public void chatLockToggle(CommandSender commandSender, boolean b, Object o) {
        System.out.println("ChatLock Toggled to " + b);
    }


    @Override
    public void updateChecked(boolean b) {
        System.out.println("Is it updated?: " + (b ? "yes" : "no"));
    }

    @Override
    public void configReload(CommandSender commandSender, Object o) {
        if (commandSender == null) {
            System.out.println("Config has been executed by WorldChatter");
        } else {
            System.out.println("Config has been executed by " + commandSender.getName());
        }
    }

}
