package net.hyskies.main.commands;

import net.hyskies.main.managers.CommandHandler;
import net.hyskies.main.utils.Files;
import net.hyskies.main.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class ToggleDeath implements CommandHandler {
    @Override
    public void execute(CommandSender sender, Command command, String[] args) throws IOException {
        String prefix = Files.msgs.getString("prefix");
        if (sender instanceof Player) {
            Player p = (Player) sender;
            UUID uuid = p.getUniqueId();
            if (p.hasPermission(Files.perms.getString("toggles.death"))) {
                if (Files.data.getBoolean(uuid + ".death") == true) {
                    String toggle = Files.msgs.getString("toggles.disabled");
                    List<String> msg1 = Files.msgs.getStringList("toggles.death");
                    for (String x : msg1) {
                        x = x.replace("%prefix%", prefix);
                        x = x.replace("%toggle%", toggle);
                        sender.sendMessage(Utils.chat(x));
                    }
                    // Data
                    Files.data.set(uuid + ".death", false);
                    Files.saveData();
                    Files.reloadData();
                } else {
                    String toggle = Files.msgs.getString("toggles.enabled");
                    List<String> msg1 = Files.msgs.getStringList("toggles.death");
                    for (String x : msg1) {
                        x = x.replace("%prefix%", prefix);
                        x = x.replace("%toggle%", toggle);
                        sender.sendMessage(Utils.chat(x));
                    }
                    // Data
                    Files.data.set(uuid + ".death", true);
                    Files.saveData();
                    Files.reloadData();
                }
            }else{p.sendMessage(Utils.chat(Files.msgs.getString("no-permission").replace("%prefix%", prefix)));}
        } else {
            Bukkit.getConsoleSender().sendMessage(Utils.chat(Files.msgs.getString("console-error")));
        }
    }
}
