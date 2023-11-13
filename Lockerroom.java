
/**
 * Write a description of class locerrom here.
 *
 * @author (Berliani Utami & Riska Haqika Situmorang)
 * @version (13/11/2023)
 */
class LockerRoom extends Fasilitas {
    public LockerRoom() {
        super("Locker Room", 20000.0);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Fasilitas: " + getNama() + ", Harga: Rp " + getHarga());
    }
}
