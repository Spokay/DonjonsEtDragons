package org.donjonsetdragons.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import org.donjonsetdragons.Models.board_package.BoardManager;
import org.donjonsetdragons.Models.character_package.HeroManager;
import org.donjonsetdragons.Models.character_package.hero.HeroData;
import org.donjonsetdragons.Models.game_package.GameManager;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class GameController extends Controller implements Initializable {

    @FXML
    public Label heroAttackPoints;
    @FXML
    public Label heroHpPoints;
    @FXML
    public Label heroName;
    @FXML
    public AnchorPane boardContainer;

    public static HeroManager heroManager;

    public static GameManager gameManager;

    public static BoardManager boardManager;

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
    }

    private void createBoard(){
        Pane[] boardCases = BoardController.buildBoard();
        boardContainer.getChildren().addAll(boardCases);
        System.out.println(Arrays.toString(boardCases));
    }

    @FXML
    public void rollDice(){
        int numberThrew = boardManager.rollDice();
        this.createBoard();
    }
}
