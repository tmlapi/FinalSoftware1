package tlapie1.finalsoftware1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class AddPartController implements Initializable {
    @FXML
    private ToggleGroup bTogGroup;

    @FXML
    private Label machineCompanyLbl;

    @FXML
    private TextField partIdTxt;

    @FXML
    private TextField partInvTxt;

    @FXML
    private TextField partMacIDCompNameTxt;

    @FXML
    private TextField partMaxTxt;

    @FXML
    private TextField partMinTxt;

    @FXML
    private TextField partNameTxt;

    @FXML
    private TextField partPriceTxt;

    @FXML
    void inhouseRadio(ActionEvent event) {
        machineCompanyLbl.setText("Machine ID");
    }

    @FXML
    void outsourcedRadio(ActionEvent event) {
        machineCompanyLbl.setText("Company Name");
    }

    @FXML
    void onActionCancelAddPart(ActionEvent event) {

    }

    @FXML
    void onActionSaveNewPart(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}