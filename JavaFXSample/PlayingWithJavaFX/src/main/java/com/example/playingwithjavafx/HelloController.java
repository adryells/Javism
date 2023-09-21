package com.example.playingwithjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onUnsafeButtonClick() {
        welcomeText.setText("Tamanduá bandeira!");
    }

    @FXML
    protected void onSafeButtonClick() {
        welcomeText.setText("Cuidado ao olhar para trás.");
    }
}