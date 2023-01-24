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
 * @author Syed Sowad Ephraim
 */
public class MaintenanceOfficerCallController implements Initializable {
    
    @FXML
    private Button Accept;
    @FXML
    private Button Reject;
    @FXML
    private Button Return;
    @FXML
    private Button SendEmailtoPatient;
    
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
    private void SendEmailtoPatient(ActionEvent event) {
        try {
            Parent nextscene = FXMLLoader.load(getClass().getResource("MaintenanceEmail.fxml"));
            Scene scenenext = new Scene(nextscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(scenenext);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    @FXML
    private void ReturnOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("MaintenanceOfficer.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(MaintenanceOfficerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void RejectOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("MaintenanceOfficer.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(MaintenanceOfficerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
