# Sistem Pemesanan Tiket Pesawat (PBO)

## Deskripsi

Program ini merupakan sistem sederhana berbasis Java untuk mengelola pemesanan tiket pesawat.
Program dibuat menggunakan konsep Object Oriented Programming (OOP), khususnya **inheritance**, serta dilengkapi dengan **error handling** agar input dari pengguna lebih aman dan tidak menyebabkan error.

---

## Fitur Program

* Menambahkan data tiket (Tiket Biasa & Tiket VIP)
* Menampilkan daftar tiket
* Menghapus tiket berdasarkan index
* Validasi input pengguna (tidak bisa asal input)

---

## Konsep OOP yang Digunakan

### 1. Inheritance

Program ini menerapkan konsep inheritance dengan struktur sebagai berikut:

* **Superclass (Parent):**

  * `Tiket`

* **Subclass (Child):**

  * `TiketPesawat`
  * `TiketVIP`

Subclass mewarisi atribut dan method dari superclass, sehingga mengurangi duplikasi kode.

---

### 2. Tipe Inheritance

Menggunakan **Single Inheritance**, yaitu satu subclass hanya memiliki satu superclass.

---

### 3. Method Overriding

Method `tampilkanInfo()` dioverride pada setiap subclass untuk menampilkan informasi tambahan sesuai jenis tiket.

---

## Error Handling & Validasi

Program ini sudah dilengkapi dengan error handling untuk mencegah kesalahan input dari pengguna, antara lain:

* Input menu harus berupa angka (1-4)
* Input jenis tiket harus sesuai pilihan
* Tidak menerima input kosong
* Harga harus berupa angka dan lebih dari 0
* Index tiket tidak boleh melebihi jumlah data
* Program tidak akan crash jika user salah input

Dengan adanya validasi ini, program menjadi lebih stabil dan user-friendly.

---

## Struktur Project

```
Main.java
SistemTiket.java
Tiket.java
TiketPesawat.java
TiketVIP.java
```

---

## Cara Menjalankan Program

1. Buka terminal / CMD pada folder project
2. Compile semua file Java:

   ```
   javac *.java
   ```
3. Jalankan program:

   ```
   java Main
   ```

---

## Contoh Alur Program

1. User memilih menu tambah tiket
2. Memilih jenis tiket (Biasa / VIP)
3. Menginput data tiket
4. Data disimpan ke dalam sistem
5. User dapat melihat atau menghapus data tiket

---

## Kelebihan Program

* Menggunakan konsep OOP (Inheritance)
* Struktur kode lebih rapi dan modular
* Memiliki lebih dari 1 subclass (poin plus)
* Input sudah divalidasi dengan baik
* Tidak mudah error saat dijalankan

---

## Kesimpulan

Program ini berhasil mengimplementasikan konsep inheritance secara logis dalam sistem pemesanan tiket pesawat.
Dengan tambahan error handling, program menjadi lebih aman, stabil, dan mudah digunakan.

---

## Catatan

Program ini dibuat untuk memenuhi tugas praktikum Pemrograman Berbasis Objek (PBO).