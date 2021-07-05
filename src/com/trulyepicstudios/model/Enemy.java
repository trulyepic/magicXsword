package com.trulyepicstudios.model;

public class Enemy {

    private String name;
    private int damage;
    private int level;
    private int health;
    private String description;

    public Enemy(String name, int damage, int level, String description, int health) {
        this.name = name;
        this.damage = damage;
        this.level = level;
        this.description = description;
        this.health = health;
    }

    public Enemy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Enemy\n {" +
                "name=' " + name + '\'' +
                ",\n damage= " + damage +
                ", \n level= " + level +
                ", \n health= " + health +
                ", \n description= '" + description + '\'' +
                '}';
    }
}
