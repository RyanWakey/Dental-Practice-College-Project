/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentalpractice.prototype;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author wake5
 */
public class FileToArray {

    /**This code allows me to convert a text file into a 1d array 
     *converts the text file in line by line
     * @param filename the text file that i will be converting into the 1D array.
     * @return fileArray the array which will contain the text file details line by line.
     */
    public String[] fileToOneD(String filename){
        Boolean endOfFile = false; //Checks if there is anything left in the file
        String currentLine; //Stores the current line as a string
        String TextFile = "";   //Stroing the text file e.g. patients.txt
        String[] fileArray; //the file stored as an array
        

        try (FileReader fr = new FileReader(filename)) { // creating FileReader to read the textfile 
            
            BufferedReader br = new BufferedReader(fr); //Bufferedreader and Bufferedwriter classes reduce bureaucracy and 
            //promote efficiency when writing to a file in java by plummeting the number of physical reads and writing directly to the disk.
            //thats why i used buffered reader
            while((currentLine = br.readLine()) != null){
                TextFile = TextFile + currentLine + "\n";
                endOfFile = true;  // checking if were at the end of the file
            }

            if(endOfFile == true){
                                                     //if it is at end of file
                fileArray = TextFile.split("\n");   //it stores the text file into the array
            }else{
                fileArray = "problem with reading records".split(",");   //will terminate program 
            }

        } catch (Exception e) {
            //catch any error that could occur, logic error or calling it wrong.
            System.out.println("error with file to 1d array" + e);// information about the type of error that oocured.
            fileArray = "error,fileReader".split(",");  //wille getminate program        
        }

        return fileArray;   //text file is returned as 1darray.
    }
    
    /**
     *
     * @param oneDArray the 1d array that i will be converting into a 2D array
     * @return twoDArray  String array that contains the text file in a 2D format
     */
    public  String[][] oneDToTwoD(String[] oneDArray){

        Integer oneDlength = oneDArray.length;          //gets the length of the array(e.g. text file)
        String[] record = oneDArray[0].split(",");  //stores first record (which will be id)
        String[][] twoDArray = new String[oneDlength][record.length]; // The 2D array that i will be returning
       
         try{
            for(int i=0;i<oneDlength;i++){//looping through inputted array 
                record = oneDArray[i].split(",");//the record is split up into a new array 
            
            for(int j=0;j<record.length;j++){ // now looping through new array
                
                twoDArray[i][j] = record[j];    //saves the new values in the 2D array.
            }
            
         } 
            if(twoDArray[0][0].equals("")){ //checking if there are  any errors when converting from 1dto2d
            twoDArray[0][0] = "1DTO2D ERROR";  //by checking if the arrays are empty = must be if there empty as there should always be data  
            }                                  //will crash program if there is a line missing in text file (when sorting)
            }catch(Exception e){ // catch any errors when converting to 2d
            System.out.println("oneDtoTwoD error" + e);
        
            }     
        return twoDArray; //return the new 2d array (text file most likely).
        
        
}
}   
