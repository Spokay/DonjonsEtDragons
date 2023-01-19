package org.donjonsetdragons.Models.game_package;

import org.donjonsetdragons.Models.board_package.BoardManager;

public class GameManager {
    public BoardManager board;

    public Game currentGame;

    public void GameManager(){
        this.startGame();
    }
    public void startGame(){
        BoardManager boardManager = new BoardManager();
        boardManager.generateBoard();
        this.setBoard(boardManager);
        this.setCurrentGame(new Game());
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

}