module com.example.agencia {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.desktop;
    opens com.example.agencia to javafx.fxml;
    exports com.example.agencia;
}