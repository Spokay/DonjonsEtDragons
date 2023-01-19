package org.donjonsetdragons.Controllers;

import javafx.stage.Stage;
import org.donjonsetdragons.MainApp;

public class Controller {
    static Stage currentPrimaryStage;

    {
        currentPrimaryStage = MainApp.currentPrimaryStage;
    }
}
