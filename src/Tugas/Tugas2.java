/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tugas2 {
    private double jariJari, Dia, lPermukaan, Volume;
    Scanner masuk = new Scanner(System.in);

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getDia() {
        this.Dia = jariJari*2;
        return Dia;
    }

    public double getlPermukaan() {
        this.lPermukaan = 4*Math.PI*jariJari*jariJari;
        return lPermukaan;
    }

    public double getVolume() {
        this.Volume = 4/3*Math.PI*jariJari*jariJari;
        return Volume;
    }
    
    
}
