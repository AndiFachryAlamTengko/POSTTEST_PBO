import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<TiketPesawat> dataPesanan = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n===== MENU PEMESANAN TIKET PESAWAT =====");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {

                System.out.print("Nama Penumpang : ");
                String nama = sc.nextLine();

                System.out.print("Tujuan Penerbangan : ");
                String tujuan = sc.nextLine();

                System.out.print("Jumlah Tiket : ");
                int jumlah = sc.nextInt();

                System.out.print("Harga Tiket : ");
                int harga = sc.nextInt();

                TiketPesawat t = new TiketPesawat(nama, tujuan, jumlah, harga);
                dataPesanan.add(t);

                System.out.println("Pesanan berhasil ditambahkan.");

            }

            else if (pilihan == 2) {

                if (dataPesanan.size() == 0) {
                    System.out.println("Belum ada data pemesanan.");
                } else {

                    System.out.println("\nDAFTAR PESANAN TIKET");
                    for (int i = 0; i < dataPesanan.size(); i++) {
                        System.out.println("Data ke-" + (i + 1));
                        dataPesanan.get(i).tampilkan();
                    }

                }

            }

            else if (pilihan == 3) {

                System.out.print("Masukkan nomor data yang ingin diubah : ");
                int index = sc.nextInt();
                sc.nextLine();

                if (index > 0 && index <= dataPesanan.size()) {

                    System.out.print("Nama baru : ");
                    String nama = sc.nextLine();

                    System.out.print("Tujuan baru : ");
                    String tujuan = sc.nextLine();

                    System.out.print("Jumlah tiket baru : ");
                    int jumlah = sc.nextInt();

                    System.out.print("Harga tiket baru : ");
                    int harga = sc.nextInt();

                    dataPesanan.get(index - 1).nama = nama;
                    dataPesanan.get(index - 1).tujuan = tujuan;
                    dataPesanan.get(index - 1).jumlah = jumlah;
                    dataPesanan.get(index - 1).harga = harga;

                    System.out.println("Data berhasil diperbarui.");

                } else {
                    System.out.println("Data tidak ditemukan.");
                }

            }

            else if (pilihan == 4) {

                System.out.print("Masukkan nomor data yang ingin dihapus : ");
                int index = sc.nextInt();

                if (index > 0 && index <= dataPesanan.size()) {

                    dataPesanan.remove(index - 1);
                    System.out.println("Data berhasil dihapus.");

                } else {
                    System.out.println("Data tidak ditemukan.");
                }

            }

        } while (pilihan != 5);

        System.out.println("Program selesai.");
    }
}