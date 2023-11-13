
/**
 * Write a description of class spa here.
 *
 * @author (Berliani Utami & Riska Haqika Situmorang)
 * @version (13/11/2023)
 */


class Spa extends Fasilitas {
    public Spa() {
        super("Spa", 100000.0);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Fasilitas: " + getNama() + ", Harga: Rp " + getHarga());
    }
}
