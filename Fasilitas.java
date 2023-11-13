/**
 * Write a description of class Fasilitas here.
 *
 * @author (Berliani Utami & Riska Haqika Situmorang)
 * @version (13 November 2023)
 */

abstract class Fasilitas {
    private String nama;
    private double harga;

    public Fasilitas(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public abstract void tampilkanDetail();
}
