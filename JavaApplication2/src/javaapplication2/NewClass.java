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
public class NewClass {
    public static void main(String[] args){



        Scanner input = new Scanner(System.in);
        String npmYgBenar = "2257051008";
        String nilai_mutu = "";

        System.out.print("Masukkan NPM : ");
        do {
            String npmInput = input.nextLine();
            if (npmInput.equals(npmYgBenar)) {
                break;
            } else {
                System.out.print("Masukkan npm anda lagi : ");
                continue;
            }
        } while (true);

        while (true) {
            System.out.print("Masukkan nilai : ");
            int nilai = input.nextInt();

            if (nilai > 100 || nilai < 0) {
                System.out.println("Input tidak sesuai");
                break;
            }

            if ((nilai % 10) == 0) {
                continue;
            }

            if (nilai >= 76) {
                nilai_mutu = "A";
            } else if (nilai > 71) {
                nilai_mutu = "B+";
            } else if (nilai > 66) {
                nilai_mutu = "B";
            } else if (nilai > 61) {
                nilai_mutu = "C+";
            } else if (nilai > 56) {
                nilai_mutu = "C";
            } else if (nilai > 50) {
                nilai_mutu = "D";
            } else {
                nilai_mutu = "E";
            }

            break; // Keluar dari loop setelah mengatur nilai_mutu
        }

        switch (nilai_mutu) {
            case "A":
                System.out.println("Sempurna");
                break;
            case "B+":
                System.out.println("Sangat Baik");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C+":
                System.out.println("Cukup Baik");
                break;
            case "C":
                System.out.println("Cukup");
                break;
            case "D":
                System.out.println("Kurang");
                break;
            case "E":
                System.out.println("Gagal");
                break;
            default:
                System.out.println("Huruf Mutu tidak sesuai");
        }
    }
}

        
    