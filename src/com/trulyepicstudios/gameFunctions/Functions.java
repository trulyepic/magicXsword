package com.trulyepicstudios.gameFunctions;

import com.trulyepicstudios.model.Enemy;
import com.trulyepicstudios.model.Player;

public interface Functions {

    void southPath();
    void northPath();
    void chooseWeapon();
    void chooseName();
    void fight(Player player, Enemy enemy);
}
