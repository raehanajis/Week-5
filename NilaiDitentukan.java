/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author ASUS
 */
public class NilaiDitentukan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabung nilai = new Tabung();
        double r = nilai.radius = 5;
        double t = nilai.tinggi = 10;

        System.out.println("== Nilai Radius 5 & Tinggi 10 ==");
        System.out.println("Nilai radius di Nilai default: "+ r );
        System.out.println("Nilai Tinggi di Nilai default: "+ t );
        System.out.println("Nilai Luas Alas Tabung: "+ nilai.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ nilai.getVolume());
        
        Tabung nilai2 = new Tabung();
        double r2 = nilai2.radius = 7.5;
        double t2 = nilai2.tinggi = 15.5;

        System.out.println("\n\n== Nilai Radius 7.5 & Tinggi 15.5 ==");
        System.out.println("Nilai radius di Nilai default: "+ r2 );
        System.out.println("Nilai Tinggi di Nilai default: "+ t2 );
        System.out.println("Nilai Luas Alas Tabung: "+ nilai2.getLuasAlas());
        System.out.println("Nilai Volume Tabung: "+ nilai2.getVolume());
    }
    
}
