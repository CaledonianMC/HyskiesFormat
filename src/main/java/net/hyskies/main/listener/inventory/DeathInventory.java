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
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &2&lPRESET 1"))){
                Integer num = 1;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 2
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &e&lPRESET 2"))){
                Integer num = 2;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &8&lPRESET 3"))){
                Integer num = 3;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &a&lPRESET 4"))){
                Integer num = 4;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &5&lPRESET 5"))){
                Integer num = 5;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &9&lPRESET 6"))){
                Integer num = 6;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &d&lPRESET 7"))){
                Integer num = 7;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &7&lPRESET 8"))){
                Integer num = 8;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &c&lPRESET 9"))){
                Integer num = 9;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &6&lPRESET 10"))){
                Integer num = 10;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &a&lPRESET 11"))){
                Integer num = 11;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &2&lPRESET 12"))){
                Integer num = 12;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &e&lPRESET 13"))){
                Integer num = 13;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &8&lPRESET 14"))){
                Integer num = 14;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &5&lPRESET 15"))){
                Integer num = 15;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &9&lPRESET 16"))){
                Integer num = 16;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &d&lPRESET 17"))){
                Integer num = 17;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &7&lPRESET 18"))){
                Integer num = 18;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &c&lPRESET 19"))){
                Integer num = 19;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
            }

            // 1
            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lDEATH MESSAGE ｜ &7&lPRESET 20"))){
                Integer num = 20;
                if(p.hasPermission(Files.perms.getString(num.toString()))){
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
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
                if(Data.get().getInt(uuid+"death-message") == num){
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.already-reset").replace("%prefix%", prefix)));
                }else{
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.reset").replace("%prefix%", prefix)));
                    Data.get().set(uuid+".death-message", num);
                    Data.save();
                }
            }

            e.setCancelled(true);
        }
    }
}
