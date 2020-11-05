package net.hyskies.main;

import net.hyskies.main.commands.inventory.DeathInv;
import net.hyskies.main.commands.inventory.JoinInv;
import net.hyskies.main.listener.Database;
import net.hyskies.main.listener.Death;
import net.hyskies.main.listener.inventory.DeathInventory;
import net.hyskies.main.listener.Join;
import net.hyskies.main.listener.inventory.JoinInventory;
import net.hyskies.main.managers.CommandManager;
import net.hyskies.main.utils.files.Data;
import net.hyskies.main.utils.files.Files;
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
        Data.setup();
        Data.save();
        Files.base(this);
        new CommandManager(this);

        // Events
        Bukkit.getServer().getPluginManager().registerEvents(new Join(this), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Death(this), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Database(this), this);
        //Bukkit.getServer().getPluginManager().registerEvents(new DeathInventory(), this);
        //Bukkit.getServer().getPluginManager().registerEvents(new JoinInventory(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new JoinInv(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new DeathInv(), this);

        Logger.log(Logger.LogLevel.INFO, "HyskiesFormat fully loaded and enabled.");
    }

    @Override
    public void onDisable() {
        Logger.log(Logger.LogLevel.INFO, "HyskiesFormat is fully disabled");
    }
}
