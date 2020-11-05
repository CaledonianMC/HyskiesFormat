package net.hyskies.main.managers;

import net.hyskies.main.commands.HyskiesFormat;
import net.hyskies.main.commands.ToggleDeath;
import net.hyskies.main.commands.ToggleJoin;
import net.hyskies.main.commands.inventory.DeathInv;
import net.hyskies.main.commands.inventory.JoinInv;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CommandManager implements CommandExecutor {
    private Map<String, CommandHandler> commands = new HashMap<>();
    private JavaPlugin javaPlugin;
    public CommandManager(JavaPlugin javaPlugin){
        this.javaPlugin = javaPlugin;
        initCommands();
    }
    private void initCommands(){
        // Core
        commands.put("hyskiesformat", new HyskiesFormat(javaPlugin));
        // Inventories
        commands.put("death", new DeathInv());
        commands.put("join", new JoinInv());
        // Testing
        commands.put("togglejoin", new ToggleJoin());
        commands.put("toggledeath", new ToggleDeath());
        registerCommands();
    }
    private void registerCommands() { commands.forEach((s, c) -> javaPlugin.getCommand(s).setExecutor(this));}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String cmdname = command.getName();
        CommandHandler commandHandler = commands.get(cmdname);
        if(commandHandler != null) {
            try {
                commandHandler.execute(sender, command,args);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
