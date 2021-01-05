/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftar;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Aya
 */
public class ModelDaftar {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpus?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";
    Connection koneksi;
    Statement statement;
    
    public ModelDaftar(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from akun";
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
    
    public String[][] readDaftar(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][2]; 
            
            String query = "Select * from akun"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("username"); 
                data[jmlData][1] = resultSet.getString("password");     
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void insertAkun(String user, String pass)
    {
        int jmlData = 0;
        try 
        {
            String query = "Select * from akun WHERE username=" + user + "'"; 
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()){ 
                jmlData++;
            }
            
            if(jmlData==0 && user!="" && pass!="")
            {
                query = "INSERT INTO akun(username, password) VALUES ('"+user+"','"+pass+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //quernya diexecute
                System.out.println("Berhasil didaftarkan");
                JOptionPane.showMessageDialog(null, "Berhasil Daftar");
            }
            else {
                JOptionPane.showMessageDialog(null, "Username telah terdaftar");
            }
        } catch(Exception sql){
            System.out.println(sql.getMessage()); 
        }
    }
}
