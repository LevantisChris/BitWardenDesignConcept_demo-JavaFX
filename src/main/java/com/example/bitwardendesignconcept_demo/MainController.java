package com.example.bitwardendesignconcept_demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
           Node [] nodes = new Node[5];
           for (int i = 0;i < nodes.length;i++) {
               nodes[i] = FXMLLoader.load(getClass().getResource("mainitem.fxml"));
               final int h = i;
               nodes[i].setOnMouseEntered(evt -> {
                   nodes[h].setStyle("-fx-background-color: #336600");
               });
               nodes[i].setOnMouseExited(evt -> {
                   nodes[h].setStyle("-fx-background-color: #1E1E1E");
               });
               nodes[i].setOnMousePressed(evt -> {
                   nodes[h].setStyle("-fx-background-color: #1E1E1E");
                   // do something
                   System.out.println("App obj pressed ...");
               });
               VBox.setMargin(nodes[i], new Insets(5, 0, 5, 0)); // 5px padding on the top and bottom
               vItems.getChildren().add(nodes[i]);
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
