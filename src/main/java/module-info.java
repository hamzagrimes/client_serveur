module com.example.clientserver {
   // requires javafx.controls;
    //requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens com.example.clientserver to javafx.fxml;
    exports com.example.clientserver;
}