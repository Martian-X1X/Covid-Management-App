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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Syed Sowad Ephraim
 */
public class HeadofLogisticEquipOrderController implements Initializable {

    @FXML
    private TableView<Equipment> table;
    @FXML
    private TableColumn<Equipment, String> name;
    @FXML
    private TableColumn<Equipment, String> quantity;
    @FXML
    private TextArea textArea;
    @FXML
    private Button Return;
    @FXML
    private Button Order;
    @FXML
    private ComboBox requestBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Equipment>items=FXCollections.observableArrayList();
        items.add(new Equipment("Bed", "10"));
        items.add(new Equipment("Oxygen Tank", "18"));
        items.add(new Equipment("Monitors", "32"));
        table.setItems(items);
        name.setCellValueFactory(new PropertyValueFactory<Equipment,String>("name"));
        quantity.setCellValueFactory(new PropertyValueFactory<Equipment, String>("quantity"));
        requestBox.getItems().addAll("Bangladesh Supplier","China Gogo","Ask Government for supplies");
    }       
    
    @FXML
    private void ReturnOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("HeadofLogisticEquipment.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(EmergencyServicesManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void OrderonClick(ActionEvent event) {
        textArea.setText("Sent!");
    }
}
