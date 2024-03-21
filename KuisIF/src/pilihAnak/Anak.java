/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilihAnak;

import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class Anak implements OperasiAnak{
    private double jumlah;
    public Anak (double jumlah){
     this.jumlah = jumlah;
     
    }

    public Anak(JTextField jumlah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    public double getJumlah (){
        return jumlah;
    }
    @Override
    public double TotalHargaAnak() {
        return 12700*jumlah;
    }
}
