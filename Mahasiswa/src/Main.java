          /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aya
 */
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
      
       char answer;
       
       Scanner input = new Scanner(System.in);
      
       Mahasiswa mhs = new Mahasiswa();
       
       mhs.tulisData();
       
       do {
           
           System.out.println("\nMenu");
           System.out.println("1. Lihat Detail Data");
           System.out.println("2. Edit Data");
           System.out.print("Choose one : ");
           int choice = input.nextInt();
           
           switch(choice)
           {
               case 1:
               {
                   mhs.lihatData();
               }
               break;
               case 2:
               {
                   mhs.editData();
               }
               break;
           }
           
           System.out.print("Want to back menu? (y/n) : ");
           answer = input.next().charAt(0);
       } while (answer == 'y');
    }
}
