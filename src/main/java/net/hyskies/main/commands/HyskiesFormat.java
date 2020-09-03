package net.hyskies.main.commands;

import net.hyskies.main.Main;
import net.hyskies.main.managers.CommandHandler;
import net.hyskies.main.utils.Files;
import net.hyskies.main.utils.Logger;
import net.hyskies.main.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.List;

import static net.hyskies.main.utils.Files.saveConfig;

public class HyskiesFormat implements CommandHandler {
    private JavaPlugin plugin;
    public HyskiesFormat(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    @Override
    public void execute(CommandSender sender, Command command, String[] args){
        String prefix = Utils.chat(Files.msgs.getString("prefix"));
        String ver = plugin.getDescription().getVersion();
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length == 0) {
                if (Files.config.getBoolean("enable-core-cmd") == true) {
                    if (p.hasPermission(Files.perms.getString("core-cmd"))) {
                        List<String> msg1 = Files.msgs.getStringList("core-cmd-admin");
                        for (String x : msg1) {
                            x = x.replace("%prefix%", prefix);
                            x = x.replace("%version%", ver);
                            sender.sendMessage(Utils.chat(x));
                        }
                    } else {
                        List<String> msg2 = plugin.getConfig().getStringList("core-cmd-user");
                        for (String x : msg2) {
                            x = x.replace("%prefix%", prefix);
                            x = x.replace("%version%", ver);
                            sender.sendMessage(Utils.chat(x));
                        }
                    }
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("fake-unknown")).replace("%prefix%", prefix));}
            } else if (args.length >= 1) {
                if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
                    List<String> help1 = Files.msgs.getStringList("help-1");
                    for (String x : help1) {
                        sender.sendMessage(Utils.chat(x));
                    }
                } else if (args[0].equalsIgnoreCase("help") && args[1].equalsIgnoreCase("2")) {
                    List<String> help2 = Files.msgs.getStringList("help-2");
                    for (String x : help2) {
                        sender.sendMessage(Utils.chat(x));
                    }
                } else if (args[0].equalsIgnoreCase("reload")) {
                    if (sender instanceof Player) {
                        if (p.hasPermission(Files.perms.getString("reload"))) {
                            p.sendMessage(Utils.chat(Files.msgs.getString("config-reload")).replace("%prefix%", prefix));
                            Logger.log(Logger.LogLevel.INFO, "&b" + p.getName() + " &fjust reloaded all configs.");
                            reload();
                        } else {
                            p.sendMessage(Utils.chat(Files.msgs.getString("no-permission")));
                        }
                    } else {
                        Bukkit.getConsoleSender().sendMessage(Files.msgs.getString("config-reload").replace("%prefix%", prefix));
                        Bukkit.getConsoleSender().sendMessage("The console reloaded all configs.");
                        reload();
                    }
                }else{
                    p.sendMessage(Utils.chat(Files.msgs.getString("404")).replace("%prefix%", prefix));
                }
            }
        } else {
            Bukkit.getConsoleSender().sendMessage(Utils.chat(Files.msgs.getString("console-error")));
        }
    }
    private static void reload() {
        Logger.log(Logger.LogLevel.INFO, "Reloading config.yml...");
        Files.reloadConfig();
        Logger.log(Logger.LogLevel.SUCCESS, "The file config.yml was reloaded");

        Logger.log(Logger.LogLevel.INFO, "Reloading msgs.yml...");
        Files.reloadMsgs();
        Logger.log(Logger.LogLevel.SUCCESS, "The file msgs.yml was reloaded");

        Logger.log(Logger.LogLevel.INFO, "Reloading perms.yml...");
        Files.reloadPerms();
        Logger.log(Logger.LogLevel.SUCCESS, "The file perms.yml was reloaded");
    }
}
