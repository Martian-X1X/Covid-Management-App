
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
 * @author Asus
 */
public class AdminController implements Initializable {

    @FXML
    private Button updateOnVaccine;
    @FXML
    private Button totalCured;
    @FXML
    private Button vaccineInfo;
    @FXML
    private Button returnBack;
    @FXML
    private Button totalCases;

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
    private void updateOnVaccineonAction(ActionEvent event) {
        try {
            Parent nextscene = FXMLLoader.load(getClass().getResource("AdminVaccineUpdate.fxml"));
            Scene scenenext = new Scene(nextscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(scenenext);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @FXML
    private void totalCuredOnAction(ActionEvent event) {
        try {
            Parent nextscene = FXMLLoader.load(getClass().getResource("AdminTotalCure.fxml"));
            Scene scenenext = new Scene(nextscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(scenenext);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @FXML
    private void vaccineInfoOnAction(ActionEvent event) {
        try {
            Parent nextscene = FXMLLoader.load(getClass().getResource("AdminVaccineInfo.fxml"));
            Scene scenenext = new Scene(nextscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(scenenext);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @FXML
    private void returnBackOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("FirstScene.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void totalCasesonAction(ActionEvent event) {
        
       try {
            Parent nextscene = FXMLLoader.load(getClass().getResource("AdminTotalCases.fxml"));
            Scene scenenext = new Scene(nextscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(scenenext);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
