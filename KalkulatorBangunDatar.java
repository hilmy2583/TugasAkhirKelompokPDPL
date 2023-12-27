package TugasAkhirKelompokPDPL;

/**
 * KalkulatorBangunDatar
 */
import java.util.Scanner;
public class KalkulatorBangunDatar {

    public static void main(String args[]){
        Scanner shape = new Scanner(System.in);

        System.out.println("*Menghitung Luas & Keliling Bangun Datar*");
        System.out.println("Daftar Bangun Datar: ");
        System.out.println("1. Persegi\n2. Persegi Panjang\n3. Lingkaran");
        System.out.print("Masukkan Nomor Bangun Datar: ");
        String bentuk = shape.next();

        if(bentuk.equals("1") || bentuk.equals("persegi") || bentuk.equals("Persegi")){
            System.out.print("Masukkan nilai sisi: ");
            int sisi = shape.nextInt();
            int luas = sisi * sisi;
            int Keliling = sisi * 4;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + Keliling);
        }
        else if(bentuk.equals("2") || bentuk.equals("persegi panjang") || bentuk.equals("Persegi Panjang")){
            System.out.print("Masukkan nilai panjang: ");
            int panjang = shape.nextInt();
            System.out.print("Masukkan nilai lebar: ");
            int lebar = shape.nextInt();
            int luas = panjang * lebar;
            int Keliling = 2 * (panjang + lebar);
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + Keliling);
        }
        else if(bentuk.equals("3") || bentuk.equals("lingkaran") || bentuk.equals("Lingkaran")){
            System.out.print("Masukkan nilai jari-jari: ");
            int jari = shape.nextInt();
            int phi = 22 / 7;
            int luas = phi * (jari * jari);
            int Keliling = 2 * phi * jari;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + Keliling);
        }
        else {
            System.out.println("Nomor yang anda masukkan tidak terdaftar.");
        }
        shape.close();
    }
}