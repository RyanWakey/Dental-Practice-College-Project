package dentalpractice.prototype;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wakey
 */
public class Validation {

    
    public boolean isPresent(String inputStr){ 
        
        boolean valid = true;       //validation to check if there is even an input
        if(inputStr.equals("")){   //checks if the field is empty , if it is then valid is made not true
            valid = false;
    }
        return valid; // returning if its valid or not
    }
    
    public boolean isInt(String inputStr){
        
        boolean valid = true; // validation to check if the input is only an integer 
        try {
            Integer.parseInt(inputStr); //if the input is an integer than valid is made true 
            valid = true;
        }catch(NumberFormatException e){
            valid = false;
        }
        return valid; //outputs valid, true if its a whole number
        
    }
    
    public boolean isDate(String inputStr){ /// Takes a String as input 

        
        boolean valid = true;
        
        if(inputStr.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")){ //a format check for date by checking if input mathes date format
            valid = true;                                          //must be entered with format mm/dd/yyyy
        }  
        else{
            valid = false;
        }
        return valid; //outputs a Boolean, true if correct 
    }
    
    public boolean isRange(int input){
        
        boolean valid = true;
        if(input >= 0&& input <= 10000){
            valid = true;
        }
        else{
            valid = false;
        }
        return valid;
    } 
    public boolean isLookUp(String inputStr){
        boolean valid = false;
        String title [] = {"Sir","Mrs","Mr","Ms"};
        
        for(int i = 0; i < title.length; i++)
        {
            if(inputStr.equals(title[i])){
                valid = true;
            }
        }
        return valid;
        
    }
    public boolean isLength(String inputStr){
        boolean valid = true; 
        if (inputStr.length() == 11){  //11 is the standard length for a telephone number
            valid = true;               // if the length is 11 characters long then is a telephone number
        }else{
            valid = false;
        }
        return valid;
        
    }   

    public boolean isPasswordLength(String inputStr){
        boolean valid = true; 
        if (inputStr.length() >= 8){
            valid = true;
        }else{
            valid = false;
        }
        return valid;
        
    }  
   public boolean RealDate(String inputStr){
       boolean valid = true;
       int selectedOption = 0;
       int sL = inputStr.length();
       int fI = inputStr.indexOf("/"); // stores first index of this inputted string 
       int sI = inputStr.lastIndexOf("/"); // stores the last index of inputted string (last being the last index before the "/")
                                           // which is essentially the second index in this case.
       String mm = inputStr.substring(0,fI);    // takes the string and puts it into portions after i define them 
       int month = Integer.parseInt(mm);                        //for example "poopy.substring (0,2) would be now "poo"
       String dd = inputStr.substring((fI+1),sI);
       int day = Integer.parseInt(dd);
       String yyyy = inputStr.substring((sI+1),sL);         
       int year = Integer.parseInt(yyyy);       // parsing year as integer as it should be an integer date

    
    if(!inputStr.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")){ //a format check for date by checking if input mathes date format
            selectedOption = 2; // mm/dd/yyyy must be achieved else it will call an already defined error message  
        } 
    if (month > 12){        // if the month the enter is above 12 then not a real month and therefore define  error message
             selectedOption = 2;
    }
    if (inputStr.length() > 10 || inputStr.length() < 10 ){ // if date dosent = 10 characters then invalid length.
       selectedOption = 1; // already defined error message if this if statement is met.
    }
    switch (month) // switch case to alternate between the different months and the different days within those months.
    
        {  
            case 1:            // january march may july august october december
            case 3:            // all these cases represent the months that have 31 days
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            if (day > 31)                // if day is more than 31 in these months then cant be a real date
                 selectedOption = 3;   
            
           break;      

            case 4:                //april,june,september,novermber 
            case 6:                //these cases represent the months that have 30 days
            case 9:
            case 11:
                if (day > 30)
                  selectedOption = 3; 
               
           break;     
                
            case 2:        // only one case left which represents febuary  
                if (year % 4 == 0)           // leap year where febuary will have an extra day , every 4 years this occurs.
                    if (day > 29)
                    selectedOption = 3;
                    
                    
                       
                    if (day > 28)                  //febuary only month to have only 28 days unless leap year
                    selectedOption = 3;
                    
                    
                  
         
       break;
       
       }
       
        
       switch(selectedOption){
        case 1:
            JOptionPane.showMessageDialog(null, inputStr+ " inncorect lenght of date ");
            valid = false;
            break;
        case 2:
            JOptionPane.showMessageDialog(null, inputStr+ " inncorrect format, please enter date as mm/dd/yyyy");
            valid = false;
            break;
        case 3:
            JOptionPane.showMessageDialog(null, inputStr+ " invalid date(not a real date) ");
            valid = false;
            break;
    
    }
      return valid;    //return the the inputted date is valid after the operations above.
    
  }
   
}