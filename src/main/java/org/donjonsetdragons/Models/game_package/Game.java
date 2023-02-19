package org.donjonsetdragons.Models.game_package;

public class Game {
    public boolean isLost = false;
    public boolean isWon = false;
    public boolean isLost() {
        return isLost;
    }

    public void setLost(boolean lost) {
        isLost = lost;
    }

    public boolean isWon() {
        return isWon;
    }

    public void setWon(boolean won) {
        isWon = won;
    }


}
