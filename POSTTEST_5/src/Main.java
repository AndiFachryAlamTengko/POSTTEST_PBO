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

            try {
                System.out.print("Pilih menu : ");
                pilihan = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Input harus angka!");
                continue;
            }

            switch(pilihan){

                case 1:

                    System.out.println("1. Tiket Biasa");
                    System.out.println("2. Tiket VIP");
                    System.out.print("Pilih jenis tiket: ");
                    int jenis = Integer.parseInt(input.nextLine());

                    System.out.print("Kode tiket : ");
                    String kode = input.nextLine();

                    System.out.print("Asal : ");
                    String asal = input.nextLine();

                    System.out.print("Tujuan : ");
                    String tujuan = input.nextLine();

                    System.out.print("Harga : ");
                    int harga = Integer.parseInt(input.nextLine());

                    if(jenis == 1){
                        System.out.print("Maskapai : ");
                        String maskapai = input.nextLine();

                        TiketPesawat tiket = new TiketPesawat(kode, maskapai, asal, tujuan, harga);
                        sistem.tambahTiket(tiket);

                    }else{
                        System.out.print("Fasilitas VIP : ");
                        String fasilitas = input.nextLine();

                        TiketVIP tiket = new TiketVIP(kode, asal, tujuan, harga, fasilitas);
                        sistem.tambahTiket(tiket);
                    }

                    break;

                case 2:
                    sistem.tampilkanTiket();
                    break;

                case 3:
                    System.out.print("Masukkan index : ");
                    int index = Integer.parseInt(input.nextLine());
                    sistem.hapusTiket(index);
                    break;

            }

        }while(pilihan != 4);

        System.out.println("Program selesai");
    }
}