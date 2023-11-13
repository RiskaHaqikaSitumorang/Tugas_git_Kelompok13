
/**
 * Write a description of class WaterboomMain here.
 *
 * @author (berliani Utami & Riska Haqika Situmorang)
 * @version (13 November 2023)
 */
import java.util.Scanner;
public class MainWaterboom {
    public static void main(String[] args) {
        Waterboom waterboom = new Waterboom();
        Pemesanan pemesanan = new Pemesanan();

        System.out.println("Selamat datang di Waterboom!");
        waterboom.tampilkanWahana();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pengunjung: ");
        String namaPengunjung = scanner.nextLine();

        System.out.print("Apakah pengunjung VIP? (y/n): ");
        String isVIPInput = scanner.nextLine().toLowerCase();
        boolean isVIP = isVIPInput.equals("y");

        System.out.print("Masukkan usia pengunjung: ");
        int usiaPengunjung = scanner.nextInt();
        scanner.nextLine();

        Pengunjung pengunjung;
        if (isVIP) {
            pengunjung = new PengunjungVIP(namaPengunjung, usiaPengunjung, true);
        } else {
            pengunjung = new Pengunjung(namaPengunjung, usiaPengunjung);
        }

        System.out.println("Daftar Fasilitas:");
        System.out.println("1. Gazebo - Harga: Rp 50,000");
        System.out.println("2. Bath Towel - Harga: Rp 20,000");
        System.out.println("3. Locker Room - Harga: Rp 20,000");
        System.out.println("4. Spa - Harga: Rp 100,000");
        System.out.println("5. Pijat - Harga: Rp 120,000");
        System.out.print("Pilih fasilitas (1/2/3/4/5) atau 0 untuk selesai: ");
        int pilihanFasilitas = scanner.nextInt();
        scanner.nextLine();

        while (pilihanFasilitas != 0) {
            switch (pilihanFasilitas) {
                case 1:
                    pemesanan.tambahkanFasilitas(new Gazebo());
                    break;
                case 2:
                    pemesanan.tambahkanFasilitas(new BathTowel());
                    break;
                case 3:
                    pemesanan.tambahkanFasilitas(new LockerRoom());
                    break;
                case 4:
                    pemesanan.tambahkanFasilitas(new Spa());
                    break;
                case 5:
                    pemesanan.tambahkanFasilitas(new Pijat());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.print("Pilih fasilitas (1/2/3/4/5) atau 0 untuk selesai: ");
            pilihanFasilitas = scanner.nextInt();
            scanner.nextLine();
        }

        pemesanan.tambahkanPengunjung(pengunjung);
        pemesanan.hitungTotalBiaya(waterboom);

        System.out.println("\nDetail Pemesanan:");
        for (Pengunjung p : pemesanan.getPengunjung()) {
            System.out.println("Pengunjung: " + p.getNama() + ", Usia: " + p.getUsia() + " tahun");
            if (p instanceof PengunjungVIP) {
                System.out.println("Status: VIP Member");
            }
        }

        System.out.println("Fasilitas Terpilih:");
        for (Fasilitas fasilitas : pemesanan.getFasilitasTerpilih()) {
            fasilitas.tampilkanDetail();
        }

        System.out.println("Total Biaya Tiket : Rp " + pemesanan.getTotalBiayaTiket());
        System.out.println("Total Biaya Fasilitas: Rp " + pemesanan.getTotalBiayaFasilitas());
        System.out.println("Total Biaya Keseluruhan: Rp " + pemesanan.getTotalBiayaKeseluruhan());

        scanner.close();
    }
}
