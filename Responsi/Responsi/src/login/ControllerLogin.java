/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import daftar.MVC_Daftar;
import home.VC_Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Aya
 */
public class ControllerLogin {
    ViewLogin viewlogin;
    ModelLogin modellogin;

    public ControllerLogin(ViewLogin cvl, ModelLogin cml) {
        this.viewlogin = cvl;
        this.modellogin = cml;
        
        if (modellogin.getBanyakData() != 0) {
            String data[][] = modellogin.readLogin();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        viewlogin.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try {
                String sql = "SELECT * FROM akun WHERE username='"+viewlogin.getUser()+"' AND password='"+viewlogin.getPass()+"'";
                ResultSet rs = modellogin.statement.executeQuery(sql);
                if(rs.next()){
                    if(viewlogin.getUser().equals(rs.getString("username")) && viewlogin.getPass().equals(rs.getString("password"))){
                        JOptionPane.showMessageDialog(null, "Berhasil login");
                        viewlogin.setVisible(false);
                        new VC_Home();
                    }
                }else{
                        JOptionPane.showMessageDialog(null, "Gagal login");
                    }
                
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "");
                System.out.println(ex.getMessage());
            }
            }
        });
        
        viewlogin.btnDaftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewlogin.setVisible(false);
                new MVC_Daftar();
            }
        });
        
        viewlogin.btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(null, "Yakin?", "Keluar", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                  System.exit(0);
                } 
            }
        });
    }
}
