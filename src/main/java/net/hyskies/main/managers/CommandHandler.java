package net.hyskies.main.managers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.io.IOException;

public interface CommandHandler {
    // Don't touch or I will kill u
    void execute (CommandSender sender, Command command, String[] args) throws IOException;
}
