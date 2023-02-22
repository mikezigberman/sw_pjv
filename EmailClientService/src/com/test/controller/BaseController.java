package com.test.controller;

import com.test.EmailManager;
import com.test.view.ViewFactory;

public abstract class BaseController {

    protected EmailManager emailManager;

    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    protected ViewFactory viewFactory;
    private String fxmlName;

    public String getFxmlName() {
        return fxmlName;
    }
}
