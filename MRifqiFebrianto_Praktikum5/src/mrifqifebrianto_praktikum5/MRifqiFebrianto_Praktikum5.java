/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrifqifebrianto_praktikum5;
import java.util.Scanner;
/**
 *
 * @author smartcomp store
 */
public class MRifqiFebrianto_Praktikum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner input = new Scanner(System.in);
//        int[] number = {1, 3, 5, 7, 9};
//        
//        for(int i = 0; i < number.length; i++){
//            System.out.println(number[i]);
//        }
//        System.out.println("Cara Lain : ");
//        for(int i : number){
//            System.out.println(i);
//        }
//        
//        
//        
//        int[] nilai = new int[3];
//        System.out.print("Nilai MTK ; ");
//        nilai[0] = input.nextInt();
//        System.out.print("Nilai Logika : ");
//        nilai[1] = input.nextInt();
//        System.out.print("Nilai Bahasa: ");
//        nilai[2] = input.nextInt();
//        
//        for(int i : nilai){
//            System.out.println(i);
//        }
//        
        int[][] nilaiMulti = {
            {90, 75, 80},
            {80, 90, 80},
            {70, 75, 95}};
                       
        for(int[] i : nilaiMulti){
            for(int j : i){
                System.out.println(j);
            }
        }
    
    }
    
}
