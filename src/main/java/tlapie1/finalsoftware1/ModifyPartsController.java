package tlapie1.finalsoftware1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ModifyPartsController {
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
}