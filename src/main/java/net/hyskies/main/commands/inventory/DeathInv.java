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
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DeathInv implements CommandHandler, Listener {
    String prefix = Utils.chat(Files.msgs.getString("prefix"));
    @Override
    public void execute(CommandSender sender, Command command, String[] args) throws IOException {
        if(sender instanceof Player){
            Player p = (Player) sender;
            UUID uuid = p.getUniqueId();

            p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.open").replace("%prefix%", prefix)));
            Inventory in = Bukkit.createInventory(p, Files.config.getInt("death.base.size"), Utils.chat(Files.config.getString("death.base.name")));

            for(String string : Files.config.getConfigurationSection("death.items").getKeys(false)){
                String num = string;
                int numI = Integer.parseInt(string);


                ItemStack itemStack = new ItemStack(Material.getMaterial(Files.config.getString("death.items."+string+".material")), Files.config.getInt("death.items."+string+".amount"), (byte) Files.config.getInt("death.items."+string+".data"));
                ItemMeta meta = itemStack.getItemMeta();
                meta.setDisplayName(Utils.chat(Files.config.getString("death.items."+string+".name")).replace("%num%", num));
                String message = Utils.chat(Files.config.getString("death.items."+string+".message").replace("%killer%", p.getName()).replace("%player%", "&oPlayer").replace("%prefix%", prefix).replace("%weapon%", "&oWeapon"));
                String status = null;
                if(p.hasPermission(Files.perms.getString(string)) && Data.get().getInt(uuid+".death-message") == numI){
                    status = Utils.chat(Files.config.getString("death.base.equipped"));
                }else if(p.hasPermission(Files.perms.getString(string))){
                    status = Utils.chat(Files.config.getString("death.base.not-equipped"));
                }else{
                    status = Utils.chat(Files.config.getString("death.base.locked"));
                }
                ArrayList<String> lore = new ArrayList<>();
                List<String> loreL = Files.config.getStringList("death.items."+string+".lore");
                for (String x : loreL) {
                    lore.add(Utils.chat(x).replace("%message%", message).replace("%status%", status).replace("%player%", p.getName()));
                }

                meta.setLore(lore);
                itemStack.setItemMeta(meta);
                in.setItem(Files.config.getInt("death.items."+string+".slot"), itemStack);
            }

            // Buttons
            ItemStack b1 = new ItemStack(Material.getMaterial(Files.config.getString("death.buttons.previous.material")));
            ItemMeta b1m = b1.getItemMeta();
            b1m.setDisplayName(Utils.chat(Files.config.getString("death.buttons.previous.name")));
            b1.setItemMeta(b1m);
            in.setItem(Files.config.getInt("death.buttons.previous.slot"), b1);
            // Next
            ItemStack b2 = new ItemStack(Material.getMaterial(Files.config.getString("death.buttons.next.material")));
            ItemMeta b2m = b2.getItemMeta();
            b2m.setDisplayName(Utils.chat(Files.config.getString("death.buttons.next.name")));
            b2.setItemMeta(b2m);
            in.setItem(Files.config.getInt("death.buttons.next.slot"), b2);
            // Remove
            ItemStack b3 = new ItemStack(Material.getMaterial(Files.config.getString("death.buttons.remove.material")));
            ItemMeta b3m = b3.getItemMeta();
            b3m.setDisplayName(Utils.chat(Files.config.getString("death.buttons.remove.name")));
            ArrayList<String> lore = new ArrayList<>();
            List<String> loreL = Files.config.getStringList("death.buttons.remove.lore");
            for (String x : loreL) {
                lore.add(Utils.chat(x));
            }
            b2m.setLore(lore);
            b3.setItemMeta(b3m);
            in.setItem(Files.config.getInt("death.buttons.remove.slot"), b3);

            p.openInventory(in);



        }else{System.out.println(Files.msgs.getString("console-error"));}
    }

    @EventHandler
    public void click(InventoryClickEvent e){
        if(e.getClickedInventory() == null){
            return;
        }else{
            if(e.getClickedInventory().getTitle().equalsIgnoreCase(Utils.chat(Files.config.getString("death.base.name")))){
                e.setCancelled(true);

                ItemStack item = e.getCurrentItem();
                if(item == null || item.getType() == Material.AIR){
                    return;
                }else{
                    Player p = (Player) e.getWhoClicked();
                    UUID uuid = p.getUniqueId();

                    for(String string : Files.config.getConfigurationSection("death.items").getKeys(false)){
                        if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat(Files.config.getString("death.items."+string+".name").replace("%num%", string)))){
                            Integer num = Integer.valueOf(string);
                            if(p.hasPermission(Files.perms.getString(num.toString()))){
                                p.closeInventory();
                                p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.set").replace("%prefix%", prefix).replace("%num%", num.toString())));
                                Data.get().set(uuid+".death-message", num);
                                Data.save();
                            }else{p.sendMessage(Utils.chat(Files.msgs.getString("inventory.general.not-unlocked").replace("%prefix%", prefix)));}
                        }else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat(Files.config.getString("death.buttons.remove.name")))){
                            Integer num = 0;
                            p.closeInventory();
                            p.sendMessage(Utils.chat(Files.msgs.getString("inventory.death.reset").replace("%prefix%", prefix)));
                            Data.get().set(uuid + ".death-message", num);
                            Data.save();
                        }
                    }
                }
            }else{return;}
        }
    }
}
