/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendaftaran;
import java.util.Scanner;
/**
 *
 * @author Aya
 */
public class FormDaftar implements Tes {
    
    Scanner input = new Scanner(System.in);
    
    public double tulis, coding, wawancara;
    
    public FormDaftar() {
        tulis = 0;
        coding = 0;
        wawancara = 0;
    }

    public void setTulis(double tulis) {
        this.tulis = tulis;
    }

    public void setCoding(double coding) {
        this.coding = coding;
    }

    public void setWawancara(double wawancara) {
        this.wawancara = wawancara;
    }
    
    public void calonPelamar()
    {
        System.out.print("Input Nilai Tes Tulis : ");
        tulis = input.nextDouble();
        System.out.print("Input Nilai Tes Coding : ");
        coding = input.nextDouble();
        System.out.print("Input Nilai Tes Wawancara : ");
        wawancara = input.nextDouble();
    }
    
    @Override
    public double hasilAndroid() {
       return (0.2*tulis)+(0.5*coding)+(0.3*wawancara);
    }

    @Override
    public double hasilWeb() {
        return (0.4*tulis)+(0.35*coding)+(0.25*wawancara);
    }
    
}