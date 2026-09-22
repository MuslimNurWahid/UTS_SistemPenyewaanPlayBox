# Sistem Penyewaan PlayBox

#### Nama: Muslim Nur Wahid
#### NIM: 2209116070
#### Mata Kuliah: Pemrograman Berorientasi Objek

## 1. Deskripsi Proyek

Sistem Penyewaan PlayBox merupakan aplikasi berbasis Command Line Interface (CLI) yang dibuat menggunakan bahasa pemrograman Java.

Program ini digunakan untuk membantu proses pengelolaan penyewaan PlayBox, mulai dari pengelolaan data PlayBox, data pelanggan, proses penyewaan, transaksi, pembayaran, hingga pengembalian PlayBox.

Aplikasi ini dibuat untuk menerapkan konsep dasar Pemrograman Berorientasi Objek (OOP) dalam Java.

### Fitur Program

- Melihat data PlayBox
- Menambahkan data pelanggan
- Melihat data pelanggan
- Melakukan penyewaan PlayBox
- Melihat data transaksi
- Melakukan pembayaran
- Melakukan pengembalian PlayBox
- Menampilkan status ketersediaan PlayBox

## 2. Konsep OOP yang Digunakan

### Inheritance

Inheritance diterapkan pada beberapa class.

Hubungan inheritance yang digunakan:

- PS4 extends PlayBox
- PS5 extends PlayBox
- PembayaranCash extends Pembayaran

Dengan inheritance tersebut, class PS4 dan PS5 dapat menggunakan atribut dan method dari class PlayBox. Class PembayaranCash juga mewarisi method dari class Pembayaran.

### Polymorphism

Polymorphism diterapkan melalui method overriding dan method overloading.

### Method Overriding

Method hitungBiaya() pada class PlayBox dioverride oleh class PS4 dan PS5.

Method prosesPembayaran() pada class Pembayaran dioverride oleh class PembayaranCash.

### Method Overloading

Method hitungBiaya() pada class PlayBox memiliki dua bentuk:

hitungBiaya(int jam)

dan

hitungBiaya(int jam, double diskon)

Keduanya memiliki nama method yang sama tetapi parameter yang berbeda.

### Condition

Percabangan if, else if, dan else digunakan untuk berbagai proses, seperti:

- Memeriksa ketersediaan PlayBox.
- Memeriksa keberadaan pelanggan.
- Memeriksa keberadaan transaksi.
- Memeriksa kecukupan uang pembayaran.
- Memeriksa status pengembalian.

### Looping

Looping digunakan untuk menjalankan menu secara berulang menggunakan do-while.

Looping for juga digunakan untuk mencari dan menampilkan data PlayBox, pelanggan, dan transaksi.

## 3. Class Diagram

![Class Diagram](https://github.com/MuslimNurWahid/UTS_SistemPenyewaanPlayBox/blob/main/PenyewaanPlayBox.drawio.png)

## 4. Alur Program

Alur penggunaan program adalah sebagai berikut:

1. Program dijalankan melalui Main.java.
2. Program menampilkan menu utama.
3. Pengguna memilih menu yang tersedia.
4. Pengguna dapat melihat daftar PlayBox.
5. Pengguna menambahkan data pelanggan.
6. Pengguna memilih pelanggan yang akan melakukan penyewaan.
7. Pengguna memilih PlayBox yang tersedia.
8. Pengguna memasukkan lama penyewaan.
9. Sistem menghitung total biaya penyewaan.
10. Data penyewaan disimpan sebagai transaksi.
11. Status PlayBox berubah menjadi Disewa.
12. Pengguna dapat melihat data transaksi.
13. Pengguna melakukan pembayaran.
14. Sistem menghitung pembayaran dan kembalian.
15. Setelah PlayBox dikembalikan, status PlayBox berubah menjadi Tersedia.
16. Pengguna dapat keluar melalui menu 8. Keluar.

Alur Singkat : Mulai, Menu Utama, Lihat PlayBox, Tambah Pelanggan, Pilih Pelanggan, Pilih PlayBox, Masukkan Lama Sewa, Hitung Total Harga, Simpan Transaksi, Pembayaran, Pengembalian PlayBox, Status Menjadi Tersedia, Selesai

## 5. Cara Menjalankan Program

Program dijalankan menggunakan Apache NetBeans.

Langkah menjalankan:

1. Buka project SistemPenyewaanPlayBox di Apache NetBeans.
2. Pastikan semua class berada dalam package penyewaanplaybox.
3. Buka file Main.java.
4. Klik kanan Main.java.
5. Pilih Run File.
6. Program akan menampilkan menu utama pada bagian Output.
7. Masukkan nomor menu sesuai kebutuhan.

## 6. Screenshot Output

### Menu Utama

Screenshot berikut menunjukkan tampilan menu utama program.
![Menu Utama](https://github.com/MuslimNurWahid/UTS_SistemPenyewaanPlayBox/blob/main/Tampilan%20Menu.png)

### Data PlayBox

Screenshot berikut menunjukkan daftar PlayBox yang tersedia beserta harga sewa dan statusnya.
![Data PlayBox](https://github.com/MuslimNurWahid/UTS_SistemPenyewaanPlayBox/blob/main/Data%20PlayBox.png)

### Tambah Pelanggan

Screenshot berikut menunjukkan proses penambahan data pelanggan.
![Tambah_Pelanggan](https://github.com/MuslimNurWahid/UTS_SistemPenyewaanPlayBox/blob/main/Tambah%20Pelanggan.png)

### Penyewaan PlayBox

Screenshot berikut menunjukkan proses penyewaan PlayBox dan perhitungan total harga.
![Penyewaan_PlayBox](https://github.com/MuslimNurWahid/UTS_SistemPenyewaanPlayBox/blob/main/Sewa%20PlayBox.png)

### Data Transaksi

Screenshot berikut menunjukkan data transaksi penyewaan yang telah dilakukan.
![Data_Transaksi](https://github.com/MuslimNurWahid/UTS_SistemPenyewaanPlayBox/blob/main/Lihat%20Transaksi.png)

### Pembayaran

Screenshot berikut menunjukkan proses pembayaran dan perhitungan kembalian.
![Pembayaran](https://github.com/MuslimNurWahid/UTS_SistemPenyewaanPlayBox/blob/main/Pembayaran.png)

### Pengembalian

Screenshot berikut menunjukkan proses pengembalian PlayBox dan perubahan status PlayBox menjadi tersedia.
![Pengembalian](https://github.com/MuslimNurWahid/UTS_SistemPenyewaanPlayBox/blob/main/Pengembalian%20PlayBox.png)
