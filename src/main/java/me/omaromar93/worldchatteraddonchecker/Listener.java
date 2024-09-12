package me.omaromar93.worldchatteraddonchecker;

import WorldChatterCore.API.WCListener;
import WorldChatterCore.Connectors.Interfaces.CommandSender;
import WorldChatterCore.Features.ChatLock;
import WorldChatterCore.Players.Player;
import WorldChatterCore.Systems.UpdateSystem;

import java.util.List;

public class Listener implements WCListener {

    @Override
    public void messageDetect(List<String> list, Player player, String s) {
        System.out.println("Event Check: " + s + " flags: " + String.join(", ", list));
    }

    @Override
    public void chatLockToggle(CommandSender commandSender) {
        System.out.println("ChatLock Toggled to " + ChatLock.INSTANCE.isLocked());
    }

    @Override
    public void updateChecked(CommandSender commandSender) {
        System.out.println("Is it updated?: " + (UpdateSystem.INSTANCE.getBuild() > 200 ? "yes" : "no"));
        System.out.println("Is development build?: " + (UpdateSystem.INSTANCE.isDev() ? "yes" : "no"));
    }

    @Override
    public void senderConfigReload(CommandSender commandSender) {
        if (commandSender == null) {
            System.out.println("Config has been executed by WorldChatter");
        } else {
            System.out.println("Config has been executed by " + commandSender.getName());
        }
    }
}