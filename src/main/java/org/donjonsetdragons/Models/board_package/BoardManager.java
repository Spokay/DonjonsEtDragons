package org.donjonsetdragons.Models.board_package;

import org.donjonsetdragons.Models.board_package.case_package.Case;

import java.util.concurrent.ThreadLocalRandom;

public class BoardManager {
    Board currentBoard;
    public void generateBoard(){
        this.setCurrentBoard(new Board());
    }

    int rollDice(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        return randomNum;
    }
    Case getCase(){
        return new Case();
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public void setCurrentBoard(Board currentBoard) {
        this.currentBoard = currentBoard;
    }
}
