/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidmanagementfxmlapplication;

/**
 *
 * @author Syed Sowad Ephraim
 */
public class Location {
    
    private String name;
    
    public String getName()
    {
        return name;
    }
    
    public void SetName(String name)
    {
        this.name = name;
    }
    
    private String address;
    
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public Location(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
}
