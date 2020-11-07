/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import hitungBidang.Lingkaran;
import hitungBidang.PersegiPanjang;
import hitungRuang.Balok;
import hitungRuang.Kerucut;
import java.util.Scanner;
/**
 *
 * @author Aya
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        do
        {
            System.out.println("MENU");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            int choice = input.nextInt();
            
            switch(choice)
            {
                case 1 :
                {
                    System.out.println("\n------INPUT------");
                    System.out.print("Panjang\t : ");
                    double panjang = input.nextDouble();
                    System.out.print("Lebar\t : ");
                    double lebar = input.nextDouble();
                    System.out.print("Tinggi\t : ");
                    double tinggi = input.nextDouble();
                    PersegiPanjang persegi = new PersegiPanjang(panjang, lebar);
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    System.out.println("------OUTPUT------");
                    System.out.println("Luas Persegi\t\t : " + persegi.luas());
                    System.out.println("Keliling Persegi\t : " + persegi.keliling());
                    System.out.println("Volume Balok\t\t : " + balok.volume());
                    System.out.println("Luas Permukaan Balok\t : " + balok.luasPermukaan());
                    System.out.println("");
                }
                break;
                case 2 :
                {
                    System.out.println("\n------INPUT------");
                    System.out.print("Jari-jari : ");
                    double jarijari = input.nextDouble();
                    System.out.print("Tinggi    : ");
                    double tinggi = input.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(jarijari);
                    Kerucut kerucut = new Kerucut(jarijari, tinggi);
                    System.out.println("------OUTPUT------");
                    System.out.println("Luas Lingkaran\t\t : " + lingkaran.luas());
                    System.out.println("Keliling Keliling\t : " + lingkaran.keliling());
                    System.out.println("Volume Kerucut\t\t : " + kerucut.volume());
                    System.out.println("Luas Permukaan Kerucut\t : " + kerucut.luasPermukaan());
                    System.out.println("");
                }
                break;
                case 3 :
                {
                    System.exit(0);
                }
                break;
                default:
                    System.out.println("Pilihan tidak tersedia. Silahkan pilih Menu 1-3");
                    System.exit(0);
            }
        
        } while(true);
    }
    
}
