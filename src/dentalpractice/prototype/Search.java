/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentalpractice.prototype;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author wake5
 */
public class Search {
    
    
    public int linearSearch(ArrayList<String> array,String searchVal){
        int i = 0;
                for(String value : array){
                    if(value.equals(searchVal)){
                        return i;
                    }
                    i++;
                }
                return - 1; 
    } 

public static String[][] binarySearch(String filename, String searchVal){
    FileToArray arrays = new FileToArray();
    
    String[] oneDArray = arrays.fileToOneD(filename);
    String [][] twoDArray = arrays.oneDToTwoD(oneDArray);   
    
    Sort sort = new Sort();
    sort.bubbleSort(filename,twoDArray);
   
   
    boolean found = false;
    int first = 0;
    int last = twoDArray.length - 1;
    int i = 0;
    
    while(first<=last && (found == false)){
        int mid = first + (last-first); 
      if(Integer.parseInt(twoDArray[mid][0]) > Integer.parseInt(searchVal)){
          last = mid;
      }else if ( Integer.parseInt(twoDArray[mid][0]) < Integer.parseInt(searchVal)){
        first = mid;
        
      }else if (Integer.parseInt(twoDArray[mid][0]) == Integer.parseInt(searchVal)){
       found = true;
        }
      
    }
    if(found == true){
          return twoDArray;
      }  
      else if(found == false){
          JOptionPane.showMessageDialog(null, "not found");
      }
      
      
    
    return twoDArray;
      
      
      
    }
    
    



}