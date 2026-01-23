module com.example.poliar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.poliar to javafx.fxml;
    exports com.example.poliar;
}