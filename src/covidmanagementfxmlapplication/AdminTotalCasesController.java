
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
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class AdminTotalCasesController implements Initializable {

    @FXML
    private Button Dhaka;
    @FXML
    private Button Barishal;
    @FXML
    private Button Mymensingh;
    @FXML
    private Button Rajshahi;
    @FXML
    private Button Khulna;
    @FXML
    private Button Rangpur;
    @FXML
    private Button Chittagong;
    @FXML
    private Button Sylhet;
    @FXML
    private Button WorldWide;
    @FXML
    private Button Bangladesh;
    @FXML
    private Button returnBack;
    @FXML   
    private Label feedbackLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    private void DhakaOnClick(ActionEvent event){
        feedbackLabel.setText("15000");  
    }
    @FXML
    private void BarishalOnClick(ActionEvent event){
        feedbackLabel.setText("3000"); 
    }
    @FXML
    private void MymensinghOnClick(ActionEvent event){
        feedbackLabel.setText("852");  
    }
    @FXML
    private void RajshahiOnClick(ActionEvent event){
        feedbackLabel.setText("145");  
    }
    @FXML
    private void KhulnaOnClick(ActionEvent event){
        feedbackLabel.setText("584");  
    }
    @FXML
    private void RangpurOnClick(ActionEvent event){
        feedbackLabel.setText("545");  
    }
    @FXML
    private void ChittagongOnClick(ActionEvent event){
        feedbackLabel.setText("7852");  
    }
    @FXML
    private void SylhetOnClick(ActionEvent event){
        feedbackLabel.setText("452");  
    }
    @FXML
    private void WorldWideOnClick(ActionEvent event){
        feedbackLabel.setText("4572");  
    }
    @FXML
    private void BangladeshOnClick(ActionEvent event){
        feedbackLabel.setText("456");  
    }
    

    @FXML
    private void returnOnAction(ActionEvent event) {
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
       
}
