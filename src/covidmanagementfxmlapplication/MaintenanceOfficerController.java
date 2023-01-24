/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidmanagementfxmlapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdullah Matin
 */
public class MaintenanceOfficerController implements Initializable {
    @FXML
    private Button Logout;
    @FXML
    private Button CalltoPatient;
    @FXML
    private Button UpdateCases;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    private void CalltoPatient(ActionEvent event) {
        try {
            Parent nextscene = FXMLLoader.load(getClass().getResource("MaintenanceOfficerCall.fxml"));
            Scene scenenext = new Scene(nextscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(scenenext);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
     @FXML
    private void UpdateCases(ActionEvent event) {
        try {
            Parent nextscene = FXMLLoader.load(getClass().getResource("MaintenanceCases.fxml"));
            Scene scenenext = new Scene(nextscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(scenenext);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    @FXML
    private void LogoutOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("FirstScene.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(MaintenanceOfficerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
