/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentalpractice.prototype;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author wake5
 */
public class CalculateAge {
   public int CalcAge(String inputStr){
       
       int sL = inputStr.length();
       int fI = inputStr.indexOf("/"); // stores first index of this inputted string 
       int sI = inputStr.lastIndexOf("/"); // stores the last index of inputted string (last being the last index before the "/")
       
       String mm = inputStr.substring(0,fI);    // takes the string and puts it into portions after i define them 
       int month = Integer.parseInt(mm);                        //for example "poopy.substring (0,2) would be now "poo"
       String dd = inputStr.substring((fI+1),sI);
       int day = Integer.parseInt(dd);
       String yyyy = inputStr.substring((sI+1),sL);         
       int year = Integer.parseInt(yyyy);       // parsing year as integer as it should be an integer date

       
       LocalDate today = LocalDate.now();
       
       LocalDate dob = LocalDate.of(year,month,day);
       int Age = Period.between(dob, today).getYears();   // compares 
       
       
       
       return Age; 
   } 
}
