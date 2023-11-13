/**
 * Write a description of class PengunjungVIP here.
 *
 * @author (Berliani Utami & Riska Haqika Situmorang)
 * @version (13 November 2023)
 */

class PengunjungVIP extends Pengunjung {
    private boolean memberVIP;

    public PengunjungVIP(String nama, int usia, boolean memberVIP) {
        super(nama, usia);
        this.memberVIP = memberVIP;
    }

    public boolean isMemberVIP() {
        return memberVIP;
    }
}
