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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class AdminVaccineUpdateController implements Initializable {

    @FXML
    private Button loadLatestNews;
    @FXML
    private Button returnBack;
    @FXML
    private TextArea textArea;
    @FXML
    private Button Contact;

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
    private void loadLatestNewsonAction(ActionEvent event) {
        textArea.setText("-Everyone above the age of 18 should get vaccinated as soon as possible. \n-New stock of Moderna available. \n-New batch of booster doses has been shipped. ");
    }

    @FXML
    private void returnBackonAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("Admin.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void ContactonAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("AdminEmail.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
