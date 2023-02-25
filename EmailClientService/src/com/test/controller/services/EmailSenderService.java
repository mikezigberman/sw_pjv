package com.test.controller.services;

import com.test.controller.EmailSendingResult;
import com.test.model.EmailAccount;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class EmailSenderService extends Service<EmailSendingResult> {

    private EmailAccount emailAccount;
    private String subject;
    private String recipient;
    private String content;

    public EmailSenderService(EmailAccount emailAccount, String subject, String recipient, String content) {
        this.emailAccount = emailAccount;
        this.subject = subject;
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    protected Task<EmailSendingResult> createTask() {
        return new Task<EmailSendingResult>() {
            @Override
            protected EmailSendingResult call() throws Exception {
                return null;
            }
        };
    }
}