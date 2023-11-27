/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author smartcomp store
 */
public class mai {
    public static void main(String[] args){
        boolean isValidNPM = false;
        
        if(npm.matches("\\d{10}")){
         isValidNPM = true;   
        }
        else {
            System.out.println(" Masukkan NPM Anda lagi ");   
        }
       while(!isValidNPM){
           System.out.println("Masukkan npm anda : ");
           npm =num.nextLine();
           
           if(npm.matches("\\d{10}")){
               isValidNPM =true;
        }
           else{
               System.out.println("Masukkan NPM Anda lagi");       
           }
       }
    
}
}
