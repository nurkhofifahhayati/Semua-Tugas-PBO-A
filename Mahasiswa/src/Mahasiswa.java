
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aya
 */
public class Mahasiswa {
    String nama, alamat;
    String[] jurusan = {"Informatika", "Sistem Informasi"};
    int nim;
    double uts, uas;
    
    Scanner input = new Scanner(System.in);
    
    void tulisData(){
        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan nim : ");
        nim = input.nextInt();
        System.out.print("Masukkan alamat : ");
        alamat = input.next();
        System.out.print("Masukkan nilai UTS : ");
        uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        uas = input.nextDouble();
    }
    void lihatData(){
        System.out.println("Nama\t : " + nama);
        System.out.println("Nim\t : " + nim);
        System.out.println("Alamat\t : " + alamat);
        if(nim >= 123000000 && nim <= 123999999) {
            System.out.println("Jurusan\t : " + jurusan[0]);
        }
        else {
            System.out.println("Jurusan\t : " + jurusan[1]);
        }
        System.out.println("Nilai\t : " + (uts+uas)/2);
    }
    void editData(){
        input.nextLine();
        System.out.print("Masukkan nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan nim : ");
        nim = input.nextInt();
        System.out.print("Masukkan alamat : ");
        alamat = input.next();
        System.out.print("Masukkan nilai UTS : ");
        uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        uas = input.nextDouble();
    }
}
