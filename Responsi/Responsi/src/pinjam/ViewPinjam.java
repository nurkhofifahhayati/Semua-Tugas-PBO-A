/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinjam;
import javax.swing.*;
/**
 *
 * @author Aya
 */
public class ViewPinjam extends JFrame {
    
    JLabel jltitle = new JLabel("PERPUSTAKAAN");
    JLabel jlid = new JLabel("ID Anggota : ");
    JTextField jtid = new JTextField();
    JLabel jlanggota = new JLabel("Nama : ");
    JTextField jtanggota = new JTextField();
    JLabel jlidbuku = new JLabel("ID Buku : ");
    JTextField jtidbuku = new JTextField();
    JLabel jljudul = new JLabel("Judul Buku : ");
    JTextField jtjudul = new JTextField();
    
    JButton btnTambah = new JButton("Tambah");
    JButton btnBatal = new JButton("Batal");
    JButton btnHome = new JButton("Home");
    JButton btnPinjam = new JButton("Pinjam");
    JButton btnTampil = new JButton("Tampil");
    JButton btnAboutUs = new JButton("About Us");
    JButton btnLogout = new JButton("Logout");
    
    public ViewPinjam()
    {
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(620,540);
        setLocationRelativeTo(null);
        
        //TITLE =================================================================
        add(jltitle);
        jltitle.setBounds(170, 70, 120, 20);
        
        //ID ANGGOTA ===========================================================
        add(jlid);
        jlid.setBounds(80, 150, 90, 20);
        add(jtid);
        jtid.setBounds(180, 150, 150, 20);
        
        //NAMA ANGGOTA =========================================================
        add(jlanggota);
        jlanggota.setBounds(80, 200, 90, 20);
        add(jtanggota);
        jtanggota.setBounds(180, 200, 150, 20);
        
        //ID BUKU ==============================================================
        add(jlidbuku);
        jlidbuku.setBounds(80, 250, 90, 20);
        add(jtidbuku);
        jtidbuku.setBounds(180, 250, 150, 20);
        
        //JUDUL BUKU ===========================================================
        add(jljudul);
        jljudul.setBounds(80, 300, 90, 20);
        add(jtjudul);
        jtjudul.setBounds(180, 300, 150, 20);
        
        //BUTTON ===============================================================
        add(btnTambah);
        btnTambah.setBounds(120, 380, 90, 20);
        add(btnBatal);
        btnBatal.setBounds(240, 380, 90, 20);
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

    public String getId() {
        return jtid.getText();
    }

    public String getAnggota() {
        return jtanggota.getText();
    }

    public String getIdbuku() {
        return jtidbuku.getText();
    }

    public String getJudul() {
        return jtjudul.getText();
    }

    public void setId(String id) {
        this.jtid.setText("");
    }

    public void setAnggota(String anggota) {
        this.jtanggota.setText("");
    }

    public void setIdbuku(String idbuku) {
        this.jtidbuku.setText("");
    }

    public void setJudul(String judul) {
        this.jtjudul.setText("");
    }
}
