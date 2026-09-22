package UTS_penyewaanplaybox;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static Scanner input = new Scanner(System.in);

    static ArrayList<PlayBox> daftarPlayBox = new ArrayList<>();
    static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
    
    public static void main(String[] args) {
        
        dataAwal();

        int pilihan;

        do {

            tampilkanHeader();
            tampilkanMenu();

            System.out.print("Pilih menu : ");

            while (!input.hasNextInt()) {

                System.out.println(
                        "Input harus berupa angka!"
                );

                System.out.print("Pilih menu : ");
                input.next();
            }

            pilihan = input.nextInt();
            input.nextLine();

            System.out.println();

            switch (pilihan) {

                case 1:
                    tampilkanPlayBox();
                    break;

                case 2:
                    tambahPelanggan();
                    break;

                case 3:
                    tampilkanPelanggan();
                    break;

                case 4:
                    sewaPlayBox();
                    break;

                case 5:
                    pengembalianPlayBox();
                    break;

                case 6:
                    tampilkanTransaksi();
                    break;

                case 7:
                    pembayaran();
                    break;

                case 8:

                    System.out.println(
                            "========================================"
                    );

                    System.out.println(
                            "   TERIMA KASIH TELAH MENGGUNAKAN"
                    );

                    System.out.println(
                            "      SISTEM PENYEWAAN PLAYBOX"
                    );

                    System.out.println(
                            "========================================"
                    );

                    break;

                default:

                    System.out.println(
                            "Pilihan menu tidak tersedia!"
                    );
            }

            if (pilihan != 8) {

                System.out.println();
                System.out.println(
                        "Tekan ENTER untuk kembali ke menu..."
                );

                input.nextLine();
            }

        } while (pilihan != 8);
    }

    static void dataAwal() {

        daftarPlayBox.add(
                new PS4(
                        "PB001",
                        "PlayStation 4",
                        5000,
                        2
                )
        );

        daftarPlayBox.add(
                new PS4(
                        "PB002",
                        "PlayStation 4",
                        5000,
                        2
                )
        );

        daftarPlayBox.add(
                new PS5(
                        "PB003",
                        "PlayStation 5",
                        10000,
                        2
                )
        );

        daftarPlayBox.add(
                new PS5(
                        "PB004",
                        "PlayStation 5",
                        10000,
                        2
                )
        );
    }

    static void tampilkanHeader() {

        System.out.println();
        System.out.println(
                "========================================"
        );

        System.out.println(
                "       SISTEM PENYEWAAN PLAYBOX"
        );

        System.out.println(
                "========================================"
        );
    }

    static void tampilkanMenu() {

        System.out.println(
                "1. Lihat Data PlayBox"
        );

        System.out.println(
                "2. Tambah Pelanggan"
        );

        System.out.println(
                "3. Lihat Data Pelanggan"
        );

        System.out.println(
                "4. Sewa PlayBox"
        );

        System.out.println(
                "5. Pengembalian PlayBox"
        );

        System.out.println(
                "6. Lihat Transaksi"
        );

        System.out.println(
                "7. Pembayaran"
        );

        System.out.println(
                "8. Keluar"
        );

        System.out.println(
                "========================================"
        );
    }

    static void tampilkanPlayBox() {

        System.out.println(
                "========== DATA PLAYBOX =========="
        );

        if (daftarPlayBox.isEmpty()) {

            System.out.println(
                    "Belum ada data PlayBox."
            );

            return;
        }

        for (PlayBox p : daftarPlayBox) {

            System.out.println(
                    "ID       : " + p.getIdPlayBox()
            );

            System.out.println(
                    "Nama     : " + p.getNama()
            );

            System.out.println(
                    "Harga    : Rp"
                    + p.getHargaSewaPerJam()
                    + "/jam"
            );

            System.out.println(
                    "Status   : " + p.getStatus()
            );

            if (p instanceof PS4) {

                PS4 ps4 = (PS4) p;

                System.out.println(
                        "Jumlah Stik : "
                        + ps4.getJumlahStik()
                );

            } else if (p instanceof PS5) {

                PS5 ps5 = (PS5) p;

                System.out.println(
                        "Jumlah Stik : "
                        + ps5.getJumlahStik()
                );
            }

            System.out.println(
                    "----------------------------------------"
            );
        }
    }

    static void tambahPelanggan() {

        System.out.println(
                "========== TAMBAH PELANGGAN =========="
        );

        System.out.print(
                "ID Pelanggan : "
        );

        String id = input.nextLine();

        System.out.print(
                "Nama         : "
        );

        String nama = input.nextLine();

        System.out.print(
                "No. Telepon  : "
        );

        String telepon = input.nextLine();

        Pelanggan pelanggan =
                new Pelanggan(
                        id,
                        nama,
                        telepon
                );

        daftarPelanggan.add(pelanggan);

        System.out.println();

        System.out.println(
                "Pelanggan berhasil ditambahkan!"
        );
    }

    static void tampilkanPelanggan() {

        System.out.println(
                "========== DATA PELANGGAN =========="
        );

        if (daftarPelanggan.isEmpty()) {

            System.out.println(
                    "Belum ada data pelanggan."
            );

            return;
        }

        for (Pelanggan p : daftarPelanggan) {

            System.out.println(
                    "ID          : "
                    + p.getIdPelanggan()
            );

            System.out.println(
                    "Nama        : "
                    + p.getNama()
            );

            System.out.println(
                    "No. Telepon : "
                    + p.getNoTelepon()
            );

            System.out.println(
                    "----------------------------------------"
            );
        }
    }

    static void sewaPlayBox() {

        System.out.println(
                "========== PENYEWAAN PLAYBOX =========="
        );

        if (daftarPelanggan.isEmpty()) {

            System.out.println(
                    "Belum ada pelanggan."
            );

            System.out.println(
                    "Silakan tambah pelanggan terlebih dahulu."
            );

            return;
        }

        tampilkanPelanggan();

        System.out.print(
                "Masukkan ID Pelanggan : "
        );

        String idPelanggan =
                input.nextLine();

        Pelanggan pelanggan = null;

        for (Pelanggan p : daftarPelanggan) {

            if (p.getIdPelanggan()
                    .equalsIgnoreCase(idPelanggan)) {

                pelanggan = p;
                break;
            }
        }

        if (pelanggan == null) {

            System.out.println(
                    "Pelanggan tidak ditemukan!"
            );

            return;
        }

        System.out.println();

        tampilkanPlayBox();

        System.out.print(
                "Masukkan ID PlayBox : "
        );

        String idPlayBox =
                input.nextLine();

        PlayBox playBox = null;

        for (PlayBox p : daftarPlayBox) {

            if (p.getIdPlayBox()
                    .equalsIgnoreCase(idPlayBox)) {

                playBox = p;
                break;
            }
        }

        if (playBox == null) {

            System.out.println(
                    "PlayBox tidak ditemukan!"
            );

            return;
        }

        if (!playBox.isTersedia()) {

            System.out.println(
                    "PlayBox sedang disewa!"
            );

            return;
        }

        System.out.print(
                "Lama sewa (jam) : "
        );

        int lamaSewa;

        while (!input.hasNextInt()) {

            System.out.println(
                    "Lama sewa harus berupa angka!"
            );

            input.next();
        }

        lamaSewa = input.nextInt();
        input.nextLine();

        if (lamaSewa <= 0) {

            System.out.println(
                    "Lama sewa harus lebih dari 0 jam!"
            );

            return;
        }

        System.out.print(
                "ID Transaksi    : "
        );

        String idTransaksi =
                input.nextLine();

        Transaksi transaksi =
                new Transaksi(
                        idTransaksi,
                        pelanggan,
                        playBox,
                        lamaSewa
                );

        daftarTransaksi.add(transaksi);

        System.out.println();

        System.out.println(
                "========================================"
        );

        System.out.println(
                "        PENYEWAAN BERHASIL!"
        );

        System.out.println(
                "========================================"
        );

        System.out.println(
                "ID Transaksi : "
                + transaksi.getIdTransaksi()
        );

        System.out.println(
                "Pelanggan    : "
                + transaksi.getPelanggan().getNama()
        );

        System.out.println(
                "PlayBox      : "
                + transaksi.getPlayBox().getNama()
        );

        System.out.println(
                "Lama Sewa    : "
                + transaksi.getLamaSewa()
                + " jam"
        );

        System.out.println(
                "Total Harga  : Rp"
                + transaksi.getTotalHarga()
        );

        System.out.println(
                "========================================"
        );
    }

    static void pengembalianPlayBox() {

        System.out.println(
                "========== PENGEMBALIAN PLAYBOX =========="
        );

        if (daftarTransaksi.isEmpty()) {

            System.out.println(
                    "Belum ada transaksi."
            );

            return;
        }

        System.out.print(
                "Masukkan ID Transaksi : "
        );

        String id = input.nextLine();

        for (Transaksi t : daftarTransaksi) {

            if (t.getIdTransaksi()
                    .equalsIgnoreCase(id)) {

                if (t.isSudahDikembalikan()) {

                    System.out.println(
                            "PlayBox sudah dikembalikan sebelumnya."
                    );

                    return;
                }

                t.kembalikanPlayBox();

                System.out.println();

                System.out.println(
                        "PlayBox berhasil dikembalikan!"
                );

                System.out.println(
                        "Status PlayBox : Tersedia"
                );

                return;
            }
        }

        System.out.println(
                "Transaksi tidak ditemukan!"
        );
    }

    static void tampilkanTransaksi() {

        System.out.println(
                "========== DATA TRANSAKSI =========="
        );

        if (daftarTransaksi.isEmpty()) {

            System.out.println(
                    "Belum ada transaksi."
            );

            return;
        }

        for (Transaksi t : daftarTransaksi) {

            System.out.println(
                    "ID Transaksi : "
                    + t.getIdTransaksi()
            );

            System.out.println(
                    "Pelanggan    : "
                    + t.getPelanggan().getNama()
            );

            System.out.println(
                    "PlayBox      : "
                    + t.getPlayBox().getNama()
            );

            System.out.println(
                    "Lama Sewa    : "
                    + t.getLamaSewa()
                    + " jam"
            );

            System.out.println(
                    "Total Harga  : Rp"
                    + t.getTotalHarga()
            );

            System.out.println(
                    "Status       : "
                    + t.getStatusPengembalian()
            );

            System.out.println(
                    "----------------------------------------"
            );
        }
    }

    static void pembayaran() {

        System.out.println(
                "========== PEMBAYARAN =========="
        );

        if (daftarTransaksi.isEmpty()) {

            System.out.println(
                    "Belum ada transaksi."
            );

            return;
        }

        System.out.print(
                "Masukkan ID Transaksi : "
        );

        String id = input.nextLine();

        Transaksi transaksi = null;

        for (Transaksi t : daftarTransaksi) {

            if (t.getIdTransaksi()
                    .equalsIgnoreCase(id)) {

                transaksi = t;
                break;
            }
        }

        if (transaksi == null) {

            System.out.println(
                    "Transaksi tidak ditemukan!"
            );

            return;
        }

        System.out.println();

        System.out.println(
                "Total pembayaran : Rp"
                + transaksi.getTotalHarga()
        );

        System.out.print(
                "Uang pelanggan   : Rp"
        );

        while (!input.hasNextDouble()) {

            System.out.println(
                    "Input harus berupa angka!"
            );

            System.out.print(
                    "Uang pelanggan   : Rp"
            );

            input.next();
        }

        double uang = input.nextDouble();
        input.nextLine();

        Pembayaran pembayaran =
                new PembayaranCash();

        pembayaran.prosesPembayaran(
                transaksi.getTotalHarga(),
                uang
        );
    }
    
}
