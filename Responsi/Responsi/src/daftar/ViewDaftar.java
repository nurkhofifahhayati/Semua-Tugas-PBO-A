/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftar;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Aya
 */
public class ViewDaftar extends JFrame {
    
    JLabel jltitle = new JLabel("DAFTAR");
    JLabel jluser = new JLabel("Username : ");
    JTextField jtuser = new JTextField();
    JLabel jlpass = new JLabel("Password : ");
    JPasswordField jtpass =  new JPasswordField();
    
    JButton btnDaftar = new JButton("Daftar");
    JButton btnBatal = new JButton("Batal");
    JButton btnExit = new JButton("Exit");
    
    public ViewDaftar()
    {
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(620,540);
        setLocationRelativeTo(null);
        
        //TITLE =================================================================
        add(jltitle);
        jltitle.setBounds(280, 70, 90, 20);
        
        //USER =================================================================
        add(jluser);
        jluser.setBounds(190, 160, 90, 20);
        add(jtuser);
        jtuser.setBounds(260, 160, 150, 20);
        
        //PASS =================================================================
        add(jlpass);
        jlpass.setBounds(190, 210, 90, 20);
        add(jtpass);
        jtpass.setBounds(260, 210, 150, 20);
        
        // BUTTON ==============================================================
        add(btnDaftar);
        btnDaftar.setBounds(210, 300, 90, 20);
        add(btnBatal);
        btnBatal.setBounds(320, 300, 90, 20);
        add(btnExit);
        btnExit.setBounds(480, 20, 90, 20);
    }
    
    public String getUser() {
        return jtuser.getText();
    }

    public String getPass() {
        return jtpass.getText();
    }
}
