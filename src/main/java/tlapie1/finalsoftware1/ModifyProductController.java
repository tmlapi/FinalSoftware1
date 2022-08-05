package tlapie1.finalsoftware1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ModifyProductController implements Initializable {
    @FXML
    private TableColumn<?, ?> modifyProductAssociatedPartIdCol;

    @FXML
    private TableColumn<?, ?> modifyProductAssociatedPartInvCol;

    @FXML
    private TableColumn<?, ?> modifyProductAssociatedPartNameCol;

    @FXML
    private TableColumn<?, ?> modifyProductAssociatedPartPriceCol;

    @FXML
    private TableView<?> modifyProductAssociatedPartTableView;

    @FXML
    private TableColumn<?, ?> modifyProductAvailablePartIdCol;

    @FXML
    private TableColumn<?, ?> modifyProductAvailablePartInvCol;

    @FXML
    private TableColumn<?, ?> modifyProductAvailablePartNameCol;

    @FXML
    private TableColumn<?, ?> modifyProductAvailablePartPriceCol;

    @FXML
    private TableView<?> modifyProductAvailablePartTableView;

    @FXML
    private TextField modifyProductIdTxt;

    @FXML
    private TextField modifyProductInvTxt;

    @FXML
    private TextField modifyProductMaxTxt;

    @FXML
    private TextField modifyProductMinTxt;

    @FXML
    private TextField modifyProductNameTxt;

    @FXML
    private TextField modifyProductPriceTxt;

    @FXML
    private TextField modifyProductSearch;

    @FXML
    void modifyProductAddBtn(ActionEvent event) {

    }

    @FXML
    void modifyProductCancelBtn(ActionEvent event) {

    }

    @FXML
    void modifyProductRemoveBtn(ActionEvent event) {

    }

    @FXML
    void modifyProductSaveBtn(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}