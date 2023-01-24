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
public class Equipment 
{
    
    private String name;
    
    public String getName()
    {
        return name;
    }
    
    public void SetName(String name)
    {
        this.name = name;
    }
    
    private String quantity;
    
    
    public String getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(String quantity)
    {
        this.quantity = quantity;
    }
    
    public Equipment(String name, String quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }
    
}

