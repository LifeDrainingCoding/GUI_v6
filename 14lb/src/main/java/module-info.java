module com.example.lab14 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab14 to javafx.fxml;
    exports com.example.lab14;
}