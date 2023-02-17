package org.donjonsetdragons.Controllers;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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

    public static SimpleIntegerProperty currentCaseNumber;

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
        currentCaseNumber = new SimpleIntegerProperty(0);

        IntegerBinding caseBinding = Bindings.createIntegerBinding(() -> boardManager.getCurrentBoard().getCurrentCase().getCaseNumber(), currentCaseNumber);

        currentCaseNumber.bind(caseBinding);
        System.out.println("childs : " + boardContainer.getChildren());
    }
    @FXML
    public void rollDice(){
        int numberThrew = boardManager.rollDice();
        VBox newCase = (VBox) boardContainer.getChildren().get(currentCaseNumber.get());
        // TODO: 17/02/2023 add and remove styleClasses to change the behavior of the case  
//        newCase.getStyleClass().add();
        // TODO: 17/02/2023 check if the currentCasenumber is above the boardContainer.getChildren() length 

        newCase.setBackground(new Background(new BackgroundFill(Color.TURQUOISE, null, null)));
        System.out.println("newCase : " + boardContainer.getChildren().get(currentCaseNumber.get()));
        System.out.println("caseProperty : " + boardManager.getCurrentBoard().getCurrentCase().getCaseNumber());
        System.out.println("currentCaseNumber : " + currentCaseNumber.get());
    }
}
