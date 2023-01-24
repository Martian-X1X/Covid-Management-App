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
public class EmergencyHospitalListController implements Initializable {

    @FXML
    private TableView<Hospital> table;
    @FXML
    private TableColumn<Hospital, String> name;
    @FXML
    private TableColumn<Hospital,String> address;
    @FXML
    private TableColumn<Hospital, String> bed;
    @FXML
    private Button Notify;
    @FXML
    private Button Return;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Hospital>items=FXCollections.observableArrayList();
        items.add(new Hospital("Square Hospital", "18 Bir Uttam Qazi Nuruzzaman Sarak", "8"));
        items.add(new Hospital("Evercare Hospital", "Plot 81, Bashundhara Residential Area", "20"));
        items.add(new Hospital("United Hospital", "Plot 15, Road number 71", "13"));
        items.add(new Hospital("Labaid Hospital", "House 1, Road Number 5, Dhaka 1205", "26"));
        table.setItems(items);
        address.setCellValueFactory(new PropertyValueFactory<Hospital,String>("address"));
        name.setCellValueFactory(new PropertyValueFactory<Hospital,String>("name"));
        bed.setCellValueFactory(new PropertyValueFactory<Hospital, String>("bed"));
    }    
    
    @FXML
    private void ReturnOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("EmergencyHospitalRequestList.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(EmergencyServicesManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void NotifyOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("EmergencyHospitalEmail.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(EmergencyServicesManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
