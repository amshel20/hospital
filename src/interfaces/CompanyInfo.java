/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author amshel
 */

/* Ill explain more on the interfaces later. for now we wont use them*/
public interface CompanyInfo {
    //attributes associated with the company
    public static final String COMPANY_NAME="";
    public static final String COMPANY_ADDRESS="";
    public static final String COMPANY_PHONE_NUMBER="";
    
    //Abstract method to be overriden
    public abstract String info();
    
}
