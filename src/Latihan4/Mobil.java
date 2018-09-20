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
public class Mobil {

    private int penumpang;
    private int maxPenumpang;

    public Mobil(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    //method mutator
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getPenumpang(int password) {
        if (password == 24) {
            System.out.println("Password benar");
        } else {
            System.out.println("Password salah");
        }
    }

    public void cetak() {
        System.out.println("Penumpang mobil sekarang = " + penumpang);
        System.out.println("Penumpang maksimal seharusnya = " + maxPenumpang);
    }

}
