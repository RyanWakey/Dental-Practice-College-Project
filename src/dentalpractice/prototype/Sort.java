 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentalpractice.prototype;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;



/**
 *
 * @author wake5
 */
public class Sort {
    
   public void bubbleSort(String filename,String twoDArray[][]){
       
       FileToArray arrays = new FileToArray();
        
            String[] oneDArray = arrays.fileToOneD(filename);
            twoDArray = arrays.oneDToTwoD(oneDArray);   
      
     
       for(int i = 0; i < twoDArray.length-1; i++){
           for (int j =0; j<twoDArray.length-1;j++){
                   if(Integer.parseInt(twoDArray[j][0]) > Integer.parseInt(twoDArray[j+1][0])){
                   
                   String[] temp = twoDArray[j];
                   twoDArray[j] = twoDArray[j+1];
                   twoDArray[j+1] = temp;
                   
               }
                   
               
           }     
       }
    
       try{
           
           
           FileWriter fw = new FileWriter(filename);
           BufferedWriter bw = new BufferedWriter(fw);
            
           for(int i = 0; i < twoDArray.length; i++){
               for(int j = 0; j < twoDArray[i].length-1; j++){
                   fw.write(twoDArray[i][j]+",");
               }
               fw.write(twoDArray[i][twoDArray[i].length-1]);
               fw.write("\n");
           }
          fw.close();
       }catch(Exception e){
           System.out.println("Error " + e);
           
       }
        
   }
   public void bubbleSortDescending(String filename,String twoDArray[][]){
       
       FileToArray arrays = new FileToArray();
        
            String[] oneDArray = arrays.fileToOneD(filename);
            twoDArray = arrays.oneDToTwoD(oneDArray);   
      
     
       for(int i = 0; i < twoDArray.length-1; i++){  // -1 as no point in comparing last record as for example if 5 are in order then the 6th one must be to.
           for (int j =0; j<twoDArray.length-1;j++){
                   if(Integer.parseInt(twoDArray[j][0]) < Integer.parseInt(twoDArray[j+1][0])){
                   
                   String[] temp = twoDArray[j];           //swapping of the elements if one is larger than the other.
                   twoDArray[j] = twoDArray[j+1];
                   twoDArray[j+1] = temp;
                   
               }
                   
               
           }     
       }
    
       try{
           
           
           FileWriter fw = new FileWriter(filename);
           BufferedWriter bw = new BufferedWriter(fw);
            
           for(int i = 0; i < twoDArray.length; i++){
               for(int j = 0; j < twoDArray[i   ].length-1; j++){     
                   fw.write(twoDArray[i][j]+",");
               }
               fw.write(twoDArray[i][twoDArray[i].length-1]);
               fw.write("\n");
           }
          fw.close();
       }catch(Exception e){
           System.out.println("Error " + e);
           
       }
        
   }
     
    
   
}