package org.donjonsetdragons.Controllers;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class BoardController extends Controller{

    public static Pane[] buildBoard(){
        Pane[] boardCase = new Pane[GameController.boardManager.getCurrentBoard().getTotalCases() - 1];
        for (int i = 0; i < boardCase.length; i++) {
            Pane currentCase = new Pane();
            currentCase.setPadding(new Insets(10));
            currentCase.setBackground(new Background(new BackgroundFill(Color.DARKBLUE, null, null)));
            currentCase.getChildren().add(new Text(String.valueOf(i)));
            boardCase[i] = currentCase;
        }
        return boardCase;
    }
}
