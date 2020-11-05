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
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Join implements Listener {
    private JavaPlugin plugin;

    public Join(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    String prefix = Utils.chat(Files.msgs.getString("prefix"));

    @EventHandler
    public void join(PlayerJoinEvent e) {
        Bukkit.getScheduler().runTaskAsynchronously(plugin, () -> {
            Player p = e.getPlayer();
            UUID uuid = p.getUniqueId();
            if (Data.get().getInt(uuid + ".join-message") == 1) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-1").replace("%player%", p.getName()).replace("%prefix%", prefix));
                e.setJoinMessage(null);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (Data.get().getBoolean(uuid + ".join") == true) {
                        TextComponent format = new TextComponent(msg);
                        format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.join-hover"))).create()));
                        format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/togglejoin"));
                        player.spigot().sendMessage(format);
                    }
                }
            } else if (Data.get().getInt(uuid + ".join-message") == 2) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-2").replace("%player%", p.getName()).replace("%prefix%", prefix));
                e.setJoinMessage(null);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (Data.get().getBoolean(uuid + ".join") == true) {
                        TextComponent format = new TextComponent(msg);
                        format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.join-hover"))).create()));
                        format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/togglejoin"));
                        player.spigot().sendMessage(format);
                    }
                }
            } else if (Data.get().getInt(uuid + ".join-message") == 3) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-3").replace("%player%", p.getName()).replace("%prefix%", prefix));
                e.setJoinMessage(null);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (Data.get().getBoolean(uuid + ".join") == true) {
                        TextComponent format = new TextComponent(msg);
                        format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.join-hover"))).create()));
                        format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/togglejoin"));
                        player.spigot().sendMessage(format);
                    }
                }
            } else if (Data.get().getInt(uuid + ".join-message") == 4) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-4").replace("%player%", p.getName()).replace("%prefix%", prefix));
                e.setJoinMessage(null);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (Data.get().getBoolean(uuid + ".join") == true) {
                        TextComponent format = new TextComponent(msg);
                        format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.join-hover"))).create()));
                        format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/togglejoin"));
                        player.spigot().sendMessage(format);
                    }
                }
            } else if (Data.get().getInt(uuid + ".join-message") == 5) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-5").replace("%player%", p.getName()).replace("%prefix%", prefix));
                e.setJoinMessage(null);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (Data.get().getBoolean(uuid + ".join") == true) {
                        TextComponent format = new TextComponent(msg);
                        format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.join-hover"))).create()));
                        format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/togglejoin"));
                        player.spigot().sendMessage(format);
                    }
                }
            } else if (Data.get().getInt(uuid + ".join-message") == 6) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-6").replace("%player%", p.getName()).replace("%prefix%", prefix));
                e.setJoinMessage(null);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (Data.get().getBoolean(uuid + ".join") == true) {
                        TextComponent format = new TextComponent(msg);
                        format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.join-hover"))).create()));
                        format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/togglejoin"));
                        player.spigot().sendMessage(format);
                    }
                }
            } else if (Data.get().getInt(uuid + ".join-message") == 7) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-7").replace("%player%", p.getName()).replace("%prefix%", prefix));
                e.setJoinMessage(null);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (Data.get().getBoolean(uuid + ".join") == true) {
                        TextComponent format = new TextComponent(msg);
                        format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.join-hover"))).create()));
                        format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/togglejoin"));
                        player.spigot().sendMessage(format);
                    }
                }
            } else if (Data.get().getInt(uuid + ".join-message") == 8) {
                String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-8").replace("%player%", p.getName()).replace("%prefix%", prefix));
                e.setJoinMessage(null);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (Data.get().getBoolean(uuid + ".join") == true) {
                        TextComponent format = new TextComponent(msg);
                        format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.join-hover"))).create()));
                        format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/togglejoin"));
                        player.spigot().sendMessage(format);
                    }
                }
            } else if (Data.get().getInt(uuid + ".join-message") == 9) {
                e.setJoinMessage(null);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (Data.get().getBoolean(uuid + ".join") == true) {
                        List<String> list = Files.msgs.getStringList("join-9");
                        TextComponent format = new TextComponent(Utils.chat(list.get(new Random().nextInt(list.size()))).replace("%prefix%", prefix).replace("%player%", p.getName()));
                        format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.join-hover"))).create()));
                        format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/togglejoin"));
                        player.spigot().sendMessage(format);
                    }
                }
            } else if (Data.get().getInt(uuid + ".join-message") == 11) {
                e.setJoinMessage(null);
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (Data.get().getBoolean(uuid + ".join") == true) {
                        TextComponent format = new TextComponent(Utils.chat(Files.msgs.getString("join-11")).replace("%prefix%", prefix).replace("%player%", p.getName()));
                        format.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(Utils.chat(Files.msgs.getString("toggles.join-hover"))).create()));
                        format.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/togglejoin"));
                        player.spigot().sendMessage(format);
                    }
                }
            }else{return;}
        });
    }
}
