package tlapie1.finalsoftware1;

import Model.Part;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class ModifyPartsController implements Initializable {
    @FXML
    private Label modifyMachineCompanyLbl;

    @FXML
    private TextField modifyPartIdTxt;

    @FXML
    private TextField modifyPartInvTxt;

    @FXML
    private TextField modifyPartMacIDCompNameTxt;

    @FXML
    private TextField modifyPartMaxTxt;

    @FXML
    private TextField modifyPartMinTxt;

    @FXML
    private TextField modifyPartNameTxt;

    @FXML
    private TextField modifyPartPriceTxt;

    @FXML
    private ToggleGroup modifyTogGroup;

    @FXML
    void modifyInhouseRadio(ActionEvent event) {
        modifyMachineCompanyLbl.setText("Machine ID");
    }

    @FXML
    void modifyOutsourcedRadio(ActionEvent event) {
        modifyMachineCompanyLbl.setText("Company Name");
    }

    @FXML
    void onActionCancelModifyPart(ActionEvent event) {

    }

    @FXML
    void onActionSaveModifyPart(ActionEvent event) {

    }

    //Adding function to send data to modify information
    public void sendPart (Part part) {
        modifyPartIdTxt.setText(String.valueOf(part.getId()));
        modifyPartNameTxt.setText(part.getName());
        modifyPartInvTxt.setText(String.valueOf(part.getStock()));
        modifyPartPriceTxt.setText(String.valueOf(part.getPrice()));
        modifyPartMaxTxt.setText(String.valueOf(part.getMax()));
        modifyPartMinTxt.setText(String.valueOf(part.getMin()));
        // Still need to figure how to do radio buttons
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}