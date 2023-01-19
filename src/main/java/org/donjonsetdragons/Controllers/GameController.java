package org.donjonsetdragons.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.donjonsetdragons.MainApp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameController extends Controller implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public static void startGame() throws IOException {
        Parent root = FXMLLoader.load(GameController.class.getResource("/fxml/Game.fxml"));
        Scene gameScene = new Scene(root);
        currentPrimaryStage.setScene(gameScene);
    }
}
