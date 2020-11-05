package net.hyskies.main.listener.inventory;

import net.hyskies.main.utils.Utils;
import net.hyskies.main.utils.files.Data;
import net.hyskies.main.utils.files.Files;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.UUID;

public class JoinInventory implements Listener {

    @EventHandler
    public void click(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        UUID uuid = p.getUniqueId();
        String prefix = Utils.chat(Files.msgs.getString("prefix"));
        if((e.getCurrentItem() != null && e.getCurrentItem().getType() != Material.AIR)){
            if (e.getClickedInventory().getTitle().equalsIgnoreCase(Utils.chat("&bJoin &fMessages"))) {

                // 1
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &2&lPRESET 1"))) {
                    Integer num = 1;

                    if (p.hasPermission(Files.perms.getString("join-" + num))) {
                        p.closeInventory();
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                        Data.get().set(uuid + ".join-message", num);
                        Data.save();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &e&lPRESET 2"))) {
                    Integer num = 2;
                    if (p.hasPermission(Files.perms.getString("join-" + num))) {
                        p.closeInventory();
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                        Data.get().set(uuid + ".join-message", num);
                        Data.save();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &8&lPRESET 3"))) {
                    Integer num = 3;
                    if (p.hasPermission(Files.perms.getString("join-" + num))) {
                        p.closeInventory();
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                        Data.get().set(uuid + ".join-message", num);
                        Data.save();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &5&lPRESET 4"))) {
                    Integer num = 4;
                    if (p.hasPermission(Files.perms.getString("join-" + num))) {
                        p.closeInventory();
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                        Data.get().set(uuid + ".join-message", num);
                        Data.save();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &d&lPRESET 5"))) {
                    Integer num = 5;
                    if (p.hasPermission(Files.perms.getString("join-" + num))) {
                        p.closeInventory();
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                        Data.get().set(uuid + ".join-message", num);
                        Data.save();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &7&lPRESET 6"))) {
                    Integer num = 6;
                    if (p.hasPermission(Files.perms.getString("join-" + num))) {
                        p.closeInventory();
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                        Data.get().set(uuid + ".join-message", num);
                        Data.save();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &c&lPRESET 7"))) {
                    Integer num = 7;
                    if (p.hasPermission(Files.perms.getString("join-" + num))) {
                        p.closeInventory();
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                        Data.get().set(uuid + ".join-message", num);
                        Data.save();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &6&lPRESET 8"))) {
                    Integer num = 8;
                    if (p.hasPermission(Files.perms.getString("join-" + num))) {
                        p.closeInventory();
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                        Data.get().set(uuid + ".join-message", num);
                        Data.save();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &a&lPRESET 9"))) {
                    Integer num = 9;
                    if (p.hasPermission(Files.perms.getString("join-" + num))) {
                        p.closeInventory();
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                        Data.get().set(uuid + ".join-message", num);
                        Data.save();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET 11"))) {
                    Integer num = 11;
                    if (p.hasPermission(Files.perms.getString("join-" + num))) {
                        p.closeInventory();
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                        Data.get().set(uuid + ".join-message", num);
                        Data.save();
                        e.setCancelled(true);
                    } else {
                        p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));
                        e.setCancelled(true);
                    }
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&l(!) &c&lNO PREVIOUS PAGE"))) {
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.previous-page").replace("%prefix%", prefix)));
                    e.setCancelled(true);
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&l(!) &c&lNO NEXT PAGE"))) {
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.next-page").replace("%prefix%", prefix)));
                    e.setCancelled(true);
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&l(!) &c&lREMOVE JOIN MSG"))) {
                    Integer num = 0;
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.reset").replace("%prefix%", prefix)));
                    Data.get().set(uuid + ".death-message", num);
                    Data.save();
                    e.setCancelled(true);
                } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&l(!) &c&lNO NEXT PAGE"))) {
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.next-page").replace("%prefix%", prefix)));
                    e.setCancelled(true);
                }else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&l(!) &c&lREMOVE JOIN MSG"))) {
                    Integer num = 0;
                    p.closeInventory();
                    p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.reset").replace("%prefix%", prefix)));
                    Data.get().set(uuid + ".death-message", num);
                    Data.save();
                    e.setCancelled(true);
                } else {
                    e.setCancelled(false);
                }
            }
        }else{return;}
    }
}
