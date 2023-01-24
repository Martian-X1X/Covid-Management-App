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
public class ClientSampleBoothLocationsController implements Initializable {

    @FXML
    private TableView<Location> table;
    @FXML
    private TableColumn<Location, String> name;
    @FXML
    private TableColumn<Location, String> address;
    @FXML
    private Button Return;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Location>items=FXCollections.observableArrayList();
        items.add(new Location("Anwer Khan Modern", "House 17, Road 8, Dhanmondi"));
        items.add(new Location("Central Hospital", "House 2, Road 5, Green Road"));
        items.add(new Location("Square Hospital", "18 Bir Uttam Sarak, Panthapath"));
        table.setItems(items);
        address.setCellValueFactory(new PropertyValueFactory<Location,String>("address"));
        name.setCellValueFactory(new PropertyValueFactory<Location,String>("name"));
    }

    @FXML
    private void ReturnOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("Client.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(EmergencyServicesManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
