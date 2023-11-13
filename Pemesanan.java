
/**
 * Write a description of class Pemesanan here.
 *
 * @author (Berliani Utami & Riska Hakiqa Situmorang)
 * @version (13/11/2023)
 */
import java.util.ArrayList;
import java.util.List;
class Pemesanan {
    private List<Pengunjung> pengunjung = new ArrayList<>();
    private List<Fasilitas> fasilitasTerpilih = new ArrayList<>();
    private double totalBiayaTiket = 0.0;
    private double totalBiayaFasilitas = 0.0;

    public void tambahkanPengunjung(Pengunjung pengunjung) {
        this.pengunjung.add(pengunjung);
    }

    public void tambahkanFasilitas(Fasilitas fasilitas) {
        fasilitasTerpilih.add(fasilitas);
    }

    public void hitungTotalBiaya(Waterboom waterboom) {
        totalBiayaTiket = 0.0;
        totalBiayaFasilitas = 0.0;

        boolean isVIP = pengunjung.size() > 0 && pengunjung.get(0) instanceof PengunjungVIP;

        for (Pengunjung pengunjung : this.pengunjung) {
            double hargaTiket = waterboom.hitungHargaTiket(pengunjung.getUsia());
            totalBiayaTiket += hargaTiket;
        }

        for (Fasilitas fasilitas : fasilitasTerpilih) {
            // Jika pengunjung VIP dan fasilitas bukan Spa atau Pijat, tambahkan biaya
            if (isVIP && !(fasilitas instanceof Spa || fasilitas instanceof Pijat)) {
                totalBiayaFasilitas += fasilitas.getHarga();
            }
        }
    }

    public List<Pengunjung> getPengunjung() {
        return pengunjung;
    }

    public List<Fasilitas> getFasilitasTerpilih() {
        return fasilitasTerpilih;
    }

    public double getTotalBiayaTiket() {
        return totalBiayaTiket;
    }

    public double getTotalBiayaFasilitas() {
        return totalBiayaFasilitas;
    }

    public double getTotalBiayaKeseluruhan() {
        return totalBiayaTiket + totalBiayaFasilitas;
    }
}

