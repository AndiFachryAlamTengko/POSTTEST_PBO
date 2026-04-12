# Sistem Pemesanan Tiket Pesawat (Java)

## Deskripsi

Program ini merupakan aplikasi sederhana berbasis Java yang digunakan untuk mengelola data pemesanan tiket pesawat melalui terminal/console. Program ini dibuat untuk memenuhi tugas praktikum dengan menerapkan konsep OOP, khususnya **Inheritance** dan **Polymorphism**.

Program memungkinkan user untuk menambahkan data tiket, melihat daftar tiket, dan menghapus data tiket.

---

## Fitur Program

* Tambah data tiket (Tiket biasa & VIP)
* Menampilkan seluruh data tiket
* Menghapus data tiket berdasarkan index
* Validasi input sederhana
* Penerapan konsep OOP (Inheritance & Polymorphism)

---

## Struktur Class

* `Tiket` → sebagai parent class
* `TiketPesawat` → child class (tiket biasa)
* `TiketVIP` → child class (tiket VIP)
* `SistemTiket` → mengelola data tiket
* `Main` → menjalankan program

---

## Konsep OOP yang Digunakan

### 1. Inheritance

Class `TiketPesawat` dan `TiketVIP` merupakan turunan dari class `Tiket`.

### 2. Polymorphism

* **Overriding**:
  Method `tampilkanInfo()` di override pada class `TiketPesawat` dan `TiketVIP` untuk menampilkan informasi tambahan.

* **Overloading**:
  Method `tampilkanInfo(String tambahan)` pada class `Tiket` digunakan untuk menambahkan informasi tambahan (catatan).

---

## Cara Menjalankan Program

1. Pastikan Java sudah terinstall
2. Buka project di IDE (NetBeans / IntelliJ / VS Code)
3. Jalankan file `Main.java`
4. Ikuti menu yang tersedia di console

---

## Contoh Output

```
=== Sistem Pemesanan Tiket Pesawat ===
1. Tambah Tiket
2. Lihat Tiket
3. Hapus Tiket
4. Keluar
```

---

## Catatan

Program ini masih sederhana dan dapat dikembangkan lebih lanjut, misalnya dengan menambahkan fitur edit data, penyimpanan ke database, atau tampilan GUI.

---

## Penutup

Program ini dibuat sebagai latihan untuk memahami konsep dasar OOP dalam Java, terutama inheritance dan polymorphism. Diharapkan program ini dapat membantu dalam memahami materi yang telah dipelajari.

---
