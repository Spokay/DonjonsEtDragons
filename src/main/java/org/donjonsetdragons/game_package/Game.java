package org.donjonsetdragons.game_package;

public class Game {
    public boolean isLost;
    public boolean isWon;
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
