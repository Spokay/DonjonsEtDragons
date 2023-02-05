package org.donjonsetdragons.Controllers;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class BoardController extends Controller{

    public static VBox[] buildBoard(){
        VBox[] boardCase = new VBox[GameController.boardManager.getCurrentBoard().getTotalCases() - 1];
        for (int i = 0; i < boardCase.length; i++) {
            VBox currentCase = new VBox();
            currentCase.setAlignment(Pos.CENTER);
            currentCase.setPadding(new Insets(10));
            currentCase.setBackground(new Background(new BackgroundFill(Color.rgb(144, 169, 85), null, null)));
            currentCase.setMinWidth(50);
            currentCase.setMinHeight(50);
            currentCase.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(2))));
//            ImageView characterImage = new ImageView();
            currentCase.getChildren().add(new Text(String.valueOf(i)));
            boardCase[i] = currentCase;
        }
        return boardCase;
    }
}
