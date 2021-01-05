/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinjam;
import about.VC_About;
import home.VC_Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import login.MVC_Login;
import tampil.MVC_Tampil;

/**
 *
 * @author Aya
 */
public class ControllerPinjam {
    ViewPinjam viewpinjam;
    ModelPinjam modelpinjam;

    public ControllerPinjam(ViewPinjam cvp, ModelPinjam cmp) {
        this.viewpinjam = cvp;
        this.modelpinjam = cmp;
        
        if (modelpinjam.getBanyakData() != 0) {
            String data[][] = modelpinjam.readTransaksi();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        viewpinjam.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = viewpinjam.getId();
                String nama = viewpinjam.getAnggota();
                String idbuku = viewpinjam.getIdbuku();
                String judul = viewpinjam.getJudul();
                modelpinjam.insertTransaksi(id, nama, idbuku, judul);

                String data[][] = modelpinjam.readTransaksi();
            }
        });
        
        viewpinjam.btnBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.jtid.setText("");
                viewpinjam.jtanggota.setText("");
                viewpinjam.jtidbuku.setText("");
                viewpinjam.jtjudul.setText("");
            }
        });
        
        viewpinjam.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                new VC_Home();
            }
        });
        
        viewpinjam.btnPinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(true);
            }
        });
        
        viewpinjam.btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                new MVC_Tampil();
            }
        });
        
        viewpinjam.btnAboutUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                new VC_About();
            }
        });
        
        viewpinjam.btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(null, "Yakin?", "LOGOUT", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                  viewpinjam.setVisible(false);
                  new MVC_Login();
                } 
            }
        });
    }
    
}
