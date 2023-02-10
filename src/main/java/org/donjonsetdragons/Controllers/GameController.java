package org.donjonsetdragons.Controllers;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import org.donjonsetdragons.Models.board_package.BoardManager;
import org.donjonsetdragons.Models.character_package.HeroManager;
import org.donjonsetdragons.Models.character_package.hero.HeroData;
import org.donjonsetdragons.Models.game_package.GameManager;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController extends Controller implements Initializable {

    @FXML
    public Label heroAttackPoints;
    @FXML
    public Label heroHpPoints;
    @FXML
    public Label heroName;
    @FXML
    public FlowPane boardContainer;

    public static HeroManager heroManager;

    public static GameManager gameManager;

    public static BoardManager boardManager;

    public SimpleIntegerProperty currentCaseNumber;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            HeroData data = (HeroData) currentPrimaryStage.getUserData();
            this.startGame(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void startGame(HeroData data) throws Exception {
        heroManager = new HeroManager(this.heroName, this.heroHpPoints, this.heroAttackPoints, new String[]{data.getHeroType(), data.getHeroName()});
        gameManager = new GameManager(heroManager.getCurrentHero());
        boardManager = gameManager.getBoard();
        this.createBoard();
    }

    private void createBoard(){
        VBox[] boardCases = BoardController.buildBoard();
        for (VBox boardCase: boardCases) {
            boardContainer.getChildren().add(boardCase);
        }
        this.currentCaseNumber = new SimpleIntegerProperty(0);

        IntegerBinding caseBinding = Bindings.createIntegerBinding(() -> boardManager.getCurrentBoard().getCurrentCase().getCaseNumber(), this.currentCaseNumber);

        currentCaseNumber.bind(caseBinding);

        System.out.println("start : " + this.currentCaseNumber.get());
        System.out.println("childs : " + boardContainer.getChildren());
    }
    @FXML
    public void rollDice(){
        int numberThrew = boardManager.rollDice();
        System.out.println("caseProperty : " + boardManager.getCurrentBoard().getCurrentCase().getCaseNumber());
        System.out.println("currentCaseNumber : " + this.currentCaseNumber.get());
    }
}
