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
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class LoginController implements Initializable{
    
    @FXML
    private RadioButton customer;
    
    @FXML
    private RadioButton Owner;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        if(customer.isSelected())
        {
            Parent loader = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXML/Home.fxml")));
            Scene scene = new Scene(loader);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(scene);
            app_stage.show(); 
        }
        else if(Owner.isSelected())
        {
            Parent loader = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXML/Owner.fxml")));
            Scene scene = new Scene(loader);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(scene);
            app_stage.show(); 
        }
        else
        {
            Parent loader = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXML/Admin.fxml")));
            Scene scene = new Scene(loader);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(scene);
            app_stage.show(); 
        }
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
