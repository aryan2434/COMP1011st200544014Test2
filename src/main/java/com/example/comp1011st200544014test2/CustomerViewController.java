package com.example.comp1011st200544014test2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CustomerViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}