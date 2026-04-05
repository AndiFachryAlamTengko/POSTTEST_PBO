import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        SistemTiket sistem = new SistemTiket();

        int pilihan = 0;

        do{

            System.out.println("=== Sistem Pemesanan Tiket Pesawat ===");
            System.out.println("1. Tambah Tiket");
            System.out.println("2. Lihat Tiket");
            System.out.println("3. Hapus Tiket");
            System.out.println("4. Keluar");

            // VALIDASI MENU
            while (true) {
                try {
                    System.out.print("Pilih menu : ");
                    pilihan = Integer.parseInt(input.nextLine());

                    if (pilihan >= 1 && pilihan <= 4) break;
                    else System.out.println("Pilihan harus 1-4!");

                } catch (Exception e) {
                    System.out.println("Input harus angka!");
                }
            }

            switch(pilihan){

                case 1:

                    int jenis = 0;

                    // VALIDASI JENIS TIKET
                    while (true) {
                        try {
                            System.out.println("1. Tiket Biasa");
                            System.out.println("2. Tiket VIP");
                            System.out.print("Pilih jenis tiket: ");
                            jenis = Integer.parseInt(input.nextLine());

                            if (jenis == 1 || jenis == 2) break;
                            else System.out.println("Pilih 1 atau 2!");

                        } catch (Exception e) {
                            System.out.println("Input harus angka!");
                        }
                    }

                    // VALIDASI INPUT STRING
                    String kode;
                    do {
                        System.out.print("Kode tiket : ");
                        kode = input.nextLine();
                        if (kode.isEmpty()) System.out.println("Tidak boleh kosong!");
                    } while (kode.isEmpty());

                    String asal;
                    do {
                        System.out.print("Asal : ");
                        asal = input.nextLine();
                        if (asal.isEmpty()) System.out.println("Tidak boleh kosong!");
                    } while (asal.isEmpty());

                    String tujuan;
                    do {
                        System.out.print("Tujuan : ");
                        tujuan = input.nextLine();
                        if (tujuan.isEmpty()) System.out.println("Tidak boleh kosong!");
                    } while (tujuan.isEmpty());

                    // VALIDASI HARGA
                    int harga = 0;
                    while (true) {
                        try {
                            System.out.print("Harga : ");
                            harga = Integer.parseInt(input.nextLine());

                            if (harga > 0) break;
                            else System.out.println("Harga harus lebih dari 0!");

                        } catch (Exception e) {
                            System.out.println("Harga harus angka!");
                        }
                    }

                    if(jenis == 1){

                        String maskapai;
                        do {
                            System.out.print("Maskapai : ");
                            maskapai = input.nextLine();
                            if (maskapai.isEmpty()) System.out.println("Tidak boleh kosong!");
                        } while (maskapai.isEmpty());

                        TiketPesawat tiket = new TiketPesawat(kode, maskapai, asal, tujuan, harga);
                        sistem.tambahTiket(tiket);

                    }else{

                        String fasilitas;
                        do {
                            System.out.print("Fasilitas VIP : ");
                            fasilitas = input.nextLine();
                            if (fasilitas.isEmpty()) System.out.println("Tidak boleh kosong!");
                        } while (fasilitas.isEmpty());

                        TiketVIP tiket = new TiketVIP(kode, asal, tujuan, harga, fasilitas);
                        sistem.tambahTiket(tiket);
                    }

                    break;

                case 2:
                    sistem.tampilkanTiket();
                    break;

                case 3:

                    if (sistem.daftarTiket.isEmpty()) {
                        System.out.println("Data tiket kosong!");
                        break;
                    }

                    int index = -1;

                    while (true) {
                        try {
                            System.out.print("Masukkan index tiket : ");
                            index = Integer.parseInt(input.nextLine());

                            if (index >= 0 && index < sistem.daftarTiket.size()) break;
                            else System.out.println("Index tidak valid!");

                        } catch (Exception e) {
                            System.out.println("Input harus angka!");
                        }
                    }

                    sistem.hapusTiket(index);
                    break;

            }

        }while(pilihan != 4);

        System.out.println("Program selesai");
    }
}