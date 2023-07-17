package com.gamerguy.rpcommands;

import com.gamerguy.rpcommands.commands.HandshakeCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/*
    This is the main class of the RPCommands 1.20.1 Spigot plugin
    Authors:
    -Gamerguy887
 */

public final class RPCommands extends JavaPlugin {

    @Override
    public void onEnable() {

        // This is where our commands get registered!
        this.getCommand("handshake").setExecutor(new HandshakeCommand());// Plugin startup logic
        this.getCommand("greet").setExecutor(new GreetingCommand());
        Bukkit.getServer().getConsoleSender().sendMessage("RPCommands v1.0 has started successfully!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
