package net.hyskies.main.listener;

import net.hyskies.main.utils.Files;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.UUID;

public class Database implements Listener {
    private JavaPlugin plugin;
    public Database(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void database(PlayerJoinEvent e) {
        Bukkit.getScheduler().runTaskAsynchronously(plugin, () -> {
            Player p = e.getPlayer();
            UUID uuid = p.getUniqueId();
            Files.data.set(uuid+".name", p.getName());
            if(!Files.data.contains(uuid+".join")){Files.data.set(uuid+".join", true);}
            if(!Files.data.contains(uuid+".death")){Files.data.set(uuid+".death", true);}
            if(!Files.data.contains(uuid+".leave")){Files.data.set(uuid+".leave", false);}
            // Reload
            try {
                Files.saveData();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            Files.reloadData();
                });
    }
}
