
/**
 * Write a description of class Waterboom here.
 *
 * @author (Berliani Utami & Riska Haqika Situmorang)
 * @version (13 November 2023)
 */
class Waterboom {
    private String[] wahana = {"Twin Racers", "Flow Rider", "Climax", "EuroBungi"};
    private double tiketAnak = 135000.0;
    private double tiketDewasa = 175000.0;

    public void tampilkanWahana() {
        System.out.println("Daftar Wahana:");
        for (int i = 0; i < wahana.length; i++) {
            System.out.println((i + 1) + ". " + wahana[i] + " - " + getDeskripsiWahana(wahana[i]));
        }
    }

    public double hitungHargaTiket(int usia) {
        return (usia < 12) ? tiketAnak : tiketDewasa;
    }

    private String getDeskripsiWahana(String namaWahana) {
        switch (namaWahana) {
            case "Twin Racers":
                return "Wahana seluncur ganda seru.";
            case "Flow Rider":
                return "Wahana ombak buatan untuk berselancar.";
            case "Climax":
                return "Wahana seluncur tertinggi dan tercepat.";
            case "EuroBungi":
                return "Wahana melompat yang mendebarkan.";
            default:
                return "Deskripsi wahana tidak tersedia.";
        }
    }
}
