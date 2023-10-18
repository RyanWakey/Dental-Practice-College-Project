/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentalpractice.prototype;

/**
 *
 * @author wake5
 */
public class EncryptionPassword {
    String  Encryption(String password){
        char array[] = password.toCharArray();
        
        for(int i = 0; i < array.length; i++){
        if(array[i] == 'a'){
                array[i] = 'c';
            }
        else if(array[i] == 'b'){
                array[i] = 'd';
            }
        else if(array[i] == 'c'){
                array[i] = 'e';
        }
    
        else if(array[i] == 'd'){
                array[i] = 'f';
        }
        else if(array[i] == 'e'){
                array[i] = 'h';
        }
         else if(array[i] == 's'){
                array[i] = 'u';
        }
         else if(array[i] == 'v'){
                array[i] = 'x';
        }
        else if(array[i] == 'w'){
                array[i] = 'y';
        }
         else if(array[i] == 'p'){
                array[i] = 'r';
         }  
         else if(array[i] == 'r'){
                array[i] = 't';
        }
        else if(array[i] == 'y'){
                array[i] = 'a';
        }
        else if(array[i] == 't'){
                array[i] = 'v';
        }
        }
        return new String(array);
       }
   String Decryption(String password){
    char array[] = password.toCharArray();
        
        for(int i = 0; i < array.length; i++){
        if(array[i] == 'c'){
                array[i] = 'a';
            }
        else if(array[i] == 'd'){
                array[i] = 'b';
            }
        else if(array[i] == 'e'){
                array[i] = 'c';
        }
    
        else if(array[i] == 'f'){
                array[i] = 'd';
        }
        else if(array[i] == 'h'){
                array[i] = 'e';
        }
         else if(array[i] == 'u'){
                array[i] = 's';
        }
         else if(array[i] == 'x'){
                array[i] = 'v';
        }
        else if(array[i] == 'y'){
                array[i] = 'w';
        }
         else if(array[i] == 'r'){
                array[i] = 'p';
        }
        
        
        else if(array[i] == 't'){
                array[i] = 'r';
        }
        else if(array[i] == 'a'){
                array[i] = 'y';
        }
        else if(array[i] == 'v'){
                array[i] = 't';
        }
        }
        return new String(array);
       }
} 






