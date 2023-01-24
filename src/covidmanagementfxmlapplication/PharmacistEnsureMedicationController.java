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
public class PharmacistEnsureMedicationController implements Initializable {

    @FXML
    private TableView<Medication> table;
    @FXML
    private TableColumn<Medication, String> name;
    @FXML
    private TableColumn<Medication, String> symptom;
    @FXML
    private TableColumn<Medication, String> prescription;
    @FXML
    private Button Return;
    @FXML
    private Button CheckPrescription;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Medication>items=FXCollections.observableArrayList();
        items.add(new Medication("Abdullah Matin", "Headache, Runny Nose", "Napa"));
        items.add(new Medication("Syed Ali", "Sore Throat, Cough", "Cough Syrup"));
        items.add(new Medication("Silvi Rahman", "No taste, Stomachache", "Vaporizer"));
        table.setItems(items);
        symptom.setCellValueFactory(new PropertyValueFactory<Medication,String>("symptom"));
        name.setCellValueFactory(new PropertyValueFactory<Medication,String>("name"));
        prescription.setCellValueFactory(new PropertyValueFactory<Medication, String>("prescription"));
    }  
    
    @FXML
    private void ReturnOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("Pharmacist.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(EmergencyServicesManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     @FXML
    private void CheckPrescriptionAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("PharmacistCheckPrescription.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(EmergencyServicesManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
