/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.vehiclerental;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mega Store
 */
public class homeController implements Initializable{
    
    @FXML
    private void back(ActionEvent event) throws IOException
    {
            Parent loader = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXML/Login.fxml")));
            Scene scene = new Scene(loader);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(scene);
            app_stage.show();
    }
    
    @FXML
    private void  showDetails(ActionEvent event) throws IOException
    {
        Parent loader = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXML/Details.fxml")));
        Scene scene = new Scene(loader);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(scene);
        app_stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
