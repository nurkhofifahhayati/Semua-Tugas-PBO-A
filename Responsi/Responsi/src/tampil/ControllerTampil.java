/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampil;
import about.VC_About;
import edit.ControllerEdit;
import edit.MVC_Edit;
import edit.ViewEdit;
import home.VC_Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import login.MVC_Login;
import pinjam.MVC_Pinjam;
import pinjam.ViewPinjam;
/**
 *
 * @author Aya
 */
public class ControllerTampil {
     ViewTampil viewtampil;
     ModelTampil modeltampil;

    public ControllerTampil(ViewTampil vtc, ModelTampil mtc) {
        this.viewtampil = vtc;
        this.modeltampil = mtc;
        
        if (modeltampil.getBanyakData() != 0) {
            String dataTransaksi[][] = modeltampil.readTransaksi();
            viewtampil.tabel.setModel((new JTable(dataTransaksi, viewtampil.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        ViewEdit edit = new ViewEdit();
        edit.setVisible(true);
        
        viewtampil.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int baris = viewtampil.tabel.getSelectedRow();
                
                String dataterpilih = viewtampil.tabel.getValueAt(baris, 3).toString();

                System.out.println(dataterpilih);
                
                int input = JOptionPane.showConfirmDialog(null, 
                    "Yakin?", "HAPUS", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    modeltampil.deleteTransaksi(dataterpilih);
                    String dataTransaksi[][] = modeltampil.readTransaksi();
                    viewtampil.tabel.setModel(new JTable(dataTransaksi, viewtampil.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });
        
        viewtampil.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewtampil.tabel.getSelectedRow();
                
                edit.jtid.setText(viewtampil.tabel.getModel().getValueAt(baris, 0).toString());
                edit.jtanggota.setText(viewtampil.tabel.getModel().getValueAt(baris, 1).toString());
                edit.jtidbuku.setText(viewtampil.tabel.getModel().getValueAt(baris, 2).toString());
                edit.jtjudul.setText(viewtampil.tabel.getModel().getValueAt(baris, 3).toString());
                
            }
        });
        
        viewtampil.btnEdit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                new MVC_Edit();
            }
        });
        
        viewtampil.btnHome.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                new VC_Home();
            }
        });
        
        viewtampil.btnPinjam.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                new MVC_Pinjam();
            }
        });
        
        viewtampil.btnTampil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(true);
            }
        });
        
        viewtampil.btnAboutUs.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                new VC_About();
            }
        });
        
        viewtampil.btnLogout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(null, "Yakin?", "LOGOUT", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                  viewtampil.setVisible(false);
                  new MVC_Login();
                } 
            }
        });
    }
}
