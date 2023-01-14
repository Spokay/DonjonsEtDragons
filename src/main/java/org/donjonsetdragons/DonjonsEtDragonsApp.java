package org.donjonsetdragons;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.donjonsetdragons.game_package.GameManager;


public class DonjonsEtDragonsApp extends Application {
    private Stage mainStage;
    private Button startButton;
    private Button exitButton;
    public void start(Stage primaryStage) throws Exception{
        mainStage = primaryStage;
        primaryStage.setTitle("Donjons et Dragons");
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(40));
        startButton = new Button("Commencer la partie");
        ImageView startIcon = new ImageView(getClass().getResource("/images/start_icon.png").toString());
        startIcon.setFitWidth(15.00);
        startIcon.setFitHeight(15.00);
        startButton.setContentDisplay(ContentDisplay.LEFT);
        startButton.setGraphic(startIcon);
        startButton.setBackground(new Background(new BackgroundFill(Color.LAWNGREEN, null, null)));
        startButton.setTextFill(Color.DARKBLUE);
        exitButton = new Button("Quitter le jeu");
        startButton.setOnAction(new ButtonHandler());
        exitButton.setOnAction(new ButtonHandler());
        root.getChildren().addAll(startButton, exitButton);
        Scene mainScene = new Scene(root, Color.BEIGE);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    private class ButtonHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent actionEvent) {
            if (actionEvent.getSource() == startButton){
                GameManager gameManager = new GameManager();
                gameManager.startGame();
            } else if (actionEvent.getSource() == exitButton) {
                mainStage.close();
            }

        }
    }
}
