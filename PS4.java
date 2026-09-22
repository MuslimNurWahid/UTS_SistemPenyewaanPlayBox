package UTS_penyewaanplaybox;

public class PS4 extends PlayBox {
    
    private int jumlahStik;

    public PS4(String idPlayBox,
               String nama,
               double hargaSewaPerJam,
               int jumlahStik) {

        super(idPlayBox, nama, hargaSewaPerJam);
        this.jumlahStik = jumlahStik;
    }

    public int getJumlahStik() {
        return jumlahStik;
    }

    @Override
    public double hitungBiaya(int jam) {
        return hargaSewaPerJam * jam;
    }
}
