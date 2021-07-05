package com.trulyepicstudios.model;

import com.trulyepicstudios.util.Bag;

public class Player {

    private String name = "??";
    private int health;
    private int level = 1;
    private Weapon weapon;
    private int stamina = 5;
    private int chi = 0;
    private Bag bag;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getChi() {
        return chi;
    }

    public void setChi(int chi) {
        this.chi = chi;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    @Override
    public String toString() {
        return "Player\n{" +
                "name='" + name + '\'' +
                ",\n health= " + health +
                ",\n level= " + level +
                ",\n weapon= " + weapon.getName() +
                ",\n stamina= " + stamina +
                ",\n chi= " + chi +
                ",\n bag= " + bag.getName()+
                ",\n bag Items= "+bag.getBagItems()+
                '}';
    }
}
