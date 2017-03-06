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
public class Main {
    public static void main(String[] args) {
        Date date=new Date();
        Patient p1=new Patient(0, "samuel", "njoroge", 24, "male", date);
    
        p1.info();
    }
    
}
