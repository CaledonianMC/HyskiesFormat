package net.hyskies.main.commands.inventory;

import net.hyskies.main.managers.CommandHandler;
import net.hyskies.main.utils.Utils;
import net.hyskies.main.utils.files.Data;
import net.hyskies.main.utils.files.Files;
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
import java.util.UUID;

public class JoinGUI implements CommandHandler {

    @Override
    public void execute(CommandSender sender, Command command, String[] args) throws IOException {
        if(sender instanceof Player){
            String prefix = Utils.chat(Files.msgs.getString("prefix"));
            Player p = (Player) sender;
            UUID uuid = p.getUniqueId();

            p.sendMessage(Utils.chat(Files.msgs.getString("inventory.join.open").replace("%prefix%", prefix)));
            Inventory in = Bukkit.createInventory(p, 36, Utils.chat("&bJoin &fMessages"));

            // Message 1
            ItemStack t1 = new ItemStack(Material.CHEST);
            ItemMeta t1m = t1.getItemMeta();
            t1m.setDisplayName(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "1"));
            String message1 = Utils.chat(Files.msgs.getString("join-1").replace("%player%", p.getName()));
            String status1 = null;
            if(p.hasPermission(Files.perms.getString("join-1")) && Data.get().getInt(uuid+".join-message") == 1){
                status1 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("1"))){
                status1 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status1 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t1l = new ArrayList<>();
            t1l.add(Utils.chat("&f "));
            t1l.add(Utils.chat("&b"+message1).replace("%prefix%", prefix).replace("%player%", p.getName()));
            t1l.add(Utils.chat("&f "));
            t1l.add(Utils.chat("&b%status%").replace("%status%", status1));

            t1m.setLore(t1l);
            t1.setItemMeta(t1m);

            // Message 2
            ItemStack t2 = new ItemStack(Material.CHEST);
            ItemMeta t2m = t2.getItemMeta();
            t2m.setDisplayName(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "2"));
            String message2 = Utils.chat(Files.msgs.getString("join-2").replace("%player%", p.getName()));
            String status2 = null;
            if(p.hasPermission(Files.perms.getString("join-2")) && Data.get().getInt(uuid+".join-message") == 2){
                status2 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("2"))){
                status2 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status2 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t2l = new ArrayList<>();
            t2l.add(Utils.chat("&f "));
            t2l.add(Utils.chat("&b"+message2).replace("%prefix%", prefix).replace("%player%", p.getName()));
            t2l.add(Utils.chat("&f "));
            t2l.add(Utils.chat("&b%status%").replace("%status%", status2));

            t2m.setLore(t2l);
            t2.setItemMeta(t2m);

            // Message 3
            ItemStack t3 = new ItemStack(Material.CHEST);
            ItemMeta t3m = t3.getItemMeta();
            t3m.setDisplayName(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "3"));
            String message3 = Utils.chat(Files.msgs.getString("join-3").replace("%player%", p.getName()));
            String status3 = null;
            if(p.hasPermission(Files.perms.getString("join-3")) && Data.get().getInt(uuid+".join-message") == 3){
                status3 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("3"))){
                status3 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status3 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t3l = new ArrayList<>();
            t3l.add(Utils.chat("&f "));
            t3l.add(Utils.chat("&b"+message3).replace("%prefix%", prefix).replace("%player%", p.getName()));
            t3l.add(Utils.chat("&f "));
            t3l.add(Utils.chat("&b%status%").replace("%status%", status3));

            t3m.setLore(t3l);
            t3.setItemMeta(t3m);

            // Message 4
            ItemStack t4 = new ItemStack(Material.CHEST);
            ItemMeta t4m = t4.getItemMeta();
            t4m.setDisplayName(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "4"));
            String message4 = Utils.chat(Files.msgs.getString("join-4").replace("%player%", p.getName()));
            String status4 = null;
            if(p.hasPermission(Files.perms.getString("join-4")) && Data.get().getInt(uuid+".join-message") == 4){
                status4 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("4"))){
                status4 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status4 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t4l = new ArrayList<>();
            t4l.add(Utils.chat("&f "));
            t4l.add(Utils.chat("&b"+message4).replace("%prefix%", prefix).replace("%player%", p.getName()));
            t4l.add(Utils.chat("&f "));
            t4l.add(Utils.chat("&b%status%").replace("%status%", status4));

            t4m.setLore(t4l);
            t4.setItemMeta(t4m);

            // Message 3
            ItemStack t5 = new ItemStack(Material.CHEST);
            ItemMeta t5m = t5.getItemMeta();
            t5m.setDisplayName(Utils.chat("&f&lJOIN MESSAGE ｜ &b&lPRESET %num%").replace("%num%", "5"));
            String message5 = Utils.chat(Files.msgs.getString("join-5").replace("%player%", p.getName()));
            String status5 = null;
            if(p.hasPermission(Files.perms.getString("join-5")) && Data.get().getInt(uuid+".join-message") == 5){
                status5 = Utils.chat("&a&o(( Currently Equipped ))");
            }else if(p.hasPermission(Files.perms.getString("1"))){
                status5 = Utils.chat("&7&o(( &f&oClick &7&oto &f&oequip &7&othis preset ))");
            }else{
                status5 = Utils.chat("&c&o(( You have not &nunlocked&r &c&othis preset ))");
            }
            ArrayList<String> t5l = new ArrayList<>();
            t5l.add(Utils.chat("&f "));
            t5l.add(Utils.chat("&b"+message5).replace("%prefix%", prefix).replace("%player%", p.getName()));
            t5l.add(Utils.chat("&f "));
            t5l.add(Utils.chat("&b%status%").replace("%status%", status5));

            t5m.setLore(t5l);
            t5.setItemMeta(t5m);











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
            r1m.setDisplayName(Utils.chat("&4&l(!) &c&lREMOVE JOIN MSG"));
            ArrayList<String> r1l = new ArrayList<>();
            r1l.add(Utils.chat("&f "));
            r1l.add(Utils.chat("&7&o (( &f&oClick &7&oto remove your &f&ojoin msg&7&o. ))"));
            r1m.setLore(r1l);
            r1.setItemMeta(r1m);


            // Finish
            in.setItem(0, t1);
            in.setItem(1, t2);
            in.setItem(2, t3);
            in.setItem(3, t4);
            in.setItem(4, t5);
              // Buttons
            in.setItem(29, b1);
            in.setItem(31, r1);
            in.setItem(33, n1);
            p.openInventory(in);
        }
    }
}
