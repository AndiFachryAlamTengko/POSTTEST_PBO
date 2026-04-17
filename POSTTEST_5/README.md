# ✈️ Sistem Pemesanan Tiket Pesawat (Java)

Program ini merupakan pengembangan dari project sebelumnya yang dibuat menggunakan bahasa Java. Pada versi ini, program sudah menerapkan konsep Pemrograman Berbasis Objek (OOP) yang lebih lengkap, yaitu menggunakan abstract class dan interface.

Program digunakan untuk melakukan pemesanan tiket pesawat secara sederhana. Pengguna dapat menambahkan tiket, melihat daftar tiket, dan menghapus tiket melalui menu yang tersedia.

---

## 🔧 Fitur Program

* Menambahkan tiket (Tiket Biasa & Tiket VIP)
* Menampilkan data tiket
* Menghapus tiket berdasarkan index
* Perhitungan harga otomatis
* Struktur program berbasis OOP

---

## 🧠 Konsep yang Digunakan

### 1. Abstract Class

Class `Tiket` diubah menjadi abstract class. Hal ini bertujuan agar class tersebut hanya menjadi kerangka dasar dan tidak bisa dibuat objek secara langsung.

Di dalam class ini juga terdapat abstract method yaitu:

* `hitungHarga()`

Method ini harus diimplementasikan oleh class turunannya.

---

### 2. Inheritance (Pewarisan)

Program ini menggunakan konsep inheritance, yaitu:

* `TiketPesawat` mewarisi class `Tiket`
* `TiketVIP` mewarisi class `Tiket`

Dengan demikian, class turunan dapat menggunakan atribut dan method dari class induk.

---

### 3. Polymorphism

Polymorphism digunakan pada method:

* `hitungHarga()` → memiliki perhitungan berbeda di tiap class
* `tampilkanInfo()` → menggunakan method overloading

---

### 4. Interface

Program ini menggunakan interface `Pembayaran` yang memiliki dua method:

* `prosesBayar()`
* `cetakStruk()`

Interface ini diimplementasikan pada:

* `TiketPesawat`
* `TiketVIP`

Tujuannya agar setiap jenis tiket memiliki sistem pembayaran yang sama tetapi bisa dijalankan dengan cara yang berbeda.

---

## 🔄 Cara Kerja Program

1. Program menampilkan menu utama
2. User memilih untuk menambah tiket
3. User memilih jenis tiket (biasa atau VIP)
4. User mengisi data tiket
5. Data disimpan ke dalam ArrayList
6. Data bisa ditampilkan atau dihapus sesuai kebutuhan

---

## ⚠️ Catatan

* Input harus sesuai agar program tidak error
* Index tiket dimulai dari 0
* Pastikan semua file berada dalam satu folder/project

---

## 👨‍💻 Pembuat

Nama  : Andi Fachry Alam Tengko
NIM   : 2409106006
Kelas : A1'24

---

## 🎯 Kesimpulan

Program ini berhasil dikembangkan dengan menambahkan konsep abstract class dan interface. Dengan adanya konsep tersebut, program menjadi lebih terstruktur, fleksibel, dan mudah dikembangkan.

---