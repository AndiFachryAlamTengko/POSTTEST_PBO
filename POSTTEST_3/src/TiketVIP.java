public class TiketVIP extends Tiket {

    private String fasilitas;

    public TiketVIP(String kodeTiket, String asal, String tujuan, int harga, String fasilitas){
        super(kodeTiket, asal, tujuan, harga);
        this.fasilitas = fasilitas;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Fasilitas VIP : " + fasilitas);
    }
}