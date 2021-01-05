/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package about;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author Aya
 */
public class ViewAbout extends JFrame {
    
    JLabel jltitle = new JLabel("PERPUSTAKAAN");
    JLabel jlabout = new JLabel("ABOUT US");
    
    JButton btnHome = new JButton("Home");
    JButton btnPinjam = new JButton("Pinjam");
    JButton btnTampil = new JButton("Tampil");
    JButton btnAboutUs = new JButton("About Us");
    JButton btnLogout = new JButton("Logout");
    
    public ViewAbout()
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
        add(jlabout);
        jlabout.setBounds(280, 200, 160, 20);
        
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
