class TiketPesawat {

    String nama;
    String tujuan;
    int jumlah;
    int harga;

    // constructor
    TiketPesawat(String nama, String tujuan, int jumlah, int harga) {
        this.nama = nama;
        this.tujuan = tujuan;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    void tampilkan() {
        System.out.println("Nama Penumpang : " + nama);
        System.out.println("Tujuan         : " + tujuan);
        System.out.println("Jumlah Tiket   : " + jumlah);
        System.out.println("Harga Tiket    : " + harga);
        System.out.println("-------------------------------");
    }
}