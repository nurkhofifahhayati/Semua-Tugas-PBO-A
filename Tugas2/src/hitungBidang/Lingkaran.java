/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungBidang;

/**
 *
 * @author Aya
 */
public class Lingkaran implements MenghitungBidang {
    public double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double luas() {
        return Math.PI*jarijari*jarijari;
    }

    @Override
    public double keliling() {
        return 2*Math.PI*jarijari;
    }
    
}
