/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampil;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Aya
 */
public class ViewTampil extends JFrame {
    
    JLabel jltitle = new JLabel("PERPUSTAKAAN");
    JLabel jldaftar = new JLabel("LIST BUKU YANG DIPINJAM");
    
    JButton btnHapus = new JButton("Hapus");
    JButton btnEdit = new JButton("Edit");
    JButton btnHome = new JButton("Home");
    JButton btnPinjam = new JButton("Pinjam");
    JButton btnTampil = new JButton("Tampil");
    JButton btnAboutUs = new JButton("About Us");
    JButton btnLogout = new JButton("Logout");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID", "Nama", "ID Buku", "Judul Buku"};
    
    public ViewTampil()
    {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(620,540);
        setLocationRelativeTo(null);
        
        add(scrollPane);
        scrollPane.setBounds(20, 190, 360, 290);
        
        //TITLE ================================================================
        add(jltitle);
        jltitle.setBounds(170, 40, 120, 20);
        
        //DAFTAR ===============================================================
        add(jldaftar);
        jldaftar.setBounds(140, 150, 200, 20);
        
        //BUTTON ===============================================================
        add(btnHapus);
        btnHapus.setBounds(110, 90, 90, 20);
        add(btnEdit);
        btnEdit.setBounds(230, 90, 90, 20);
        add(btnHome);
        btnHome.setBounds(450, 150, 90, 35);
        add(btnPinjam);
        btnPinjam.setBounds(450, 200, 90, 35);
        add(btnTampil);
        btnTampil.setBounds(450, 250, 90, 35);
        add(btnAboutUs);
        btnAboutUs.setBounds(450, 300, 90, 35);
        add(btnLogout);
        btnLogout.setBounds(480, 20, 90, 35);
        
    }
}
