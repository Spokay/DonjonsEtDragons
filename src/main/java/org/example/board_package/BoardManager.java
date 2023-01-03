package org.example.board_package;

import org.example.board_package.case_package.Case;

import java.util.concurrent.ThreadLocalRandom;

public class BoardManager {

    int rollDice(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        return randomNum;
    }
    Case getCase(){
        return new Case();
    }
}
