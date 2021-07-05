package com.trulyepicstudios.gameStory;

import com.trulyepicstudios.gameFunctions.Functions;
import com.trulyepicstudios.model.Enemy;
import com.trulyepicstudios.model.Player;
import com.trulyepicstudios.model.Weapon;
import com.trulyepicstudios.util.Bag;

import java.util.Scanner;

public class Intro implements Functions {

    private Scanner scanner = new Scanner(System.in);
    Player player = new Player();

    String n = "Narrator:";
    String v = "voice:";
    String o = "Administrator:";
    private String name;


    public void wakingUp() {


        System.out.println(n + "\n You wake up with vivid memory of your death and nothing else");

        scanner.nextLine();


        System.out.println(n + "\n you hear a voice");
        scanner.nextLine();


        System.out.println(v + "\n ah nameless one, you wake... what shall i call you?");


        System.out.println(o + "\n Choose a name or press enter:");

        chooseName();

        scanner.nextLine();
        System.out.println(name + ": who are you? why do i hear your voice in my head");

        System.out.println(n + "\nYou look around and see that as far as you can see, it's completely white field");

        scanner.nextLine();
        System.out.println(v + "\n you should ask who you are first before seeking mine... time is of the essence. you must chose your weapon" +
                ", for you will encounter many foes in other to find yourself!");

        scanner.nextLine();
        System.out.println("chose a sword or book?");


        chooseWeapon();


        System.out.println(v + "\n that is your stats. the decisions you make on this journey will enhance your stats");
        scanner.nextLine();
        System.out.println("now that you have chosen your weapon of choice, I shall give your next task" +
                "go south to the hut 12 miles from here.");

        chooseYourPath();
    }

    public void southPath() {
        System.out.println(n + "\n you go South. After about 5 miles, you hear a strange and eerie sounds" +
                " you tense in anticipation");

        scanner.nextLine();
        System.out.println("-> suddenly a strange looking wolf pops out and bears it fangs at you, effectively blocking your path");
        System.out.println("To your surprise you can see what appears to be the wolfs stats");

        Enemy wolf = new Enemy();
        wolf.setName("rabid wolf");
        wolf.setDamage(5);
        wolf.setLevel(3);
        wolf.setHealth(25);
        wolf.setDescription("Abandoned wolf by it's mother and currently in a crazy state!");

        scanner.nextLine();
        System.out.println(wolf.toString());

        System.out.println(n + "\n will you fight or go back to chose a different route.");
        System.out.println(n + "\n Y or N");

        while (true) {
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                break;
            } else if (choice.equalsIgnoreCase("N")) {
                chooseYourPath();
                break;
            }
            System.out.println(n + "\n Please enter: Y or N");
        }
        fight(player, wolf);

    }

    //will need to implement this method
    public void chooseYourPath() {
        System.out.println(n + "\n The voice disappears and you are presented with four paths North(N), South(S), West(W) & East(E)");
        System.out.println(n + "\n Choose your path -> N, S, W or E");
        while (true) {
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("N")) {
                northPath();
                break;
            } else if (choice.equalsIgnoreCase("S")) {
                southPath();
                break;
            }
            System.out.println(n + "\n Please enter a valid choice-> N, S, W or E");
        }

    }

    public void northPath() {
    }

    public void chooseWeapon() {
        while (true) {
            String weaponChoice = scanner.nextLine();
            if (weaponChoice.isBlank()) {
                System.out.println(o + "\n incorrect choice, please enter a sword or book");
            } else if (weaponChoice.equalsIgnoreCase("sword")) {
                System.out.println(v + "\n you have chosen a base sword. you shall defend yourself with it");
                System.out.println("your weapon of choice determines a bit of your identity. take a look");

                scanner.nextLine();
                Weapon baseSword = new Weapon(1, "baseSword", 3);
                Bag bag = new Bag(1,"basic bag");
                player.setWeapon(baseSword);
                player.setName(name);
                player.setHealth(30);
                player.setLevel(1);
                player.setBag(bag);
                player.getBag().addItemToBag(baseSword.getName());
                System.out.println(player.toString());
                break;
                //need further implementation of the book/spell path
            } else if (weaponChoice.equalsIgnoreCase("book")) {
                System.out.println(v + "\n hmm a difficult path, you have selected a lv 1 book of spells. " +
                        "you shall defend yourself with the spell inside the book");
                break;
            } else
                System.out.println(o + "\n incorrect choice, please enter a sword or book");
        }
    }

    public void chooseName() {
        name = scanner.nextLine();
        if (name.isBlank()) {
            name = "nameless one";
        } else {
            player.setName(name);
        }
        System.out.println(v);
        if (name.equalsIgnoreCase("nameless one")) {
            System.out.println("oh so you have chosen to remain a nameless one... interesting!");
        } else {
            System.out.println(name + "! that is a good name");
        }
    }

    public void fight(Player player, Enemy enemy) {

        int playerHealth = player.getHealth();
        int enemyHealth = enemy.getHealth();

        for (int i = 0; i < 30; i++) {
            int playerDamage = player.getWeapon().getDamage();
            int enemyDamage = enemy.getDamage();

            int plyDamage = (int) (Math.random() * playerDamage) + player.getLevel();
            int CalEnemyDamge = (int) (Math.random() * enemyDamage) + enemy.getLevel();

            //determine which damage is calculated first based on which level is higher
            if (player.getLevel() > enemy.getLevel()) {
                enemyHealth -= plyDamage;
                System.out.println("You dealt " + plyDamage + " damage to " + enemy.getName());
                playerHealth -= CalEnemyDamge;
                System.out.println(enemy.getName() + " dealt " + CalEnemyDamge + " damage to You");
            } else if (player.getLevel() < enemy.getLevel()) {
                playerHealth -= CalEnemyDamge;
                System.out.println(enemy.getName() + " dealt " + CalEnemyDamge + " damage to You");
                enemyHealth -= plyDamage;
                System.out.println("You dealt " + plyDamage + " damage to " + enemy.getName());
            }

            //determine who the winner is
            if (playerHealth < 0) {
                System.out.println("You have died, GAME OVER");
                break;
            } else if (enemyHealth < 0) {
                System.out.println("You win, " + enemy.getName() + "falls in battle");
                break;
            }
        }

    }
}


