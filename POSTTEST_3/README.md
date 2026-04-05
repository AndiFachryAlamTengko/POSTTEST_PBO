# Sistem Pemesanan Tiket Pesawat (PBO)

## Deskripsi
Program ini merupakan sistem sederhana untuk mengelola pemesanan tiket pesawat menggunakan bahasa Java. Program ini menerapkan konsep Object Oriented Programming (OOP), khususnya inheritance.

## Fitur
- Tambah tiket (Tiket biasa & VIP)
- Lihat daftar tiket
- Hapus tiket berdasarkan index

## Konsep OOP yang Digunakan

### 1. Inheritance
Program ini menggunakan inheritance dengan struktur:

- **Superclass (Parent):**
  - Tiket

- **Subclass (Child):**
  - TiketPesawat
  - TiketVIP

### 2. Tipe Inheritance
Menggunakan **Single Inheritance**, dimana subclass mewarisi atribut dan method dari superclass.

### 3. Method Overriding
Method `tampilkanInfo()` dioverride pada setiap subclass untuk menampilkan informasi tambahan.

## Struktur Program