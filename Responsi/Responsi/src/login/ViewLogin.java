/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import javax.swing.*;
/**
 *
 * @author Aya
 */
public class ViewLogin extends JFrame {
    
    JLabel jltitle = new JLabel("LOGIN");
    JLabel jluser = new JLabel("Username : ");
    JTextField jtuser = new JTextField();
    JLabel jlpass = new JLabel("Password : ");
    JPasswordField jtpass =  new JPasswordField();
    
    JButton btnLogin = new JButton("Login");
    JButton btnDaftar = new JButton("Daftar");
    JButton btnExit = new JButton("Exit");
    
    public ViewLogin()
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
        add(btnLogin);
        btnLogin.setBounds(210, 300, 90, 20);
        add(btnDaftar);
        btnDaftar.setBounds(320, 300, 90, 20);
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
