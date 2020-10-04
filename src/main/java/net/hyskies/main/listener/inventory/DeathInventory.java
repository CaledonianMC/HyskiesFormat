package net.hyskies.main.listener.inventory;

import net.hyskies.main.utils.Utils;
import net.hyskies.main.utils.files.Data;
import net.hyskies.main.utils.files.Files;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.PlayerInventory;

import java.util.UUID;

public class DeathInventory implements Listener {

    @EventHandler
    public void click(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        UUID uuid = p.getUniqueId();
        String prefix = Utils.chat(Files.msgs.getString("prefix"));
        if(e.getClickedInventory().getTitle().equalsIgnoreCase(Utils.chat("&bDeath &fMessages"))){

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 1"))){
                Integer num = 1;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 2
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 2"))){
                Integer num = 2;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 3"))){
                Integer num = 3;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 4"))){
                Integer num = 4;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 5"))){
                Integer num = 5;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 6"))){
                Integer num = 6;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 7"))){
                Integer num = 7;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 8"))){
                Integer num = 8;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 9"))){
                Integer num = 9;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 10"))){
                Integer num = 10;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 11"))){
                Integer num = 11;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 12"))){
                Integer num = 12;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 13"))){
                Integer num = 13;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 14"))){
                Integer num = 14;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 15"))){
                Integer num = 15;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 16"))){
                Integer num = 16;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 17"))){
                Integer num = 17;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET 18"))){
                Integer num = 18;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                Data.get().set(uuid+".death-message", num);
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
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&l(!) &c&lREMOVE DEATH MSG"))){
                Integer num = 0;
                p.closeInventory();
                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.reset").replace("%prefix%", prefix)));
                Data.get().set(uuid+".death-message", num);
                Data.save();
            }

            e.setCancelled(true);
        }
    }
}
