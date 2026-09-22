package UTS_penyewaanplaybox;

public class Pembayaran {
    
    public void prosesPembayaran(double total, double uang) {

        if (uang >= total) {

            double kembalian = uang - total;

            System.out.println("Pembayaran berhasil.");
            System.out.println("Kembalian : Rp" + kembalian);

        } else {

            System.out.println("Uang tidak mencukupi.");

        }
    }
}
