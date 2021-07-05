package com.trulyepicstudios.util;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private int lvl;
    private String name;
    private List<String> slots;

    public Bag(int lvl, String name){
        this.lvl = lvl;
        this.name = name;
        slots = new ArrayList<>();
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addItemToBag(String itemName){
        if(slots.size() < 6) {
            slots.add(itemName);
        }else {
            System.out.println("your bag is full");
        }
    }

    public List<String> getBagItems() {
        return slots;
    }
}
