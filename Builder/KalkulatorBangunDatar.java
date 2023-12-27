package TugasAkhirKelompokPDPL.CobaBuilder;

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner shape = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("*Menghitung Luas & Keliling Bangun Datar*");
        System.out.println("Daftar Bangun Datar: ");
        System.out.println("1. Persegi\n2. Persegi Panjang\n3. Lingkaran");
        System.out.println("==================================");
        System.out.print("Masukkan Nomor Bangun Datar: ");
        String inputan = shape.next();
        
        BangunDatar bangun = BangunDatarBuilder.create(inputan);

        bangun.hitungLuas();
        bangun.hitungKeliling();

        System.out.println("==================================");
        System.out.println("Bangun: " + inputan);
        System.out.println("Luas: " + bangun.getLuas());
        System.out.println("Keliling: " + bangun.getKeliling());
        System.out.println("==================================");

        shape.close();
    }
}
