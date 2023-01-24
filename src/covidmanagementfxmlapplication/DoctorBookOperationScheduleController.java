
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class DoctorBookOperationScheduleController implements Initializable {

    @FXML
    private DatePicker enterDate;
    @FXML
    private TextField enterTime;
    @FXML
    private Button confirm;
    @FXML
    private Button returnBack;
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
    private void enterDateOnAction(ActionEvent event) {
    }

    @FXML
    private void enterTimeOnAction(ActionEvent event) {
    }

    @FXML
    private void confirmOnAction(ActionEvent event) {
        enterTime.setText(null);
        enterDate.setValue(null);
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
        textArea.setText("Booked!");
    }
    
}
