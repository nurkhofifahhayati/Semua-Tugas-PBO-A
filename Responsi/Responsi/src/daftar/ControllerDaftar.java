/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import login.MVC_Login;

/**
 *
 * @author Aya
 */
public class ControllerDaftar {
    ViewDaftar viewdaftar;
    ModelDaftar modeldaftar;

    public ControllerDaftar(ViewDaftar cvd, ModelDaftar cmd) {
        this.viewdaftar = cvd;
        this.modeldaftar = cmd;
        
        if (modeldaftar.getBanyakData() != 0) {
            String data[][] = modeldaftar.readDaftar();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        viewdaftar.btnDaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(viewdaftar.getUser().equals("") || viewdaftar.getPass().equals("")){
                        JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    }
                    else {
                        String user = viewdaftar.getUser();
                        String pass = viewdaftar.getPass();
                        modeldaftar.insertAkun(user, pass);
                    }

                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Daftar Gagal");
                    System.out.println(ex.getMessage());
                }
            }
        });
        
        viewdaftar.btnBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewdaftar.setVisible(false);
                new MVC_Login();
            }
        });
        
        viewdaftar.btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(null, "Yakin?", "Keluar", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                  System.exit(0);
                } 
            }
        });
    }
}
