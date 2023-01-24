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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Syed Sowad Ephraim
 */
public class EmergencyHospitalRequestListController implements Initializable {

    @FXML
    private TableView<UserHos> table;
    @FXML
    private TableColumn<UserHos, String> name;
    @FXML
    private TableColumn<UserHos,String> email;
    @FXML
    private TableColumn<UserHos, String> location;
    @FXML
    private Button Return;
    @FXML
    private Button HospitalList;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<UserHos>items=FXCollections.observableArrayList();
        items.add(new UserHos("Abdullah Matin", "abdmtn@gmail.com", "Dhanmondi"));
        items.add(new UserHos("Syed Ali", "syed.ali432@gmail.com", "Bashundhara Residential"));
        items.add(new UserHos("Akibur Chowdhury", "akb.chdw@gmail.com", "Gulshan"));
        table.setItems(items);
        email.setCellValueFactory(new PropertyValueFactory<UserHos,String>("email"));
        name.setCellValueFactory(new PropertyValueFactory<UserHos,String>("name"));
        location.setCellValueFactory(new PropertyValueFactory<UserHos, String>("location"));
    } 
    
    @FXML
    private void HospitalListOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("EmergencyHospitalList.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(EmergencyServicesManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void ReturnOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("EmergencyHospitalBed.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(EmergencyServicesManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
