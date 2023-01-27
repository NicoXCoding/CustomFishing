package com.nicocoding.Fishes;

import com.nicocoding.CustomFishing;

import java.util.ArrayList;
import java.util.Random;

public class createFish {

    private CustomFishing main;

    public createFish(CustomFishing main) {
        this.main = main;
    }

    public String randomfishName () {
        ArrayList<String> list = new ArrayList<>(main.getConfig().getStringList("Fishes"));
        Random random = new Random();
        String chosenFish = list.get(random.nextInt(0,main.getConfig().getStringList("Fishes").size()));
        return chosenFish;
    }

    public void randomfishLore () {

    }

}
