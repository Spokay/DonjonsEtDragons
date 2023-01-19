package org.donjonsetdragons;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {
    public static Stage currentPrimaryStage;
    public void start(Stage primaryStage) throws Exception{
        currentPrimaryStage = primaryStage;
        primaryStage.setFullScreen(true);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
        primaryStage.setTitle("Donjons et Dragons");
        Scene mainScene = new Scene(root);
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
}
