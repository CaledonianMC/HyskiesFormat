package net.hyskies.main.commands.virtual;

import me.clip.placeholderapi.PlaceholderAPI;
import net.hyskies.main.managers.CommandHandler;
import net.hyskies.main.utils.files.Files;
import net.hyskies.main.utils.Utils;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Craftingtable implements CommandHandler {
    @Override
    public void execute(CommandSender sender, Command command, String[] args) {
        String prefix = Utils.chat(Files.msgs.getString("prefix"));
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission(Files.perms.getString("crafting-table"))){
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("crafting-table").replace("%prefix%", prefix));
                p.sendMessage(Utils.chat(msg));
                Location l = p.getLocation();
                p.openWorkbench(l, true);
            }else{p.sendMessage(Utils.chat(Files.msgs.getString("no-permission")));}
        }
    }
}
