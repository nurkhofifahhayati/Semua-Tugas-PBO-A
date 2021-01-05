/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edit;
import javax.swing.*;
/**
 *
 * @author Aya
 */
public class ViewEdit extends JFrame {
    
    JLabel jltitle = new JLabel("PERPUSTAKAAN");
    JLabel jlid = new JLabel("ID Anggota : ");
    public JTextField jtid = new JTextField();
    JLabel jlanggota = new JLabel("Nama : ");
    public JTextField jtanggota = new JTextField();
    JLabel jlidbuku = new JLabel("ID Buku : ");
    public JTextField jtidbuku = new JTextField();
    JLabel jljudul = new JLabel("Judul Buku : ");
    public JTextField jtjudul = new JTextField();
    
    JButton btnBatal = new JButton("Batal");
    JButton btnEdit = new JButton("Edit");
    
    public ViewEdit()
    {
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(620,540);
        setLocationRelativeTo(null);
        
        //TITLE ================================================================
        add(jltitle);
        jltitle.setBounds(260, 70, 120, 20);
        
        //ID ANGGOTA ===========================================================
        add(jlid);
        jlid.setBounds(170, 150, 90, 20);
        add(jtid);
        jtid.setBounds(270, 150, 150, 20);
        
        //NAMA ANGGOTA =========================================================
        add(jlanggota);
        jlanggota.setBounds(170, 200, 90, 20);
        add(jtanggota);
        jtanggota.setBounds(270, 200, 150, 20);
        
        //ID BUKU ==============================================================
        add(jlidbuku);
        jlidbuku.setBounds(170, 250, 90, 20);
        add(jtidbuku);
        jtidbuku.setBounds(270, 250, 150, 20);
        
        //JUDUL BUKU ===========================================================
        add(jljudul);
        jljudul.setBounds(170, 300, 90, 20);
        add(jtjudul);
        jtjudul.setBounds(270, 300, 150, 20);
        
        //BUTTON ===============================================================
        add(btnBatal);
        btnBatal.setBounds(180, 380, 100, 20);
        add(btnEdit);
        btnEdit.setBounds(300, 380, 100, 20);
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
}
