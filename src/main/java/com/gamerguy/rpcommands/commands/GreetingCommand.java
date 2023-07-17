package com.gamerguy.rpcommands.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GreetingCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // Check if the sender is a Player
        if (sender instanceof Player){
            Player player = (Player) sender;

            // Check if the player didn't input a username after /greet"
            if (args.length == 0){
                player.sendMessage("Try /greet <username> instead.");
                return false;
            }

            // Check if they player put in too many usernames after /greet"
            if (args.length > 1) {
                player.sendMessage("Too many arguments! Try /greet <username> instead.");
                return false;
            }

            // Check if player is online
            if ( Bukkit.getServer().getPlayerExact(args[0]) == null ) {
                player.sendMessage("Error! Targeted player (" + args[0] + ") is not online!");
                return false;
            }

            // Store player into a little variable so we can manipulate it and do cool stuffs O_O
            Player target = Bukkit.getServer().getPlayerExact(args[0]);

            // Send messages to the player, sender, and server! :)
            target.sendMessage(ChatColor.of("#F836FF") + player.getName() + " says hello :>");
            player.sendMessage(ChatColor.of("#F836FF") + "You told " + target.getName() + " hello!");
            System.out.println("<RPCommands> " + player.getName() + " told " + target.getName() + "hello!");

            // Done!
            return true;
        }

        return false;
    }
}