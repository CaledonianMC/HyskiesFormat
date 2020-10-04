package net.hyskies.main.listener.inventory;

import net.hyskies.main.utils.Utils;
import net.hyskies.main.utils.files.Data;
import net.hyskies.main.utils.files.Files;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.UUID;

public class JoinInventory implements Listener {

    @EventHandler
    public void click(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        UUID uuid = p.getUniqueId();
        String prefix = Utils.chat(Files.msgs.getString("prefix"));
        if(e.getClickedInventory().getTitle().equalsIgnoreCase(Utils.chat("&bJoin &fMessages"))){

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET 1"))){
                Integer num = 1;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".join-message", num);
                Data.save();
            }

            // 2
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET 2"))){
                Integer num = 2;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".join-message", num);
                Data.save();
            }

            // 3
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET 3"))){
                Integer num = 3;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".join-message", num);
                Data.save();
            }


            // 4
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET 4"))){
                Integer num = 4;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".join-message", num);
                Data.save();
            }

            // 5
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET 5"))){
                Integer num = 5;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".join-message", num);
                Data.save();
            }

            // Previous
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&l(!) &c&lNO PREVIOUS PAGE"))){
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.previous-page").replace("%prefix%", prefix)));
            }
            // Next
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&l(!) &c&lNO NEXT PAGE"))){
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.next-page").replace("%prefix%", prefix)));
            }
            // Remove
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&l(!) &c&lREMOVE JOIN MSG"))){
                Integer num = 0;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.reset").replace("%prefix%", prefix)));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            e.setCancelled(true);
        }
    }
}
