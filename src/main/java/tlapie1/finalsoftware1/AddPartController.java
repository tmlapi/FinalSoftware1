package tlapie1.finalsoftware1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AddPartController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}