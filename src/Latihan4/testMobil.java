/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author HP
 */
public class testMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil mobil = new Mobil(5);
        
        mobil.getPenumpang(17);
        mobil.getPenumpang(24);
        mobil.cetak();
        
        //penambahan
        mobil.addPenumpang(2);
        mobil.cetak();
        
        //penambahan
        mobil.addPenumpang(1);
        mobil.cetak();
        
        //penambahan
        mobil.addPenumpang(2);
        mobil.cetak();
        
        //penambahan
        mobil.addPenumpang(2);
        mobil.cetak();
        
    }
    
}
