/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author amshel
 */
public class Patient {
    
    /*attributes for the particulars of the customer/patient. all attributes should be
      private and the only way to access them is using an accessor method which is below. which is 
    a standard practice in programming
    */ 
    
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private Date DOB;
    
    /*reference variable to associate patient with a triage. Read below for more 
    documentation on reference variables*/
    private Triage triage;
   
    //default constructor. Every time a patient is created all six fields are required 
    public Patient(int anID, String aFirstName, String aLastName, int myAge, String mySex, Date myDob ){
    
        this.id=anID;
        this.firstName=aFirstName;
        this.lastName=aLastName;
        this.sex=mySex;
        this.age=myAge;
        this.DOB=myDob;
    };
    
    // Accessor methods mainly getters and setters
    //getters
    public int getId(){return id;}
    public String getFname(){return firstName;}
    public String getLname(){return lastName;}
    public int getAge(){return age;}
    public String getSex(){return sex;}
    public Date getDate(){return DOB;}
    
    //Returns details of the client
    public String info()
    {
        String info;
        info= "Patient Name" +getFname() +getLname()+
                "Patient age" +getAge()+
                "Patient Sex" +getSex()+
                "Patient Date Of Birth" +getDate();
        return info;
    }
    
    //Setter for the triage class
        public void setTriage(Triage aTriage)
        {
            triage=aTriage;
        }
}
/*              REFERENCE VARIABLE
*        An Object is an instance of a Class, it is stored some where in memory
*        A reference is what is used to describe the pointer to the memory location where the Object resides.
*        A variable is a means by which you can access that memory location within your application

*        So a reference variable is used to locate memory of an object, it may me a class
*/
