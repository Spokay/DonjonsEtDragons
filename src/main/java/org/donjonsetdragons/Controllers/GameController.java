package org.donjonsetdragons.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import org.donjonsetdragons.Models.character_package.hero.Hero;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController extends Controller implements Initializable {

    @FXML
    public Label heroAttackPoints;
    @FXML
    public Label heroHpPoints;

    private static HeroController heroController;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            this.startGame();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    public void startGame() throws Exception {
        String heroType = "org.donjonsetdragons.Models.character_package.hero.Magician";
        String heroName = "michel";
        System.out.println(this.heroHpPoints);
        heroController = new HeroController(this.heroHpPoints, this.heroAttackPoints, new String[]{heroType, heroName});
    }
}
