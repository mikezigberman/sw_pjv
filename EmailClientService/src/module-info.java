module EmailClientService{
        requires javafx.fxml;
        requires javafx.controls;
        requires javafx.graphics;
        requires javafx.web;
        requires activation;
        requires java.mail;

        opens com;
        opens com.view;
        opens com.controller;
        opens com.model;

}