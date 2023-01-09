package org.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.example.game_package.GameManager;

public class DonjonsEtDragonsApp extends Application {
    public void start(Stage primaryStage) throws Exception{
        GameManager gameManager = new GameManager();
        Group root = new Group();
        Scene mainScene = new Scene(root, 300, 300, Color.BEIGE);
        primaryStage.setScene(mainScene);
        gameManager.startGame(mainScene);
        primaryStage.show();
    }
}
