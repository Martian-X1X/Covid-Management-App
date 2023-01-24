
package covidmanagementfxmlapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FirstSceneController implements Initializable {

    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginButton;
    @FXML
    private ComboBox departmentComboBox;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        departmentComboBox.getItems().addAll("Head of Research Dept.","Doctor","Pharmacist","Client","Emergency Services Manager","Maintenance Officer","Customer Service Manager","Head of Logistic");
    }    

    @FXML
    private void emailonAction(ActionEvent event) {
         email.setText(null);
    }

    @FXML
    private void passwordonAction(ActionEvent event) {
        password.setText(null);
    }

    @FXML
    private void loginButtononAction(ActionEvent event) throws IOException {
         User people;
        people = new User(
                email.getText(),
                password.getText()
        );
        if(password.getText().equals("001")  && email.getText().equals("head@gmail.com") && departmentComboBox.getValue().equals( "Head of Research Dept.")){
            
          switchtoAdmin(event);
        }
        else if(password.getText().equals("002")  && email.getText().equals("doct@gmail.com") && departmentComboBox.getValue().equals( "Doctor")){
            
          switchtoDoctor(event);
        }
        else if(password.getText().equals("006")  && email.getText().equals("main@gmail.com") && departmentComboBox.getValue().equals( "Maintenance Officer")){
            
          switchtoMaintenanceOfficer(event);
        }
        else if(password.getText().equals("005")  && email.getText().equals("emer@gmail.com") && departmentComboBox.getValue().equals( "Emergency Services Manager")){
            
          switchtoEmergencyServicesManager(event);
        }
        else if(password.getText().equals("008")  && email.getText().equals("head@gmail.com") && departmentComboBox.getValue().equals( "Head of Logistic")){
            
          switchtoHeadofLogistic(event);
        }
        else if(password.getText().equals("007")  && email.getText().equals("cust@gmail.com") && departmentComboBox.getValue().equals( "Customer Service Manager")){
            
          switchtoCustomerServiceManager(event);
        }
        else if(password.getText().equals("003")  && email.getText().equals("phar@gmail.com") && departmentComboBox.getValue().equals( "Pharmacist")){
            
          switchtoPharmacist(event);
        }
        else if(password.getText().equals("004")  && email.getText().equals("clie@gmail.com") && departmentComboBox.getValue().equals( "Client")){
            
          switchtoClient(event);
        }
    }

    @FXML
    private void departmentComboBoxonAction(ActionEvent event) {
    }
    public void switchtoAdmin(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    public void switchtoDoctor(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Doctor.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    public void switchtoMaintenanceOfficer(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("MaintenanceOfficer.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    public void switchtoEmergencyServicesManager(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("EmergencyServicesManager.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    public void switchtoHeadofLogistic(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("HeadofLogistic.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    public void switchtoCustomerServiceManager(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("CustomerServiceManager.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    public void switchtoPharmacist(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Pharmacist.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    public void switchtoClient(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Client.fxml"));
        Scene scene2 = new Scene(scene2Parent);
           
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene2);
        window.show();
    }
    
    }
