package net.hyskies.main.utils.files;

import net.hyskies.main.Main;
import net.hyskies.main.utils.Logger;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Files {

    public static File configFile;
    public static FileConfiguration config;

    public static File msgsFile;
    public static FileConfiguration msgs;

    public static File permFile;
    public static YamlConfiguration perms;

    public static void base(Main m) {
        if (!m.getDataFolder().exists()) {
            m.getDataFolder().mkdirs();
        }
        // config.yml
        configFile = new File(Bukkit.getServer().getPluginManager().getPlugin("HyskiesFormat").getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            Logger.log(Logger.LogLevel.INFO, "File config.yml doesn't exist, creating one...");
            m.saveResource("config.yml", false);
            Logger.log(Logger.LogLevel.SUCCESS, "File config.yml was created.");
        }
        // msgs.yml
        msgsFile = new File(Bukkit.getServer().getPluginManager().getPlugin("HyskiesFormat").getDataFolder(), "msgs.yml");
        if (!msgsFile.exists()) {
            Logger.log(Logger.LogLevel.INFO, "File msgs.yml doesn't exist, creating one...");
            m.saveResource("msgs.yml", false);
            Logger.log(Logger.LogLevel.SUCCESS, "File msgs.yml was created.");
        }
        // perms.yml
        permFile = new File(Bukkit.getServer().getPluginManager().getPlugin("HyskiesFormat").getDataFolder(), "perms.yml");
        if (!permFile.exists()) {
            Logger.log(Logger.LogLevel.INFO, "File perms.yml doesn't exist, creating one...");
            m.saveResource("perms.yml", false);
            Logger.log(Logger.LogLevel.SUCCESS, "File perms.yml was created.");
        }

        config = YamlConfiguration.loadConfiguration(configFile);
        Logger.log(Logger.LogLevel.SUCCESS, "File config.yml was loaded");
        msgs = YamlConfiguration.loadConfiguration(msgsFile);
        Logger.log(Logger.LogLevel.SUCCESS, "File msgs.yml was loaded");
        perms = YamlConfiguration.loadConfiguration(permFile);
        Logger.log(Logger.LogLevel.SUCCESS, "File perms.yml was loaded");
    }
}
