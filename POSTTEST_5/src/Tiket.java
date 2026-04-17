public abstract class Tiket {

    protected String kodeTiket;
    protected String asal;
    protected String tujuan;
    protected int harga;

    public Tiket(String kodeTiket, String asal, String tujuan, int harga){
        this.kodeTiket = kodeTiket;
        this.asal = asal;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getKodeTiket(){ return kodeTiket; }
    public String getAsal(){ return asal; }
    public String getTujuan(){ return tujuan; }
    public int getHarga(){ return harga; }

    // ABSTRACT METHOD
    public abstract int hitungHarga();

    public void tampilkanInfo(){
        System.out.println("Kode Tiket : " + kodeTiket);
        System.out.println("Asal : " + asal);
        System.out.println("Tujuan : " + tujuan);
        System.out.println("Harga : " + harga);
    }

    public void tampilkanInfo(String tambahan){
        tampilkanInfo();
        System.out.println("Catatan : " + tambahan);
    }
}