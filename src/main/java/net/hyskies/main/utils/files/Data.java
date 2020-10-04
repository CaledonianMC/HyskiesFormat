package net.hyskies.main.utils.files;

import net.hyskies.main.utils.Logger;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Data {
    private JavaPlugin plugin;
    public Data(JavaPlugin plugin) {
        this.plugin = plugin;
    }


    private static File file;
    private static FileConfiguration data;
    public static void setup(){
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("HyskiesFormat").getDataFolder(), "database.yml");
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
            }
        }
        data = YamlConfiguration.loadConfiguration(file);
    }
    public static FileConfiguration get(){return data;}
    public static void save(){
        try {
            data.save(file);
        }catch (IOException e){
        }
    }
}
