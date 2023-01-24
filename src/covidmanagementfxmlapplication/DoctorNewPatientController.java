
package covidmanagementfxmlapplication;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class DoctorNewPatientController implements Initializable {

    @FXML
    private TextField contactNumber;
    @FXML
    private TextField diseaseName;
    @FXML
    private Label name;
    @FXML
    private Button returnBack;
    @FXML
    private Button confirm;
    @FXML
    private TextArea textArea;

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
    private void contactNumberOnAction(ActionEvent event) {
    }

    @FXML
    private void diseaseNameOnAction(ActionEvent event) {
    }

    @FXML
    private void nameOnAction(MouseEvent event) {
    }

    @FXML
    private void returnBackOnAction(ActionEvent event) {
        try {
            Parent backscene = FXMLLoader.load(getClass().getResource("Doctor.fxml"));
            Scene sceneback = new Scene(backscene);
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(sceneback);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void SendonAction(ActionEvent event) {
        textArea.setText("Entered!");
    }

    @FXML
    private void confirmOnAction(ActionEvent event) {
        NewPatient newPatient= new NewPatient(
                name.getText(),
                diseaseName.getText(),
                Integer.parseInt(contactNumber.getText())
        );
        
        
       try {
            ObjectOutputStream nc = new ObjectOutputStream(new FileOutputStream("NewPatient.bin"));
            nc.writeObject(newPatient);
            nc.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
        
        name.setText(null);
        contactNumber.setText(null);
        diseaseName.setText(null);
    }
    
}
