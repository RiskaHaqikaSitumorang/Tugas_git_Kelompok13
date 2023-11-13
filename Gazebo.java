
/**
 * Write a description of class Gazebo here.
 *
 * @author (Berliani Utami & Riska Haqika Situmorang)
 * @version (13 November 2023)
 */
class Gazebo extends Fasilitas {
    public Gazebo() {
        super("Gazebo", 50000.0);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Fasilitas: " + getNama() + ", Harga: Rp " + getHarga());
    }
}
