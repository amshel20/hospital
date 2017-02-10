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
   
    //default constructor. we're not passing any arguments as of yet
    public void patient(){
    
    };
    
    // Accessor methods mainly getters and setters
    //getters
    public int getId(){
        return id;
    }
    public String getFname(){
        return firstName;
    }
    public String getLname(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public Date getDate(){
        return DOB;
    }
    
    //setters
    public void setId(int anId ){
        this.id=anId;
    }
    public void setFname(String aFname ){
        this.firstName=aFname;
    }
    public void setLname(String aLname ){
        this.lastName=aLname;
    }
    public void setAge(int no ){
        this.age=no;
    }
    public void setSex(String gender ){
        this.sex=gender;
    }
    public void setDOB(Date myDob ){
        this.DOB=myDob;
    }
    
}
