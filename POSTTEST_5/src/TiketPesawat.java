public class TiketPesawat extends Tiket implements Pembayaran {

    private String maskapai;
    private int total;

    public TiketPesawat(String kodeTiket, String maskapai, String asal, String tujuan, int harga){
        super(kodeTiket, asal, tujuan, harga);
        this.maskapai = maskapai;
    }

    @Override
    public int hitungHarga(){
        total = harga + (harga / 10);
        return total;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Maskapai : " + maskapai);
        System.out.println("Total : " + hitungHarga());
    }

    @Override
    public void prosesBayar(int uang){
        if(uang >= total){
            System.out.println("Pembayaran berhasil");
        }else{
            System.out.println("Uang kurang");
        }
    }

    @Override
    public void cetakStruk(){
        System.out.println("=== STRUK TIKET ===");
        tampilkanInfo();
        System.out.println("Total Bayar : " + total);
    }
}