package com.test.controller.services;

import com.test.EmailManager;
import com.test.controller.EmailLoginResult;
import com.test.model.EmailAccount;

public class LoginService {
    EmailAccount emailAccount;
    EmailManager emailManager;

    public LoginService(EmailAccount emailAccount, EmailManager emailManager) {
        this.emailAccount = emailAccount;
        this.emailManager = emailManager;
    }

    public EmailLoginResult login() {

    }
}
