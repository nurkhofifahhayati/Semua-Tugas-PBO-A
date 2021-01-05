
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aya
 */
public class ViewPraktikum extends JFrame {
    
    JLabel jlnim = new JLabel("Nim : ");
    JTextField jtnim = new JTextField();
    JLabel jlnama = new JLabel("Nama : ");
    JTextField jtnama = new JTextField();
    JLabel jlalamat = new JLabel("Alamat : ");
    JTextField jtalamat = new JTextField();
    JTextField jtsearch = new JTextField();
    
    JButton jbtambah = new JButton("Tambah");
    JButton jbupdate = new JButton("Update");
    JButton jbreset = new JButton("Reset");
    JButton jbsearch = new JButton("Cari NIM");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Nim", "Nama", "Alamat"};
    
    public ViewPraktikum()
    {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Mahasiswa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(750,400);
        setLocationRelativeTo(null);
        
        add(scrollPane);
        scrollPane.setBounds(20, 50, 480, 300);
        
        // NIM =================================================================
        add(jlnim);
        jlnim.setBounds(510, 20, 90, 20);
        add(jtnim);
        jtnim.setBounds(510, 40, 120, 20);
        
        // NAMA ================================================================
        add(jlnama);
        jlnama.setBounds(510, 70, 90, 20);
        add(jtnama);
        jtnama.setBounds(510, 90, 120, 20);
        
        // ALAMAT ==============================================================
        add(jlalamat);
        jlalamat.setBounds(510, 120, 90, 20);
        add(jtalamat);
        jtalamat.setBounds(510, 140, 120, 20);
        
        // CARI ================================================================
        add(jtsearch);
        jtsearch.setBounds(20, 20, 370, 20);
        
        // BUTTON ==============================================================
        add(jbsearch);
        jbsearch.setBounds(410, 20, 90 ,20);
        
        add(jbtambah);
        jbtambah.setBounds(510, 180, 90, 20);
        
        add(jbupdate);
        jbupdate.setBounds(510, 220, 90, 20);
        
        add(jbreset);
        jbreset.setBounds(510, 260, 90, 20);
    }
    
    //Buat ngambil data texfield
    public String getNim(){
        return jtnim.getText();
    }
    
    public String getNama(){
        return jtnama.getText();
    }
    
    public String getAlamat(){
        return jtalamat.getText();
    }

    public String getJtsearch() {
        return jtsearch.getText();
    }
}
