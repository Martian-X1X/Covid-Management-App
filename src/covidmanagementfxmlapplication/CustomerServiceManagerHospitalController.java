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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Syed Sowad Ephraim
 */
public class CustomerServiceManagerHospitalController implements Initializable {

    @FXML
    private TableView<NearHos> table;
    @FXML
    private TableColumn<NearHos, String> name;
    @FXML
    private Button Return;
    public TextField textfieldname;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        table.setItems(observableList);
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
    }   
    
    ObservableList<NearHos> observableList=FXCollections.observableArrayList(
           new NearHos("Central Hospital")
           
    );
    
    public void buttonAdd(ActionEvent actionEvent){
        NearHos nearhos = new NearHos(textfieldname.getText());
        table.getItems().add(nearhos);
    };
    
    @FXML
    private void ReturnOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("CustomerServiceManager.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(EmergencyServicesManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
