/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidmanagementfxmlapplication;

import javafx.scene.control.TableColumn;

/**
 *
 * @author Syed Sowad Ephraim
 */
public class UserHos {
    
     private String name;

    UserHos(TableColumn<NearHos, String> name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName()
    {
        return name;
    }
    
    public void SetName(String name)
    {
        this.name = name;
    }
    
    private String email;
    
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    private String location;
    
    public String getLocation()
    {
        return location;
    }
    
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    public UserHos(String name, String email, String location)
    {
        this.name = name;
        this.email = email;
        this.location = location;
    }
    
}
