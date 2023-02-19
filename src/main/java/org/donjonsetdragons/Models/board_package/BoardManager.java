package org.donjonsetdragons.Models.board_package;

import javafx.beans.property.SimpleIntegerProperty;
import org.donjonsetdragons.Controllers.GameController;
import org.donjonsetdragons.Models.board_package.case_package.Case;
import org.donjonsetdragons.Models.game_package.Game;

import java.util.concurrent.ThreadLocalRandom;

public class BoardManager {
    private Board currentBoard;
    private Game currentGame;

    public BoardManager(Game currentGame){
        this.setCurrentBoard(new Board());
        this.setCurrentGame(currentGame);
    }

    public int rollDice(){
//        get a random number between 1 and 6
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        System.out.println("randomNumber : " + randomNum);
//        calculate the new board case number
        int currentCaseNumber = this.getCurrentBoard().getRemainingCases() + randomNum;
        this.getCurrentBoard().setCurrentCaseNumber(currentCaseNumber);
//        check if the new case number has enough cases left to go
        if (currentCaseNumber < this.getCurrentBoard().getTotalCases()){
//            if he can then set a Case object to the new case with the right number
            GameController.currentCaseNumber = new SimpleIntegerProperty(currentCaseNumber);
            this.getCurrentBoard().setCurrentCase(new Case(currentCaseNumber));


            this.getCurrentBoard().makeCaseInteraction(this.getCurrentBoard().getCurrentCase());
            if (this.getCurrentGame().isLost()){
                GameController.gameLost();
            }

        }else{
//            if he passed the end line then set the Game property to isWon
            this.getCurrentGame().setWon(true);
            GameController.gameWon();
        }

        return randomNum;
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public void setCurrentBoard(Board currentBoard) {
        this.currentBoard = currentBoard;
    }
    public Game getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(Game currentGame) {
        this.currentGame = currentGame;
    }
}
