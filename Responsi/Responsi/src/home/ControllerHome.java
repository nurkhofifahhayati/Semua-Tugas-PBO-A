/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;
import about.VC_About;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import login.MVC_Login;
import pinjam.MVC_Pinjam;
import tampil.MVC_Tampil;
/**
 *
 * @author Aya
 */
public class ControllerHome {
    ViewHome viewhome;

    public ControllerHome(ViewHome vhc) {
        this.viewhome = vhc;
        
        viewhome.btnHome.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewhome.setVisible(true);
            }
        });
        
        viewhome.btnPinjam.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewhome.setVisible(false);
                new MVC_Pinjam();
            }
        });
        
        viewhome.btnTampil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewhome.setVisible(false);
                new MVC_Tampil();
            }
        });
        
        viewhome.btnAboutUs.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewhome.setVisible(false);
                new VC_About();
            }
        });
        
        viewhome.btnLogout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(null, "Yakin?", "LOGOUT", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                  viewhome.setVisible(false);
                  new MVC_Login();
                } 
            }
        });
    }
}
