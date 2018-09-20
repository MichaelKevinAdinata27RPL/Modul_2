/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author HP
 */
public class ujiBus {

    public static void main(String[] args) {
        //membuat objek dari kelas bus
        Bus busKecil = new Bus();
        
        //memasukkan nilai
        busKecil.penumpang = 5;
        busKecil.maxPenumpang = 15;
        
        //memanggil method cetak
        busKecil.cetak();
        
        //menambah penumpang
        busKecil.penumpang = busKecil.penumpang + 5;
        
        //memanggil method cetak
        busKecil.cetak();
        
        //mengurangi penumpang
        busKecil.penumpang = busKecil.penumpang - 2;
        
        //memanggil method cetak
        busKecil.cetak();
        
        //menambah penumpang bus
        busKecil.penumpang = busKecil.penumpang + 8;
        
        //memanggil method cetak
        busKecil.cetak();

    }

}
