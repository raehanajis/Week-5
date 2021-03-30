/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tabung t1 = new Tabung(); 
        
        //Nilai Default
        System.out.println("Nilai default");
        System.out.println("Nilai radius di Nilai default: "+ t1.radius);
        System.out.println("Nilai Tinggi di Nilai default: "+ t1.tinggi);
        System.out.println("Nilai Luas Alas Tabung: "+ t1.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ t1.getVolume());
        
        //Nilai Bebas
        System.out.println("\n\n Nilai Bebas input ");
        System.out.print("Masukkan Nilai Radius : ");
        double rad = input.nextDouble();
        System.out.print("Masukkan Nilai Tinggi : ");
        double tin = input.nextDouble();
        
        
        Tabung t2 = new Tabung();
        t2.radius = rad;
        t2.tinggi = tin;

        System.out.println("Nilai radius di Nilai input : "+ rad);
        System.out.println("Nilai Tinggi di Nilai input : "+ tin);
        System.out.println("Nilai Luas Alas Tabung: "+ t2.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ t2.getVolume());
        
        
    }
    
}
