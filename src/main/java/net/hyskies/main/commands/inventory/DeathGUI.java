package net.hyskies.main.commands.inventory;

import net.hyskies.main.managers.CommandHandler;
import net.hyskies.main.utils.files.Data;
import net.hyskies.main.utils.files.Files;
import net.hyskies.main.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class DeathGUI implements CommandHandler {

    @Override
    public void execute(CommandSender sender, Command command, String[] args) throws IOException {
        if(sender instanceof Player){
            String prefix = Utils.chat(Files.msgs.getString("prefix"));
            Player p = (Player) sender;
            UUID uuid = p.getUniqueId();

            p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.open").replace("%prefix%", prefix)));
            Inventory in = Bukkit.createInventory(p, 36, Utils.chat("&bDeath &fMessages"));
            // Message 1

            ItemStack t1 = new ItemStack(Material.CHEST);
            ItemMeta t1m = t1.getItemMeta();
            t1m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "1"));
            String message1 = Utils.chat(Files.msgs.getString("1").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status1 = null;
            if(p.hasPermission(Files.perms.getString("1")) && Data.get().getInt(uuid+".death-message") == 1){
                status1 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("1"))){
                status1 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status1 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t1l = new ArrayList<>();
            t1l.add(Utils.chat("&f "));
            t1l.add(Utils.chat("&b"+message1).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t1l.add(Utils.chat("&f "));
            t1l.add(Utils.chat("&b%status%").replace("%status%", status1));

            t1m.setLore(t1l);
            t1.setItemMeta(t1m);

            // Message 2
            ItemStack t2 = new ItemStack(Material.CHEST);
            ItemMeta t2m = t2.getItemMeta();
            t2m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "2"));
            String message2 = Utils.chat(Files.msgs.getString("2").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status2 = null;
            if(p.hasPermission(Files.perms.getString("2")) && Data.get().getInt(uuid+".death-message") == 2){
                status2 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("2"))){
                status2 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status2 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t2l = new ArrayList<>();
            t2l.add(Utils.chat("&f "));
            t2l.add(Utils.chat("&b"+message2).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t2l.add(Utils.chat("&f "));
            t2l.add(Utils.chat("&b%status%").replace("%status%", status2));

            t2m.setLore(t2l);
            t2.setItemMeta(t2m);

            // Message 3
            ItemStack t3 = new ItemStack(Material.CHEST);
            ItemMeta t3m = t3.getItemMeta();
            t3m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "3"));
            String message3 = Utils.chat(Files.msgs.getString("3").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status3 = null;
            if(p.hasPermission(Files.perms.getString("3")) && Data.get().getInt(uuid+".death-message") == 3){
                status3 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("3"))){
                status3 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status3 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t3l = new ArrayList<>();
            t3l.add(Utils.chat("&f "));
            t3l.add(Utils.chat("&b"+message3).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t3l.add(Utils.chat("&f "));
            t3l.add(Utils.chat("&b%status%").replace("%status%", status3));

            t3m.setLore(t3l);
            t3.setItemMeta(t3m);

            // Message 4
            ItemStack t4 = new ItemStack(Material.CHEST);
            ItemMeta t4m = t4.getItemMeta();
            t4m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "4"));
            String message4 = Utils.chat(Files.msgs.getString("4").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status4 = null;
            if(p.hasPermission(Files.perms.getString("4")) && Data.get().getInt(uuid+".death-message") == 4){
                status4 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("4"))){
                status4 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status4 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t4l = new ArrayList<>();
            t4l.add(Utils.chat("&f "));
            t4l.add(Utils.chat("&b"+message4).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t4l.add(Utils.chat("&f "));
            t4l.add(Utils.chat("&b%status%").replace("%status%", status4));

            t4m.setLore(t4l);
            t4.setItemMeta(t4m);

            // Message 5
            ItemStack t5 = new ItemStack(Material.CHEST);
            ItemMeta t5m = t5.getItemMeta();
            t5m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "5"));
            String message5 = Utils.chat(Files.msgs.getString("5").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status5 = null;
            if(p.hasPermission(Files.perms.getString("5")) && Data.get().getInt(uuid+".death-message") == 5){
                status5 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("5"))){
                status5 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status5 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t5l = new ArrayList<>();
            t5l.add(Utils.chat("&f "));
            t5l.add(Utils.chat("&b"+message5).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t5l.add(Utils.chat("&f "));
            t5l.add(Utils.chat("&b%status%").replace("%status%", status5));

            t5m.setLore(t5l);
            t5.setItemMeta(t5m);

            // Message 6
            ItemStack t6 = new ItemStack(Material.CHEST);
            ItemMeta t6m = t6.getItemMeta();
            t6m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "6"));
            String message6 = Utils.chat(Files.msgs.getString("6").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status6 = null;
            if(p.hasPermission(Files.perms.getString("6")) && Data.get().getInt(uuid+".death-message") == 6){
                status6 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("6"))){
                status6 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status6 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t6l = new ArrayList<>();
            t6l.add(Utils.chat("&f "));
            t6l.add(Utils.chat("&b"+message6).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t6l.add(Utils.chat("&f "));
            t6l.add(Utils.chat("&b%status%").replace("%status%", status6));

            t6m.setLore(t6l);
            t6.setItemMeta(t6m);

            // Message 7
            ItemStack t7 = new ItemStack(Material.CHEST);
            ItemMeta t7m = t7.getItemMeta();
            t7m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "7"));
            String message7 = Utils.chat(Files.msgs.getString("7").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status7 = null;
            if(p.hasPermission(Files.perms.getString("7")) && Data.get().getInt(uuid+".death-message") == 7){
                status7 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("7"))){
                status7 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status7 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t7l = new ArrayList<>();
            t7l.add(Utils.chat("&f "));
            t7l.add(Utils.chat("&b"+message7).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t7l.add(Utils.chat("&f "));
            t7l.add(Utils.chat("&b%status%").replace("%status%", status7));

            t7m.setLore(t7l);
            t7.setItemMeta(t7m);

            // Message 8
            ItemStack t8 = new ItemStack(Material.CHEST);
            ItemMeta t8m = t8.getItemMeta();
            t8m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "8"));
            String message8 = Utils.chat(Files.msgs.getString("8").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status8 = null;
            if(p.hasPermission(Files.perms.getString("8")) && Data.get().getInt(uuid+".death-message") == 8){
                status8 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("8"))){
                status8 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status8 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t8l = new ArrayList<>();
            t8l.add(Utils.chat("&f "));
            t8l.add(Utils.chat("&b"+message8).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t8l.add(Utils.chat("&f "));
            t8l.add(Utils.chat("&b%status%").replace("%status%", status8));

            t8m.setLore(t8l);
            t8.setItemMeta(t8m);

            // Message 9
            ItemStack t9 = new ItemStack(Material.CHEST);
            ItemMeta t9m = t9.getItemMeta();
            t9m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "9"));
            String message9 = Utils.chat(Files.msgs.getString("9").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status9 = null;
            if(p.hasPermission(Files.perms.getString("9")) && Data.get().getInt(uuid+".death-message") == 9){
                status9 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("9"))){
                status9 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status9 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t9l = new ArrayList<>();
            t9l.add(Utils.chat("&f "));
            t9l.add(Utils.chat("&b"+message9).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t9l.add(Utils.chat("&f "));
            t9l.add(Utils.chat("&b%status%").replace("%status%", status9));

            t9m.setLore(t9l);
            t9.setItemMeta(t9m);

            // Message 10
            ItemStack t10 = new ItemStack(Material.CHEST);
            ItemMeta t10m = t10.getItemMeta();
            t10m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "10"));
            String message10 = Utils.chat(Files.msgs.getString("10").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status10 = null;
            if(p.hasPermission(Files.perms.getString("10")) && Data.get().getInt(uuid+".death-message") == 10){
                status10 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("10"))){
                status10 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status10 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t10l = new ArrayList<>();
            t10l.add(Utils.chat("&f "));
            t10l.add(Utils.chat("&b"+message10).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t10l.add(Utils.chat("&f "));
            t10l.add(Utils.chat("&b%status%").replace("%status%", status10));

            t10m.setLore(t10l);
            t10.setItemMeta(t10m);

            // Message 11
            ItemStack t11 = new ItemStack(Material.CHEST);
            ItemMeta t11m = t11.getItemMeta();
            t11m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "11"));
            String message11 = Utils.chat(Files.msgs.getString("11").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status11 = null;
            if(p.hasPermission(Files.perms.getString("11")) && Data.get().getInt(uuid+".death-message") == 11){
                status11 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("11"))){
                status11 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status11 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t11l = new ArrayList<>();
            t11l.add(Utils.chat("&f "));
            t11l.add(Utils.chat("&b"+message11).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t11l.add(Utils.chat("&f "));
            t11l.add(Utils.chat("&b%status%").replace("%status%", status11));

            t11m.setLore(t11l);
            t11.setItemMeta(t11m);

            // Message 12
            ItemStack t12 = new ItemStack(Material.CHEST);
            ItemMeta t12m = t12.getItemMeta();
            t12m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "12"));
            String message12 = Utils.chat(Files.msgs.getString("12").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status12 = null;
            if(p.hasPermission(Files.perms.getString("12")) && Data.get().getInt(uuid+".death-message") == 12){
                status12 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("12"))){
                status12 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status12 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t12l = new ArrayList<>();
            t12l.add(Utils.chat("&f "));
            t12l.add(Utils.chat("&b"+message12).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t12l.add(Utils.chat("&f "));
            t12l.add(Utils.chat("&b%status%").replace("%status%", status12));

            t12m.setLore(t12l);
            t12.setItemMeta(t12m);

            // Message 13
            ItemStack t13 = new ItemStack(Material.CHEST);
            ItemMeta t13m = t13.getItemMeta();
            t13m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "13"));
            String message13 = Utils.chat(Files.msgs.getString("13").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status13 = null;
            if(p.hasPermission(Files.perms.getString("13")) && Data.get().getInt(uuid+".death-message") == 13){
                status13 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("13"))){
                status13 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status13 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t13l = new ArrayList<>();
            t13l.add(Utils.chat("&f "));
            t13l.add(Utils.chat("&b"+message13).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t13l.add(Utils.chat("&f "));
            t13l.add(Utils.chat("&b%status%").replace("%status%", status13));

            t13m.setLore(t13l);
            t13.setItemMeta(t13m);

            // Message 14
            ItemStack t14 = new ItemStack(Material.CHEST);
            ItemMeta t14m = t14.getItemMeta();
            t14m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "14"));
            String message14 = Utils.chat(Files.msgs.getString("14").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status14 = null;
            if(p.hasPermission(Files.perms.getString("14")) && Data.get().getInt(uuid+".death-message") == 14){
                status14 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("14"))){
                status14 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status14 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t14l = new ArrayList<>();
            t14l.add(Utils.chat("&f "));
            t14l.add(Utils.chat("&b"+message14).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t14l.add(Utils.chat("&f "));
            t14l.add(Utils.chat("&b%status%").replace("%status%", status14));

            t14m.setLore(t14l);
            t14.setItemMeta(t14m);

            // Message 15
            ItemStack t15 = new ItemStack(Material.CHEST);
            ItemMeta t15m = t15.getItemMeta();
            t15m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "15"));
            String message15 = Utils.chat(Files.msgs.getString("15").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status15 = null;
            if(p.hasPermission(Files.perms.getString("15")) && Data.get().getInt(uuid+".death-message") == 15){
                status15 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("11"))){
                status15 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status15 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t15l = new ArrayList<>();
            t15l.add(Utils.chat("&f "));
            t15l.add(Utils.chat("&b"+message15).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t15l.add(Utils.chat("&f "));
            t15l.add(Utils.chat("&b%status%").replace("%status%", status15));

            t15m.setLore(t15l);
            t15.setItemMeta(t15m);

            // Message 16
            ItemStack t16 = new ItemStack(Material.CHEST);
            ItemMeta t16m = t16.getItemMeta();
            t16m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "16"));
            String message16 = Utils.chat(Files.msgs.getString("16").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status16 = null;
            if(p.hasPermission(Files.perms.getString("16")) && Data.get().getInt(uuid+".death-message") == 16){
                status16 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("11"))){
                status16 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status16 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t16l = new ArrayList<>();
            t16l.add(Utils.chat("&f "));
            t16l.add(Utils.chat("&b"+message16).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t16l.add(Utils.chat("&f "));
            t16l.add(Utils.chat("&b%status%").replace("%status%", status16));

            t16m.setLore(t16l);
            t16.setItemMeta(t16m);

            // Message 17
            ItemStack t17 = new ItemStack(Material.CHEST);
            ItemMeta t17m = t11.getItemMeta();
            t17m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "17"));
            String message17 = Utils.chat(Files.msgs.getString("17").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status17 = null;
            if(p.hasPermission(Files.perms.getString("17")) && Data.get().getInt(uuid+".death-message") == 17){
                status17 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("17"))){
                status17 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status17 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t17l = new ArrayList<>();
            t17l.add(Utils.chat("&f "));
            t17l.add(Utils.chat("&b"+message17).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t17l.add(Utils.chat("&f "));
            t17l.add(Utils.chat("&b%status%").replace("%status%", status17));

            t17m.setLore(t17l);
            t17.setItemMeta(t17m);

            // Message 18
            ItemStack t18 = new ItemStack(Material.CHEST);
            ItemMeta t18m = t18.getItemMeta();
            t18m.setDisplayName(Utils.chat("&f&lDEATH MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "18"));
            String message18 = Utils.chat(Files.msgs.getString("18").replace("%player%", Utils.chat("&o&nPlayer&r")).replace("%weapon%", Utils.chat("&o&nWeapon&r")));
            String status18 = null;
            if(p.hasPermission(Files.perms.getString("18")) && Data.get().getInt(uuid+".death-message") == 18){
                status18 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("18"))){
                status18 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status18 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t18l = new ArrayList<>();
            t18l.add(Utils.chat("&f "));
            t18l.add(Utils.chat("&b"+message18).replace("%prefix%", prefix).replace("%killer%", p.getName()));
            t18l.add(Utils.chat("&f "));
            t18l.add(Utils.chat("&b%status%").replace("%status%", status18));

            t18m.setLore(t18l);
            t18.setItemMeta(t18m);



            // Buttons

            // Back
            ItemStack b1 = new ItemStack(Material.PAPER);
            ItemMeta b1m = b1.getItemMeta();
            b1m.setDisplayName(Utils.chat("&4&l(!) &c&lNO PREVIOUS PAGE"));
            b1.setItemMeta(b1m);
            // Next
            ItemStack n1 = new ItemStack(Material.PAPER);
            ItemMeta n1m = n1.getItemMeta();
            n1m.setDisplayName(Utils.chat("&4&l(!) &c&lNO NEXT PAGE"));
            n1.setItemMeta(n1m);
            // Remove
            ItemStack r1 = new ItemStack(Material.ARMOR_STAND);
            ItemMeta r1m = r1.getItemMeta();
            r1m.setDisplayName(Utils.chat("&4&l(!) &c&lREMOVE DEATH MSG"));
            ArrayList<String> r1l = new ArrayList<>();
            r1l.add(Utils.chat("&f "));
            r1l.add(Utils.chat("&7&o (( &f&oClick &7&oto remove your &f&odeath msg&7&o. ))"));
            r1m.setLore(r1l);
            r1.setItemMeta(r1m);


            // Finish
            in.setItem(0, t1);
            in.setItem(1, t2);
            in.setItem(2, t3);
            in.setItem(3, t4);
            in.setItem(4, t5);
            in.setItem(5, t6);
            in.setItem(6, t7);
            in.setItem(7, t8);
            in.setItem(8, t9);
            in.setItem(9, t10);
            in.setItem(10, t11);
            in.setItem(11, t12);
            in.setItem(12, t13);
            in.setItem(13, t14);
            in.setItem(14, t15);
            in.setItem(15, t16);
            in.setItem(16, t17);
            in.setItem(17, t18);
              // Buttons
            in.setItem(29, b1);
            in.setItem(31, r1);
            in.setItem(33, n1);
            p.openInventory(in);
        }
    }
}
