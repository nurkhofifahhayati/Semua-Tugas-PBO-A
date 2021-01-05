/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;
import javax.swing.*;
/**
 *
 * @author Aya
 */
public class ViewHome extends JFrame {
    
    JLabel jltitle = new JLabel("PERPUSTAKAAN");
    JLabel jlwelcome1 = new JLabel("SELAMAT DATANG DI");
    JLabel jlwelcome2 = new JLabel("PERPUSTAKAAN");
    
    JButton btnHome = new JButton("Home");
    JButton btnPinjam = new JButton("Pinjam");
    JButton btnTampil = new JButton("Tampil");
    JButton btnAboutUs = new JButton("About Us");
    JButton btnLogout = new JButton("Logout");
    
    public ViewHome()
    {
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(620,540);
        setLocationRelativeTo(null);
        
        //TITLE ================================================================
        add(jltitle);
        jltitle.setBounds(250, 70, 120, 20);
        
        //WELCOME ==============================================================
        add(jlwelcome1);
        jlwelcome1.setBounds(310, 200, 160, 20);
        add(jlwelcome2);
        jlwelcome2.setBounds(320, 220, 120, 20);
        
        //BUTTON ===============================================================
        add(btnHome);
        btnHome.setBounds(80, 150, 90, 35);
        add(btnPinjam);
        btnPinjam.setBounds(80, 200, 90, 35);
        add(btnTampil);
        btnTampil.setBounds(80, 250, 90, 35);
        add(btnAboutUs);
        btnAboutUs.setBounds(80, 300, 90, 35);
        add(btnLogout);
        btnLogout.setBounds(480, 20, 90, 35);
    }
}
