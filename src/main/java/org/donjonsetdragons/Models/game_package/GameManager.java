package org.donjonsetdragons.Models.game_package;

import org.donjonsetdragons.Models.board_package.BoardManager;
import org.donjonsetdragons.Models.character_package.Hero;

public class GameManager {
    public BoardManager board;

    public Game currentGame;

    public Hero currentHero;

    public GameManager(Hero hero){
        this.setCurrentHero(hero);
        this.startGame();
    }
    public void startGame(){
        this.setCurrentGame(new Game());
        BoardManager boardManager = new BoardManager(currentGame);
        this.setBoard(boardManager);
    }
    public BoardManager getBoard() {
        return board;
    }
    public void setBoard(BoardManager board) {
        this.board = board;
    }
    public Game getCurrentGame() {
        return currentGame;
    }
    public void setCurrentGame(Game currentGame) {
        this.currentGame = currentGame;
    }
    public Hero getCurrentHero() {
        return currentHero;
    }
    public void setCurrentHero(Hero currentHero) {
        this.currentHero = currentHero;
    }
}
