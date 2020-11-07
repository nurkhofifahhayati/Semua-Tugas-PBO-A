/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungRuang;

import hitungBidang.Lingkaran;
/**
 *
 * @author Aya
 */
public class Kerucut extends Lingkaran implements MenghitungRuang{
    public double tinggi;

    public Kerucut(double jarijari, double tinggi) {
        super(jarijari);
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return Math.PI*jarijari*jarijari;
    }

    @Override
    public double keliling() {
        return 2*Math.PI*jarijari;
    }    
    
    // rumus-rumus kerucut
    // Volume Kerucut = 1/3 · Luas Alas · Tinggi
    // Luas P = π·r · (r + s)
    // Selimut = √(r² + t²)
    
    private double selimut() {
        return Math.sqrt( Math.pow(jarijari,2) + Math.pow(this.tinggi,2) );
    }
    
    @Override
    public double volume() {
        return 0.333*luas()*this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        return Math.PI*jarijari*(jarijari+selimut());
    }
    
}
