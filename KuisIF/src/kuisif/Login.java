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

/**
 *
 * @author Lab Informatika
 */
public class Login extends JFrame implements ActionListener {
    JLabel judul = new JLabel ("Selamat Datang !!");
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JTextField inputusn = new JTextField (40);
    JTextField inputpw = new JTextField (40);
    JButton login = new JButton ("Login");
    
     Login(){
        setVisible(true);
        setSize(580, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        add(judul);
        judul.setBounds(20,20,200,40);
        
        add(username);
        username.setBounds(20,70,100,30);
        
        add(inputusn);
        inputusn.setBounds(130,70,200,30);
        
        add(password);
        password.setBounds(20,110,100,30);
        
        add(inputpw);
        inputpw.setBounds(130,110,200,30);
        
        add(login);
        login.setBounds(20,150,200,30);
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String nama = inputusn.getText();
            String pw = inputpw.getText();
            if (nama.isEmpty() && pw.isEmpty()){
                throw new Exception("Masukkan Username dan password");
            }else if (nama.isEmpty()){
                throw new Exception("Masukkan Username");
            }else if (pw.isEmpty()){
                throw new Exception("Masukkan Password");
            }
            new HalamanUtama(nama);
            this.dispose();
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
}
    

