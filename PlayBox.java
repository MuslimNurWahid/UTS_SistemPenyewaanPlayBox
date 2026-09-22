package UTS_penyewaanplaybox;

public class PlayBox {
    private String idPlayBox;
    private String nama;
    protected double hargaSewaPerJam;
    private boolean tersedia;

    public PlayBox(String idPlayBox, String nama, double hargaSewaPerJam) {
        this.idPlayBox = idPlayBox;
        this.nama = nama;
        this.hargaSewaPerJam = hargaSewaPerJam;
        this.tersedia = true;
    }

    public String getIdPlayBox() {
        return idPlayBox;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaSewaPerJam() {
        return hargaSewaPerJam;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public double hitungBiaya(int jam) {
        return hargaSewaPerJam * jam;
    }

    public double hitungBiaya(int jam, double diskon) {
        double total = hargaSewaPerJam * jam;
        return total - diskon;
    }

    public String getStatus() {
        if (tersedia) {
            return "Tersedia";
        } else {
            return "Disewa";
        }
    }
}
