module EmailClientService{
        requires javafx.fxml;
        requires javafx.controls;
        requires javafx.graphics;
        requires javafx.web;

        opens com.test;
        opens com.test.view;
        opens com.test.controller;

}