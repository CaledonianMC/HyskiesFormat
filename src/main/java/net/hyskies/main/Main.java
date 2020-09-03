package net.hyskies.main;

import net.hyskies.main.listener.Death;
import net.hyskies.main.listener.Join;
import net.hyskies.main.managers.CommandManager;
import net.hyskies.main.utils.Files;
import net.hyskies.main.utils.Logger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private JavaPlugin javaPlugin;
    public static Main instance;


    @Override
    public void onEnable() {
        Logger.log(Logger.LogLevel.INFO, "Enabling HyskiesFormat by Caledonian EH");
        // Important Stuff
        instance = this;
        Files.base(this);
        new CommandManager(this);

        // Events
        Bukkit.getServer().getPluginManager().registerEvents(new Death(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Join(), this);

        Logger.log(Logger.LogLevel.INFO, "HyskiesFormat fully loaded and enabled.");
    }

    @Override
    public void onDisable() {
        Logger.log(Logger.LogLevel.INFO, "HyskiesFormat is disabling...");

        Logger.log(Logger.LogLevel.INFO, "HyskiesFormat is fully disabled");
    }
}
