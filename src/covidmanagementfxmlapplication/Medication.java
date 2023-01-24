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
public class Medication {
    
    private String name;
    
    public String getName()
    {
        return name;
    }
    
    public void SetName(String name)
    {
        this.name = name;
    }
    
    private String symptom;
    
    
    public String getSymptom()
    {
        return symptom;
    }
    
    public void setSymptom(String symptom)
    {
        this.symptom = symptom;
    }
    
    private String prescription;
    
    public String getPrescription()
    {
        return prescription;
    }
    
    public void setPrescription(String prescription)
    {
        this.prescription = prescription;
    }
    
    public Medication(String name, String symptom, String prescription)
    {
        this.name = name;
        this.symptom = symptom;
        this.prescription = prescription;
    }
}
