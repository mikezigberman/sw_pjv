package com.test.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginWindowController {

        @FXML
        private TextField emailAddressField;

        @FXML
        private Label errorLabel;

        @FXML
        private PasswordField passwordField;

        @FXML
        void loginButtonAction() {
            System.out.println("whats up?");

    }
}
