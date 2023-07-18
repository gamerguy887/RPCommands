package com.gamerguy.rpcommands;

import com.gamerguy.rpcommands.commands.GreetingCommand;
import com.gamerguy.rpcommands.commands.HandshakeCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/*
    This is the main class of the RPCommands 1.20.1 Spigot plugin
    Authors:
    -Gamerguy887
    -Mirkymoo
 */

public final class RPCommands extends JavaPlugin {

    @Override
    public void onEnable() {

        // This is where our commands get registered!
        this.getCommand("handshake").setExecutor(new HandshakeCommand());
        this.getCommand("greet").setExecutor(new GreetingCommand());

        Bukkit.getServer().getConsoleSender().sendMessage("RPCommands v1.0 has started successfully!");
        // sPlugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
