module Main {
    requires javafx.controls;
    requires javafx.fxml;


    opens tlapie1.finalsoftware1 to javafx.fxml;
    opens Model to javafx.base;
    exports tlapie1.finalsoftware1;
}

// This was the hardest part about the whole project because i kept getting illegalaccessexceptions without changing this
//module-info.java to open Main and then to open Model to javafx.base