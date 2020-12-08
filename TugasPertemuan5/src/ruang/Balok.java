/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;
import bidang.PersegiPanjang;

/**
 *
 * @author Aya
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
     public double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    
        
    //2(p × ℓ + p × t + ℓ × t)
    @Override
    public double volume(){
        return luas()*this.tinggi;
    }
    @Override
    public double luasPermukaan(){
        return 2*((panjang*lebar)+(panjang*this.tinggi)+(lebar*this.tinggi));
    }
}