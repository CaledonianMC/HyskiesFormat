package net.hyskies.main.commands.virtual;

import me.clip.placeholderapi.PlaceholderAPI;
import net.hyskies.main.managers.CommandHandler;
import net.hyskies.main.utils.Files;
import net.hyskies.main.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class Furnace implements CommandHandler {
    @Override
    public void execute(CommandSender sender, Command command, String[] args) {
        String prefix = Utils.chat(Files.msgs.getString("prefix"));
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission(Files.perms.getString("furnace"))){
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("furnace").replace("%prefix%", prefix));
                p.sendMessage(Utils.chat(msg));
                Inventory i = Bukkit.createInventory(p, InventoryType.FURNACE);
                p.openInventory(i);
            }
        }
    }
}
