package tlapie1.finalsoftware1;

import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MainScreenController implements Initializable {

    @FXML
    private TableColumn<Part, Integer> partIdCol;

    @FXML
    private TableColumn<Part, Integer> partInventoryCol;

    @FXML
    private TableColumn<Part, String> partNameCol;

    @FXML
    private TableColumn<Part, Double> partPriceUnitCol;

    @FXML
    private TextField partSearchTxt;

    @FXML
    private TableView<Part> partTableView;

    @FXML
    private TableColumn<Product, Integer> productIdCol;

    @FXML
    private TableColumn<Product, Integer> productInventoryCol;

    @FXML
    private TableColumn<Product, String> productNameCol;

    @FXML
    private TableColumn<Product, Double> productPriceUnitCol;

    @FXML
    private TextField productSearchTxt;

    @FXML
    private TableView<Product> productTableView;

    @FXML
    void onActionAddPart(ActionEvent event) {

    }

    @FXML
    void onActionAddProduct(ActionEvent event) {

    }

    @FXML
    void onActionDeletePart(ActionEvent event) {

    }

    @FXML
    void onActionDeleteProduct(ActionEvent event) {

    }

    @FXML
    void onActionExit(ActionEvent event) {

    }

    @FXML
    void onActionModifyPart(ActionEvent event) {

    }

    @FXML
    void onActionModifyProduct(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Creating Test Data
        InHouse brake = new InHouse(1, 14, 1, 20, "Brake Disks", 119.99, 3);
        InHouse handleBars = new InHouse(2, 20, 1, 20, "Handle Bars", 169.69, 2);
        Outsourced frame = new Outsourced(3, 7, 1, 10, "Trex Frame", 421.76, "Trex");
        Outsourced tires = new Outsourced(4, 80, 1, 100, "Maxxis Tires", 75.21, "Maxxis");
        Product trexBike = new Product(1, 2, 1, 5, "Trex Bike", 820.13);

        Inventory.newPart(brake);
        Inventory.newPart(handleBars);
        Inventory.newPart(frame);
        Inventory.newPart(tires);
        Inventory.newProduct(trexBike);

        // Setting the table view in MainScreen for Parts and Product tables using the getter for observable lists
        //in the Inventory model
        partTableView.setItems(Inventory.getAllParts());
        productTableView.setItems(Inventory.getAllProducts());

        // Setting the part cols to the associated values
        partIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        partNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        partInventoryCol.setCellValueFactory(new PropertyValueFactory<>("stock"));
        partPriceUnitCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        // Setting the product cols to the associated values
        productIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        productNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        productInventoryCol.setCellValueFactory(new PropertyValueFactory<>("stock"));
        productPriceUnitCol.setCellValueFactory(new PropertyValueFactory<>("price"));
    }
}