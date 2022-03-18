module com.example.lab04test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab04test to javafx.fxml;
    exports com.example.lab04test;
}