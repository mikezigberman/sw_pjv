package com.test.controller;

import com.test.EmailManager;
import com.test.controller.services.LoginService;
import com.test.model.EmailAccount;
import com.test.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginWindowController extends BaseController {

        @FXML
        private TextField emailAddressField;

        @FXML
        private Label errorLabel;

        @FXML
        private PasswordField passwordField;

    public LoginWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void loginButtonAction() {
        System.out.println("loginButtonAction!!!");
        if(fieldsAreValid()){
            EmailAccount emailAccount = new EmailAccount(emailAddressField.getText(), passwordField.getText());
            LoginService loginService = new LoginService(emailAccount, emailManager);
            loginService.start();
            loginService.setOnSucceeded(event -> {
                EmailLoginResult emailLoginResult = loginService.getValue();
                switch (emailLoginResult) {
                    case SUCCESS:
                        System.out.println("login succesfull" + emailAccount);
                        viewFactory.showMainWindow();
                        Stage stage = (Stage) errorLabel.getScene().getWindow();
                        viewFactory.closeStage(stage);
                        return;
                }
            });
        }

    }

    private boolean fieldsAreValid() {
        if(emailAddressField.getText().isEmpty()) {
            errorLabel.setText("Please fill email");
            return false;
        }
        if(emailAddressField.getText().isEmpty()) {
            errorLabel.setText("Please fill password");
            return false;
        }

        return true;
    }
}
