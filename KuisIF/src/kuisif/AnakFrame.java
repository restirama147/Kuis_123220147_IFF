/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisif;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import pilihAnak.Anak;

/**
 *
 * @author Lab Informatika
 */
class AnakFrame extends JFrame implements ActionListener {
    JLabel judul = new JLabel("Halaman Pembelian");
    JLabel kategori = new JLabel("Kategori");
    JLabel anak = new JLabel("Majalah Anak");
    JLabel lblharga = new JLabel("Harga");
    JLabel jml = new JLabel("Jumlah");
    JLabel harga = new JLabel("Rp 12.700");
    JTextField jumlah = new JTextField(40);
    JButton kembali = new JButton("Kembali");
    JButton beli = new JButton("Beli");
    JLabel total = new JLabel("Total Pembelian");
    JLabel hargaSatuan = new JLabel("Harga Satuan");
    JLabel ketharga = new JLabel(" Rp 12.700");
    JLabel lblJumlah = new JLabel("Jumlah");
    JLabel ketjumlah = new JLabel();
    JLabel hasil = new JLabel("hasil");
    AnakFrame(){
        setVisible(true);
        setSize(580, 480);
        setTitle("Halaman Pembelian");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(judul);
        judul.setBounds(20,20,200,40);
        
        add(kategori);
        kategori.setBounds(20,70,200,40);
        
        add(anak);
        anak.setBounds(220, 70, 200, 40);
        
        add(lblharga);
        lblharga.setBounds(20, 110, 200, 40);
        
        add(harga);
        harga.setBounds(220, 110, 200, 40);
        
        add(jml);
        jml.setBounds(20, 150, 200, 40);
        
        add(jumlah);
        jumlah.setBounds(220, 150, 200, 40);
        
        add(kembali);
        kembali.setBounds(20, 190, 100, 40);
        
        add(beli);
        beli.setBounds(140, 190, 100, 40);
        
        add(total);
        total.setBounds(20, 230, 100, 40);
        
        add(hargaSatuan);
        hargaSatuan.setBounds(20, 270, 100, 40);
        
        add(ketharga);
        ketharga.setBounds(140, 270, 100, 40);
        
        add(ketjumlah);
        ketjumlah.setBounds(140, 310, 100, 40);
        
        add(lblJumlah);
        lblJumlah.setBounds(20, 310, 100, 40);
        
        add(hasil);
        hasil.setBounds(20, 350, 100, 40);
        
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== beli){
        try{
            double jumlahBeli = Double.parseDouble(jumlah.getText());
            Anak beliAnak = new Anak(jumlah);
            String hasil = String.valueOf(beliAnak.TotalHargaAnak());
        }catch(Exception ec){
            JOptionPane.showMessageDialog(this, ec.getMessage());
        }
        }
    }
}
