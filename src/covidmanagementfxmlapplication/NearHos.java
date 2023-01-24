/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidmanagementfxmlapplication;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableColumn;

/**
 *
 * @author Syed Sowad Ephraim
 */
public class NearHos {
    
    private SimpleStringProperty name;

    public NearHos(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }
    
    
}
