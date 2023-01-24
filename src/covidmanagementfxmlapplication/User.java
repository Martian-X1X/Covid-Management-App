/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidmanagementfxmlapplication;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class User implements Serializable{
    protected String gmail;
    protected String password;

    public User(String gmail, String password) {
        this.gmail = gmail;
        this.password = password;
    }

    public String getGmail() {
        return gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
} 
