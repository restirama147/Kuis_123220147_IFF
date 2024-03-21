/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilihremaja;

/**
 *
 * @author Lab Informatika
 */
public class Remaja implements OperasiRemaja{
    private double jumlah;
    public Remaja (double jumlah){
     this.jumlah = jumlah;
     
}

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    
     @Override
    public double TotalHargaRemaja() {
        return 157200*jumlah;
    }
}