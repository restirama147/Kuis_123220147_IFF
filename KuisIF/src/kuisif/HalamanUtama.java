/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisif;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab Informatika
 */
public class HalamanUtama extends JFrame implements ActionListener{
    JLabel header = new JLabel();
    JLabel subheader = new JLabel("Silahkan Pilih Menu untuk Membeli");
    JButton anak = new JButton ("Majalah Anak");
    JButton remaja = new JButton ("Majalah Remaja");
    JButton dewasa = new JButton ("Majalah Dewasa");
    
    HalamanUtama(String nama){
        String panggilan = nama;
        setVisible(true);
        setSize(580, 480);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(header);
        header.setText("Selamat Datang, "+panggilan);
        header.setBounds(20,20,200,40);
        
        add(anak);
        anak.setBounds(60,70,200,30);
        anak.addActionListener(this);
        
        add(remaja);
        remaja.setBounds(60,110,200,30);
        remaja.addActionListener(this);
        
        add(dewasa);
        dewasa.setBounds(60,150,200,30);
        dewasa.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==anak){
                AnakFrame frameank = new AnakFrame();
            }else if(e.getSource()==remaja){
                RemajaFrame framermj = new RemajaFrame();
            }else if(e.getSource()==dewasa){
                   DewasaFrame framedws = new DewasaFrame();
            }else{
             JOptionPane.showMessageDialog(this, "Pilih kategori");
                 }
        }catch(Exception ec){
            ec.printStackTrace();
        }
    }
    
}
