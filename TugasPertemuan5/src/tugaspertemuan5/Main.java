/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan5;
import javax.swing.*;
import java.awt.event.*;
import bidang.PersegiPanjang;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import ruang.Balok;
/**
 *
 * @author Aya
*/	

public class Main {
    public static void main(String[] args) {
        GUI g = new GUI();
        
    }
}

class GUI extends JFrame implements ActionListener {

   private JButton btnHitung = new JButton("Hitung");
   private JButton btnReset = new JButton("Reset");
   
   JLabel ltitle = new JLabel("KALKULATOR BALOK");
   
   final JTextField fpanjang = new JTextField();
   final JTextField flebar = new JTextField();
   final JTextField ftinggi = new JTextField();

   public String getFpanjang() {
        return fpanjang.getText();
   }
   public String getFlebar() {
        return flebar.getText();
   }
   public String getFtinggi() {
        return ftinggi.getText();
   }
   
   JLabel lpanjang = new JLabel("Panjang ");
   JLabel llebar = new JLabel("Lebar ");
   JLabel ltinggi = new JLabel("Tinggi ");
   JLabel lhasil = new JLabel("Hasil: ");
   JLabel hasilLuas = new JLabel();
   JLabel hasilKeliling = new JLabel();
   JLabel hasilVolume = new JLabel();
   JLabel hasilLuasPermukaan = new JLabel();
   
   
   public GUI() {
	setTitle("Kalkulator Balok");
	setDefaultCloseOperation(3);
	setSize(420,450);
        
	setLayout(null);
        add(ltitle);
	add(lpanjang);
	add(fpanjang);
	add(llebar);
	add(flebar);
        add(ltinggi);
	add(ftinggi);
        add(lhasil);
        add(hasilLuas);
        add(hasilKeliling);
        add(hasilVolume);
        add(hasilLuasPermukaan);
	add(btnHitung);
        add(btnReset);
       
        btnHitung.addActionListener(this);
	btnReset.addActionListener(this);
	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
        ltitle.setBounds(130,10,300,20);
	lpanjang.setBounds(40,70,120,20);
	fpanjang.setBounds(130,70,200,20);
	llebar.setBounds(40,110,120,20);
	flebar.setBounds(130,110,200,20);
        ltinggi.setBounds(40,150,120,20);
	ftinggi.setBounds(130,150,200,20);
        lhasil.setBounds(130,180,200,20);
        
        
	btnHitung.setBounds(80,380,120,20);
        btnReset.setBounds(220,380,120,20);
	setResizable(false);
	setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnHitung) {
           try {
                int panjang, lebar, tinggi;
                panjang = Integer.parseInt(getFpanjang());
                lebar = Integer.parseInt(getFlebar());
                tinggi = Integer.parseInt(getFtinggi()); 
                
                PersegiPanjang persegi = new PersegiPanjang(panjang, lebar);
                Balok balok = new Balok(panjang, lebar, tinggi);
                
                add(hasilLuas);
                add(hasilKeliling);
                add(hasilVolume);
                add(hasilLuasPermukaan);
                
                String hasilLuas = String.valueOf(persegi.luas());
                String hasilKeliling = String.valueOf(persegi.keliling());
                String hasilVolume = String.valueOf(balok.volume());
                String hasilLuasPermukaan = String.valueOf(balok.luasPermukaan());
                
                JLabel lluas = new JLabel("Luas Persegi\t : " + hasilLuas);
                JLabel lkeliling = new JLabel("Keliling Persegi\t : "  + hasilKeliling);
                JLabel lvolume = new JLabel("Volume Balok\t : " + hasilVolume);
                JLabel lluasPermukaan = new JLabel("Luas Permukaan Balok\t : " + hasilLuasPermukaan);
                
                lluas.setBounds(40,210,200,20);
                lkeliling.setBounds(40,240,200,20);
                lvolume.setBounds(40,270,200,20);
                lluasPermukaan.setBounds(40,300,200,20);

           }
           catch(Exception error) {
                System.out.println("Erornya adalah = " +error.getMessage());
           }
           
        }
        if(e.getSource()==btnReset) {
            fpanjang.setText("");
            flebar.setText("");
            ftinggi.setText("");
        }
    }
}