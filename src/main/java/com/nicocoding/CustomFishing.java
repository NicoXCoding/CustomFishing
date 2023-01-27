package com.nicocoding;

import com.nicocoding.Listeners.FishingListener;
import org.bukkit.Bukkit;
import org.bukkit.entity.Fish;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class CustomFishing extends JavaPlugin {

    private FishingListener fishlisten;

    @Override
    public void onEnable() {

        System.out.println("[Custom Fishing] Made by NicoCoding");
        System.out.println("[Custom Fishing] has been enabled without errors!");

        //fish event registreren
        Bukkit.getPluginManager().registerEvents(new FishingListener(this),this);

        //fishlistener instance laden
        fishlisten = new FishingListener(this);




        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }
     //instances returnen

    public FishingListener getFishingListener() {return fishlisten;}

}
