package com.trulyepicstudios.model;

public class Weapon {

    private int level;
    private String name;
    private int damage;
    //will add additional attributes

    public Weapon(int lvl, String name, int dmg){
        this.level = lvl;
        this.name = name;
        this.damage = dmg;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
