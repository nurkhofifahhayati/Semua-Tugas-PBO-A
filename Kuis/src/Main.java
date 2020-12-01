/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Pendaftaran.FormDaftar;
import java.util.Scanner;
/**
 *
 * @author Aya
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int nik; 
        
        System.out.println("FORM PENDAFTARAN PT. UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih jenis form : ");
        int pilih1 = input.nextInt();
         
        switch(pilih1)
        {
            case 1:
            {
                
                System.out.println("\nFORM PENDAFTARAN");
                System.out.print("\nInput NIK : ");
                nik = input.nextInt();
                input.nextLine();
                System.out.print("Input Nama : ");
                String nama = input.nextLine();
                FormDaftar daftar = new FormDaftar();
                daftar.calonPelamar();
                
                do {
                    
                    System.out.println("\n-----MENU-----");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    int pilih2 = input.nextInt();
                    switch(pilih2)
                    {
                        case 1:
                        {
                            daftar.calonPelamar();
                        }
                        break;
                        case 2:
                        {
                            System.out.println("Nilai Akhir : " + daftar.hasilAndroid());
                            if (daftar.hasilAndroid() < 85)
                            {
                                System.out.println("KETERANGAN : GAGAL");
                                System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai Android");
                            }
                            else {
                                System.out.println("KETERANGAN : LOLOS");
                                System.out.println("Selamat kepada " + nama + " telah diterima sebagai Android");
                            }
                        }
                        break;
                        case 3:
                        {
                            System.exit(0);
                        }
                        break;
                    }
                    
                } while(true);
            }
           
            case 2:
            {
                System.out.println("\nFORM PENDAFTARAN");
                System.out.print("\nInput NIK : ");
                nik = input.nextInt();
                input.nextLine();
                System.out.print("Input Nama : ");
                String nama = input.nextLine();
                FormDaftar daftar = new FormDaftar();
                daftar.calonPelamar();
                
                do {
                    
                    System.out.println("\n-----MENU-----");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    int pilih2 = input.nextInt();
                    switch(pilih2)
                    {
                        case 1:
                        {
                            daftar.calonPelamar();
                        }
                        break;
                        case 2:
                        {
                            System.out.println("Nilai Akhir : " + daftar.hasilWeb());
                            if (daftar.hasilWeb() < 85)
                            {
                                System.out.println("KETERANGAN : GAGAL");
                                System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai Web");
                            }
                            else {
                                System.out.println("KETERANGAN : LOLOS");
                                System.out.println("Selamat kepada " + nama + " telah diterima sebagai Web");
                            }
                        }
                        break;
                        case 3:
                        {
                            System.exit(0);
                        }
                        break;
                    }
                    
                } while(true);
            }
        }
    }
}
