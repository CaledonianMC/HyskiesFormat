package net.hyskies.main.managers;

import net.hyskies.main.commands.HyskiesFormat;
import net.hyskies.main.commands.virtual.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

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
        commands.put("anvil", new Anvil());
        commands.put("brew", new Brewing());
        commands.put("craft", new Craftingtable());
        commands.put("enchant", new Enchanting());
        commands.put("furnace", new Furnace());
        registerCommands();
    }
    private void registerCommands() { commands.forEach((s, c) -> javaPlugin.getCommand(s).setExecutor(this));}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String cmdname = command.getName();
        CommandHandler commandHandler = commands.get(cmdname);
        if(commandHandler != null) commandHandler.execute(sender, command,args);
        return false;
    }
}