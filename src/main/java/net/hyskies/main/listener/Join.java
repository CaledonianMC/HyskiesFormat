package net.hyskies.main.listener;

import me.clip.placeholderapi.PlaceholderAPI;
import net.hyskies.main.utils.Files;
import net.hyskies.main.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.UUID;

public class Join implements Listener {
    private JavaPlugin plugin;
    public Join(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    String prefix = Utils.chat(Files.msgs.getString("prefix"));

    @EventHandler
    public void join(PlayerJoinEvent e) {
        Bukkit.getScheduler().runTaskAsynchronously(plugin, () ->{
            Player p = e.getPlayer();
                if ((p.hasPermission(Files.perms.getString("join-1")))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-1").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    for(Player player : Bukkit.getOnlinePlayers()){
                        UUID uuid = player.getUniqueId();
                        if(Files.data.getBoolean(uuid+".join") == true){
                            player.sendMessage(Utils.chat(msg));
                        }
                    }
                } else if (p.hasPermission(Files.perms.getString("join-2"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-2").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    for(Player player : Bukkit.getOnlinePlayers()){
                        UUID uuid = player.getUniqueId();
                        if(Files.data.getBoolean(uuid+".join") == true){
                            player.sendMessage(Utils.chat(msg));
                        }
                    }
                } else if (p.hasPermission(Files.perms.getString("join-3"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-3").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    for(Player player : Bukkit.getOnlinePlayers()){
                        UUID uuid = player.getUniqueId();
                        if(Files.data.getBoolean(uuid+".join") == true){
                            player.sendMessage(Utils.chat(msg));
                        }
                    }
                } else if (p.hasPermission(Files.perms.getString("join-4"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-4").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    for(Player player : Bukkit.getOnlinePlayers()){
                        UUID uuid = player.getUniqueId();
                        if(Files.data.getBoolean(uuid+".join") == true) {
                            player.sendMessage(Utils.chat(msg));
                        }
                    }
                } else if (p.hasPermission(Files.perms.getString("join-5"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-5").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    for(Player player : Bukkit.getOnlinePlayers()){
                        UUID uuid = player.getUniqueId();
                        if(Files.data.getBoolean(uuid+".join") == true){
                            player.sendMessage(Utils.chat(msg));
                        }
                    }
                } else if (p.hasPermission(Files.perms.getString("join-6"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-6").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    for(Player player : Bukkit.getOnlinePlayers()){
                        UUID uuid = player.getUniqueId();
                        if(Files.data.getBoolean(uuid+".join") == true){
                            player.sendMessage(Utils.chat(msg));
                        }
                    }
                } else if (p.hasPermission(Files.perms.getString("join-7"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-7").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    for(Player player : Bukkit.getOnlinePlayers()){
                        UUID uuid = player.getUniqueId();
                        if(Files.data.getBoolean(uuid+".join") == true){
                            player.sendMessage(Utils.chat(msg));
                        }
                    }
                } else if (p.hasPermission(Files.perms.getString("join-8"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-8").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    for(Player player : Bukkit.getOnlinePlayers()){
                        UUID uuid = player.getUniqueId();
                        if(Files.data.getBoolean(uuid+".join") == true){
                            player.sendMessage(Utils.chat(msg));
                        }
                    }
                } else if (p.hasPermission(Files.perms.getString("join-9"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-9").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    for(Player player : Bukkit.getOnlinePlayers()){
                        UUID uuid = player.getUniqueId();
                        if(Files.data.getBoolean(uuid+".join") == true){
                            player.sendMessage(Utils.chat(msg));
                        }
                    }
                } else if (p.hasPermission(Files.perms.getString("join-10"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-10").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    for(Player player : Bukkit.getOnlinePlayers()){
                        UUID uuid = player.getUniqueId();
                        if(Files.data.getBoolean(uuid+".join") == true) {
                            player.sendMessage(Utils.chat(msg));
                        }
                    }
                }else{return;}
        });

    }
}
