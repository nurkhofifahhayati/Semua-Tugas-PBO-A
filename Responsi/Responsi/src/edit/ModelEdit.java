/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edit;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Aya
 */
public class ModelEdit {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpus?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";
    Connection koneksi;
    Statement statement;
    
    public ModelEdit(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public void updateTransaksi(String memberId, String memberName, String bookId, String bookName)
    {
        int jmlData=0;
        try
        {
            String query = "Select * from transaksi WHERE memberId=" + memberId;
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()){ 
                jmlData++;
            }
            
            if(jmlData==1)
            {
                query = "UPDATE transaksi SET memberName='" + memberName + "', bookId='" + bookId +"', bookName='" + bookName +"' WHERE memberId=" + memberId;
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diedit");
                JOptionPane.showMessageDialog(null, "Edit Berhasil");
            }
        } catch(Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public String[][] readTransaksi(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][4];
            
            String query = "Select * from transaksi"; 
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("memberId"); 
                data[jmlData][1] = resultSet.getString("memberName");                
                data[jmlData][2] = resultSet.getString("bookId");
                data[jmlData][3] = resultSet.getString("bookName");
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
            String query = "Select * from transaksi";
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
}
