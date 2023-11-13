
/**
 * Write a description of class towel here.
 *
 * @author (Berliani Utami & Riska Haqika situmorang)
 * @version (13 November 2023)
 */
class BathTowel extends Fasilitas {
    public BathTowel() {
        super("Bath Towel", 20000.0);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Fasilitas: " + getNama() + ", Harga: Rp " + getHarga());
    }
}
