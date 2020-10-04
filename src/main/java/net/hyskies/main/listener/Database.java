package net.hyskies.main.listener;

import net.hyskies.main.utils.files.Data;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public class Database implements Listener {
    private JavaPlugin plugin;
    public Database(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void database(PlayerJoinEvent e) {
            Player p = e.getPlayer();
            UUID uuid = p.getUniqueId();
            Data.get().set(uuid+".name", p.getName());
            if(!Data.get().contains(uuid+".join")){Data.get().set(uuid+".join", true);}
            if(!Data.get().contains(uuid+".death")){Data.get().set(uuid+".death", true);}
            if(!Data.get().contains(uuid+".leave")){Data.get().set(uuid+".leave", false);}
            if(!Data.get().contains(uuid+".join-message")){Data.get().set(uuid+".join-message", 0);}
            if(!Data.get().contains(uuid+".death-message")){Data.get().set(uuid+".death-message", 0);}
            
            // Reload
            Data.save();
    }
}
