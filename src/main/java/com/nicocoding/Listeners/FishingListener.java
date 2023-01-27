package com.nicocoding.Listeners;

import com.nicocoding.CustomFishing;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class FishingListener implements Listener {

    private CustomFishing main;

    public FishingListener(CustomFishing main) {
        this.main = main;
    }

    @EventHandler

    public void fishCatching(PlayerFishEvent e) {
        Player p = e.getPlayer();
        e.getHook().setMaxWaitTime(100);
        e.getHook().setMinWaitTime(50);

        if (e.getCaught() instanceof Item) {
            Item item = (Item) e.getCaught();
            ItemStack is = item.getItemStack();
            ItemMeta meta = is.getItemMeta();
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', FishChoser(p)));
            is.setItemMeta(meta);


        }

    }

    public String FishChoser(Player p) {
        ArrayList<String> list = new ArrayList<>(main.getConfig().getStringList("Fishes"));
        Random random = new Random();
        String chosenFish = list.get(random.nextInt(0,main.getConfig().getStringList("Fishes").size()));
        return chosenFish;
    }

}
