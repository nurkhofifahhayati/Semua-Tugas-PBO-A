/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package about;
import home.VC_Home;
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
public class ControllerAbout {
    ViewAbout viewabout;

    public ControllerAbout(ViewAbout vac) {
        this.viewabout = vac;
        
        viewabout.btnHome.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(false);
                new VC_Home();
            }
        });
        
        viewabout.btnPinjam.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(false);
                new MVC_Pinjam();
            }
        });
        
        viewabout.btnTampil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(false);
                new MVC_Tampil();
            }
        });
        
        viewabout.btnAboutUs.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(true);
            }
        });
        
        viewabout.btnLogout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(null, "Yakin?", "LOGOUT", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                  viewabout.setVisible(false);
                  new MVC_Login();
                } 
            }
        });
    }
}
