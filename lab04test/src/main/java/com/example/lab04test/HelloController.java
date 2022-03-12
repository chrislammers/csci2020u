package com.example.lab04test;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {

    @FXML
    protected void RegisterClick() {
        System.out.println("Full Name:\t" + nameField.getText());
        System.out.println("E-Mail:\t" + email.getText());
        System.out.println("Full Name:\t"+ phoneNumber.getText());
        System.out.println("Date of Birth:\t" + DoB.getValue());
    }

    @FXML
    private TextField usrNameField;

    @FXML
    private TextField pwrdField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField email;

    @FXML
    private TextField phoneNumber;

    @FXML
    private DatePicker DoB;
}