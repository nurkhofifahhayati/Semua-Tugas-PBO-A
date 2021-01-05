/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Aya
 */
public class ModelPraktikum {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/praktikum?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";
    Connection koneksi;
    Statement statement;
    
    public ModelPraktikum(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public void insertMahasiswa(String nim, String nama, String alamat)
    {
        int jmlData=0;
        try
        {
            String query = "Select * from mahasiswa WHERE nim=" + nim; 
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()){ 
                jmlData++;
            }
            
            if(jmlData==0)
            {
                query = "INSERT INTO mahasiswa(nama, nim, alamat) VALUES ('"+nama+"','"+nim+"','"+alamat+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            } else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch(Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updateMahasiswa(String nim, String nama, String alamat)
    {
        int jmlData=0;
        try 
        {
            String query = "SELECT * from mahasiswa WHERE nim=" + nim;
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next()) {
                jmlData++;
            }
            
            if(jmlData==1)
            { 
                query = "UPDATE mahasiswa SET nama='" + nama + "', alamat='" + alamat +"' WHERE nim=" + nim;
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); 
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
            }
        } catch(Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showConfirmDialog(null, sql.getMessage());
        }
    }
    
    public String[][] searchNim(String cari){
        try{
            int jmlData = 0;
            String data[][] = new String[getBanyakData()][3];
            
            statement = koneksi.createStatement();
            String query = "SELECT * from mahasiswa WHERE nim LIKE '%"+cari+"%'";
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("nim"); 
                data[jmlData][1] = resultSet.getString("nama");                
                data[jmlData][2] = resultSet.getString("alamat");
                jmlData++;
            }
            resultSet.close();
            statement.close();
            return data;
            
        }catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Data tidak ada");
            return null;
        }
    }
    
    public String[][] readMahasiswa(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][3];
            
            String query = "Select * from mahasiswa"; 
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("nim"); 
                data[jmlData][1] = resultSet.getString("nama");                
                data[jmlData][2] = resultSet.getString("alamat");
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from mahasiswa";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public void deleteMahasiswa (String nim) {
        try{
            String query = "DELETE FROM mahasiswa WHERE nim = '"+nim+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
}
