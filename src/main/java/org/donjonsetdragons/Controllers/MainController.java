package org.donjonsetdragons.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.donjonsetdragons.MainApp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController extends Controller implements Initializable {
    @FXML
    private Button exitButton;
    @FXML
    private Button startButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Main Scene");
    }

    @FXML
    protected void closeWindow(){
        currentPrimaryStage.close();
    }

    @FXML
    protected void startGame() throws IOException {
        GameController.startGame();
    }

    /* private class ButtonHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource() == startButton){
                GameManager gameManager = new GameManager();
                gameManager.startGame();
            } else if (actionEvent.getSource() == exitButton) {
                mainStage.close();
            }

        }
    }*/
}
