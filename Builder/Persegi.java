package TugasAkhirKelompokPDPL.CobaBuilder;

import java.util.Scanner;

public class Persegi extends BangunDatar {
    private int sisi;

    public Persegi() {
        Scanner shape = new Scanner(System.in);
        System.out.print("Masukkan Sisi Persegi: ");
        int sisi = shape.nextInt();        
        this.sisi = sisi;
        shape.close();
    }

    @Override
    public void hitungLuas() {
        luas = sisi * sisi;
    }

    @Override
    public void hitungKeliling() {
        keliling = 4 * sisi;
    }
}
