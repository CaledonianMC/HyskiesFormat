package net.hyskies.main.listener;

import me.clip.placeholderapi.PlaceholderAPI;
import net.hyskies.main.utils.Files;
import net.hyskies.main.utils.Utils;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Death implements Listener {
    String prefix = Utils.chat(Files.msgs.getString("prefix"));

    @EventHandler(priority = EventPriority.HIGHEST)
    public void Death(PlayerDeathEvent e) {
        if (e.getEntityType().equals(EntityType.PLAYER) && (e.getEntity().getKiller().getType().equals(EntityType.PLAYER))) {
            Player p = (Player) e.getEntity();
            Player t = e.getEntity().getKiller();
            if (t.hasPermission(Files.perms.getString("1"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("1").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("2"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("2").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("3"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("3").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("4"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("4").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("5"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("5").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("6"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("6").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("7"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("7").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("8"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("8").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("9"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("9").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("10"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("10").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("11"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("11").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("12"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("12").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("13"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("13").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("14"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("14").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("15"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("15").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("16"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("16").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("17"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("17").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("18"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("18").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("19"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("19").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else if (t.hasPermission(Files.perms.getString("20"))) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("20").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }else{
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("default").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                    msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                }
                e.setDeathMessage(Utils.chat(msg));
            }
        } else {
            return;
        }
    }
}
