public class TiketPesawat extends Tiket {

    private String maskapai;

    public TiketPesawat(String kodeTiket, String maskapai, String asal, String tujuan, int harga){
        super(kodeTiket, asal, tujuan, harga);
        this.maskapai = maskapai;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Maskapai : " + maskapai);
    }
}