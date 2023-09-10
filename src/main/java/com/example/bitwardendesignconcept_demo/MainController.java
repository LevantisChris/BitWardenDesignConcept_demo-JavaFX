package com.example.bitwardendesignconcept_demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class MainController {

    @FXML
    private Button btnAllItems;

    @FXML
    private Button btnCard;

    @FXML
    private Button btnCloseApp;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnFavorites;

    @FXML
    private Button btnIdentity;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnMinimize;

    @FXML
    private Button btnNode;

    @FXML
    private Button btnPersonal;

    @FXML
    private Button btnSocial;

    @FXML
    private Button btnTrash;

    @FXML
    private Button btnWork;

    @FXML
    private ImageView ivLogo;

    @FXML
    private Label lbICompanyName;

    @FXML
    private Label lbINotes;

    @FXML
    private Label lbIWebsite;

    @FXML
    private TextField tfPassword;

    @FXML
    private TextField tfSearch;

    @FXML
    private TextField tfUsername;

    @FXML
    private VBox vItems;

    @FXML
    void handleButtonClicks(ActionEvent event) {
        System.out.println("Button clicked");
    }

}
