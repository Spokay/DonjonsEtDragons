package org.donjonsetdragons.Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import org.donjonsetdragons.Models.character_package.hero.HeroData;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;

public class ChoiceController extends Controller implements Initializable {
    @FXML
    private ChoiceBox<String> heroChoiceBox;
    @FXML
    private TextField heroName;

    private Map heroMap = new HashMap<String, String>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        heroChoiceBox.getItems().addAll(heroes);
        System.out.println("Choice scene");
    }

    @FXML
    protected void startGame() throws Exception {
        if (!heroName.getText().trim().isEmpty() && !Objects.equals(heroChoiceBox.getValue(), "Select a hero class")){
            HeroData data = new HeroData(heroChoiceBox.getValue(), heroName.getText());
            currentPrimaryStage.setUserData(data);
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Game.fxml"));
            currentPrimaryStage.getScene().setRoot(root);
        }
    }

    @FXML
    public ObservableList<String> heroes = FXCollections.observableArrayList("Magician", "Warrior");

}
