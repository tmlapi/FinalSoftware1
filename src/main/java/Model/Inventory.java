package Model;

import javafx.collections.ObservableList;

public class Inventory {

    private static ObservableList <Part> allParts;
    private static ObservableList <Product> allProducts;

    // Still have to add the rest of the code


    public static ObservableList<Part> getAllParts() {
        return allParts;
    }

    public static ObservableList<Product> getAllProducts() {
        return allProducts;
    }
}
