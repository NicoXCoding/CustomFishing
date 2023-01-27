package com.nicocoding;

import com.nicocoding.Fishes.createFish;
import com.nicocoding.Listeners.FishingListener;
import org.bukkit.Bukkit;
import org.bukkit.entity.Fish;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class CustomFishing extends JavaPlugin {

    private FishingListener fishlisten;
    private createFish fishcreator;

    @Override
    public void onEnable() {

        System.out.println("[Custom Fishing] Made by NicoCoding");
        System.out.println("[Custom Fishing] has been enabled without errors!");

        //fish event registreren
        Bukkit.getPluginManager().registerEvents(new FishingListener(this),this);

        //fishlistener instance laden
        fishlisten = new FishingListener(this);
        fishcreator = new createFish(this);



        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }
     //instances returnen

    public FishingListener getFishingListener() {return fishlisten;}
    public createFish getFishcreator() {return fishcreator;}

}
