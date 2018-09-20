/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HP
 */
public class Tugas2Uji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tugas2 bola = new Tugas2();
        
        System.out.println("Michael Kevin Adinata / XR6 / 30");
        System.out.println("");
        System.out.print("Masukkan jari-jari bola : ");
        double jari = bola.masuk.nextDouble();
        bola.setJariJari(jari);
        System.out.println("");
        System.out.println("Jari-Jari      : " + bola.getJariJari());
        System.out.println("Diameter       : " + bola.getDia());
        System.out.println("Luas permukaan : " + Math.ceil(bola.getlPermukaan()));
        System.out.println("Volume         : " + Math.ceil(bola.getVolume()));
        
    }
    
}
