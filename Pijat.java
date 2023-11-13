
/**
 * Write a description of class pijat here.
 *
 * @author (Berliani Utami & Riska Haqika Situmorang)
 * @version (13/11/2023)
 */
class Pijat extends Fasilitas {
    public Pijat() {
        super("Pijat", 120000.0);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Fasilitas: " + getNama() + ", Harga: Rp " + getHarga());
    }
}
