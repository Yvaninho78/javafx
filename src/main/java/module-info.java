module fr.yvan {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.yvan to javafx.fxml;

    exports fr.yvan;
}
