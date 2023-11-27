/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author smartcomp store
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int angka = 3;
//        while (angka <= 3){
//            System.out.println("Ini angka " + angka);
//            angka++;
//        }
//        
//        for(int i =0; i <= angka; i++){
//            System.out.println("Ini angka" + angka);
//        }
//        
//        System.out.print("Masukkan nilai : ");
//        int nilai = input.nextInt();
//        
//        if(nilai >= 76){
//            System.out.println("Anda Lulus!");
//        }
//        else if(nilai >= 71){
//            System.out.println("Nilai anda B+");
//        }
//        else{
//            System.out.println("Nilai anda tidak memenuhi!");
//        }
//        
//    }
    
//    System.out.print("Masukkan nilai : ");
        
//        int nilai = input.nextInt();
        char huruf_mutu;
        
//        if(nilai >= 76){
//            huruf_mutu = 'A';
//        }
//        else if(nilai >= 71){
//            huruf_mutu = 'B';
//        }
//        else if(nilai >= 66){
//            huruf_mutu = 'C';
//        }
//        else{
//            huruf_mutu = 'D';
//        }
//        
//        switch(huruf_mutu){
//            case 'A':
//                System.out.println("Sangat Baik");
//                break;
//            case 'B':
//                System.out.println("Baik");
//                break;
//            case 'C':
//                System.out.println("Cukup");
//                break;
//            case 'D': 
//                System.out.println("Kurang");
//                break;
//            default:
//                System.out.println("Huruf Mutu tidak sesuai");
//                break;
//        }
//        
        System.out.print("Masukkan nilai : ");
        int _nilai = input.nextInt();
        
        if(_nilai > 100 || _nilai < 0){
            System.out.println("Input tidak sesuai");
        }
        if(_nilai >= 76){
            huruf_mutu = 'A';
        }
        else if(_nilai >= 71){
            huruf_mutu = 'B';
        }
        else if(_nilai >= 66){
            huruf_mutu = 'C';
        }
        else{
            huruf_mutu = 'D';
        }
        System.out.println(huruf_mutu);
    }
}
