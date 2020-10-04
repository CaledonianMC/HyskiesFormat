package net.hyskies.main.listener;

import me.clip.placeholderapi.PlaceholderAPI;
import net.hyskies.main.utils.files.Data;
import net.hyskies.main.utils.files.Files;
import net.hyskies.main.utils.Utils;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public class Death implements Listener {
    private JavaPlugin plugin;
    public Death(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    String prefix = Utils.chat(Files.msgs.getString("prefix"));
    @EventHandler
    public void Death(PlayerDeathEvent e) {
        Bukkit.getScheduler().runTaskAsynchronously(plugin, () ->{
            if (e.getEntityType().equals(EntityType.PLAYER) && (e.getEntity().getKiller().getType().equals(EntityType.PLAYER))) {
                Player p = e.getEntity();
                Player t = e.getEntity().getKiller();
                UUID uuid = t.getUniqueId();
                if (Data.get().getInt(uuid+".death-message") == 1) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("1").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 2) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("2").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 3) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("3").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 4) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("4").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 5) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("5").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 6) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("6").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 7) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("7").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 8) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("8").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 9) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("9").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 10) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("10").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 11) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("11").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 12) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("12").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 13) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("13").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 14) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("14").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 15) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("15").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 16) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("16").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 17) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("17").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 18) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("18").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 19) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("19").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else if (Data.get().getInt(uuid+".death-message") == 20) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("20").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }else{
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("default").replace("%killer%", t.getName())).replace("%player%", p.getName()).replace("%prefix%", prefix);
                    if (!t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", t.getInventory().getItemInHand().getType().name());
                    } else if (t.getInventory().getItemInHand().getItemMeta().hasDisplayName()) {
                        msg = msg.replace("%weapon%", Utils.chat(t.getInventory().getItemInHand().getItemMeta().getDisplayName()));
                    }
                    e.setDeathMessage(null);
                    for(Player player : Bukkit.getOnlinePlayers()){
                        if(Data.get().getBoolean(uuid+".death") == true){
                            TextComponent format = new TextComponent(msg);
                            format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.death-hover"))).create()));
                            format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/toggledeath"));
                            player.spigot().sendMessage(format);
                        }
                    }
                }
            } else {
                return;
            }
        });
    }
}
