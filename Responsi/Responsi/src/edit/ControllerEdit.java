/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import pinjam.MVC_Pinjam;
import tampil.MVC_Tampil;
import pinjam.ViewPinjam;
/**
 *
 * @author Aya
 */
public class ControllerEdit {
    ViewEdit viewedit;
    ModelEdit modeledit;

    public ControllerEdit(ViewEdit cve, ModelEdit cme) {
        this.viewedit = cve;
        this.modeledit = cme;
        
        if (modeledit.getBanyakData() != 0) {
            String data[][] = modeledit.readTransaksi();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
    
        viewedit.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = viewedit.getId();
                String nama = viewedit.getAnggota();
                String idbuku = viewedit.getIdbuku();
                String judul = viewedit.getJudul();
                modeledit.updateTransaksi(id, nama, idbuku, judul);

                String data[][] = modeledit.readTransaksi();
            }
        });
        
        viewedit.btnBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.setVisible(false);
                new MVC_Tampil();
            }
        });
        
    }
    
    
}
