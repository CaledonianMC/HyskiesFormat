package net.hyskies.main.listener;

import me.clip.placeholderapi.PlaceholderAPI;
import net.hyskies.main.utils.Files;
import net.hyskies.main.utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
    String prefix = Utils.chat(Files.msgs.getString("prefix"));
    @EventHandler
    public void join(PlayerJoinEvent e){
        Player p = e.getPlayer();
        if(Files.config.getBoolean("enable-join") == true){
            if((p.hasPermission(Files.perms.getString("staff")) && Files.config.getBoolean("enable-staff-join") == true)){
                if(p.hasPermission(Files.perms.getString("join-1"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-1").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    e.setJoinMessage(Utils.chat(msg));
                }else if(p.hasPermission(Files.perms.getString("join-2"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-2").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    e.setJoinMessage(Utils.chat(msg));
                }else if(p.hasPermission(Files.perms.getString("join-3"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-3").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    e.setJoinMessage(Utils.chat(msg));
                }else if(p.hasPermission(Files.perms.getString("join-4"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-4").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    e.setJoinMessage(Utils.chat(msg));
                }else if(p.hasPermission(Files.perms.getString("join-5"))) {
                    String msg = PlaceholderAPI.setPlaceholders(p, Files.msgs.getString("join-5").replace("%player%", p.getName()).replace("%prefix%", prefix));
                    e.setJoinMessage(Utils.chat(msg));
                }else{return;}
            }else{return;}
        }else{return;}
    }
}