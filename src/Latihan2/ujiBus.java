/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

import Latihan1.*;

/**
 *
 * @author HP
 */
public class ujiBus {

    public static void main(String[] args) {
        //membuat objek
        Bus busMini = new Bus(40);
        busMini.cetak();
        
        //penambahan penumpang
        busMini.addPenumpang(15);
        busMini.cetak();
        
        //penambahan penumpang
        busMini.addPenumpang(5);
        busMini.cetak();
        
        //penambahan penumpang
        busMini.addPenumpang(26);
        busMini.cetak();
    }

}
