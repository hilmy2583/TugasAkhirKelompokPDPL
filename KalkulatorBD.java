package TugasAkhirKelompokPDPL;

import java.util.Scanner;

public class KalkulatorBD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pilih bangun datar
        System.out.println("Pilih bangun datar yang ingin dihitung luasnya:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan nomor pilihan: ");
        int pilihan = scanner.nextInt();

        // Hitung luas
        switch (pilihan) {
            case 1:
                // Persegi
                System.out.print("Masukkan panjang sisi: ");
                double sisi = scanner.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("Luas persegi adalah: " + luasPersegi);
                break;
            case 2:
                // Persegi panjang
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                double luasPersegiPanjang = panjang * lebar;
                System.out.println("Luas persegi panjang adalah: " + luasPersegiPanjang);
                break;
            case 3:
                // Segitiga
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("Luas segitiga adalah: " + luasSegitiga);
                break;
            case 4:
                // Lingkaran
                System.out.print("Masukkan jari-jari: ");
                double jari = scanner.nextDouble();
                double luasLingkaran = Math.PI * jari * jari;
                System.out.println("Luas lingkaran adalah: " + luasLingkaran);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}
