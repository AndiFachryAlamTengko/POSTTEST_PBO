public class TiketVIP extends Tiket implements Pembayaran {

    private String fasilitas;
    private int total;

    public TiketVIP(String kodeTiket, String asal, String tujuan, int harga, String fasilitas){
        super(kodeTiket, asal, tujuan, harga);
        this.fasilitas = fasilitas;
    }

    @Override
    public int hitungHarga(){
        total = harga + 500000 + (harga / 10);
        return total;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Fasilitas VIP : " + fasilitas);
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
        System.out.println("=== STRUK TIKET VIP ===");
        tampilkanInfo();
        System.out.println("Total Bayar : " + total);
    }
}