package TugasAkhirKelompokPDPL.CobaBuilder;

public class BangunDatarBuilder {

    public static BangunDatar create(String inputan) {
        
        if (inputan.equals("1") || inputan.toLowerCase().equals("persegi")) {
            return new Persegi();
        } else if (inputan.equals("2") || inputan.toLowerCase().equals("persegi panjang")) {
            return new PersegiPanjang();
        } else if (inputan.equals("3") || inputan.toLowerCase().equals("lingkaran")) {
            return new Lingkaran();
        } else {
            return null;
        }
    }
}
