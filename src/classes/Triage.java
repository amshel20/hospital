/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author amshel
 */
public class Triage {
    private int temperature;
    private int weight;
    private int bp;
    private String allergies;
    private String history;
    
    /*So the triage is abit different because inorder to create an instance of
    triage, a patient should already be existing. So we assign a patient to 
    triage using a reference variable*/
    
    //reference variable
    private Patient patient;
    
    /*constructor is called everyting we instatiate the triage. For this i found
    it convinient to only include temperature weight and blood pressure. Izo 
    zingine(allergies, history) not so much used but we'll create an accessor
    method for them*/ 
    
    public Triage(int myTemperature, int myWeight, int myBp)
    {
        this.temperature=myTemperature;
        this.weight=myWeight;
        this.bp=myBp;
    }
    /*assign trriage to current patient. Atakama hutaelewa dont worry 
    ntakuelezea*/
    public void assignTriage(Patient aPatient)
    {
        setPatient(aPatient);
        patient.setTriage(this);
    }
    //getters
    public int getTemperature(){return temperature;}
    public int getWeight(){return weight;}
    public int getBp(){return bp;}
    public String getAllergies(){return allergies;}
    public String getHistory(){return history;}
    
    //SETTER
    
    public void setPatient(Patient aPatient)
    {
        patient=aPatient;
    }
}
