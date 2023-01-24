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
 * @author Syed Sowad Ephraim
 */
public class EmergencyHospitalEmailController implements Initializable {

   @FXML
    private TextArea textArea;
    @FXML
    private Button Send;
    @FXML
    private Button Return; 
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void returnBackonAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("EmergencyHospitalRequestList.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminEmailController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void SendonAction(ActionEvent event) {
        textArea.setText("EMAIL HAS BEEN SENT!");
    }
    
}
