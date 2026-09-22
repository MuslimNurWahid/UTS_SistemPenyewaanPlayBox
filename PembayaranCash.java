package UTS_penyewaanplaybox;

public class PembayaranCash extends Pembayaran {
    
    @Override
    public void prosesPembayaran(double total, double uang) {

        System.out.println();
        System.out.println("========== PEMBAYARAN CASH ==========");

        if (uang >= total) {

            double kembalian = uang - total;

            System.out.println("Total pembayaran : Rp" + total);
            System.out.println("Uang pelanggan   : Rp" + uang);
            System.out.println("Kembalian        : Rp" + kembalian);
            System.out.println("Pembayaran berhasil!");

        } else {

            double kekurangan = total - uang;

            System.out.println("Total pembayaran : Rp" + total);
            System.out.println("Uang pelanggan   : Rp" + uang);
            System.out.println("Kekurangan       : Rp" + kekurangan);
            System.out.println("Pembayaran gagal!");

        }
    }
}
