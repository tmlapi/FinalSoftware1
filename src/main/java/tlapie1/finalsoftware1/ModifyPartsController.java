package tlapie1.finalsoftware1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ModifyPartsController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}