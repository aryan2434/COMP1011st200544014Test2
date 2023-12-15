module com.example.comp1011st200544014test2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;
            
                            
    opens com.example.comp1011st200544014test2 to javafx.fxml, com.google.gson;
    exports com.example.comp1011st200544014test2;
}