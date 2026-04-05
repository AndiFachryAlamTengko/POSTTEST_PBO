import java.util.ArrayList;

public class SistemTiket {

    public ArrayList<Tiket> daftarTiket = new ArrayList<>();

    public void tambahTiket(Tiket tiket){
        daftarTiket.add(tiket);
        System.out.println("Tiket berhasil ditambahkan");
    }

    public void tampilkanTiket(){

        if(daftarTiket.isEmpty()){
            System.out.println("Data tiket kosong");
        }else{

            for(int i = 0; i < daftarTiket.size(); i++){

                System.out.println("Index : " + i);
                daftarTiket.get(i).tampilkanInfo();
                System.out.println("----------------------");
            }
        }
    }

    public void hapusTiket(int index){

        if(index < daftarTiket.size()){
            daftarTiket.remove(index);
            System.out.println("Tiket berhasil dihapus");
        }else{
            System.out.println("Index tidak ditemukan");
        }
    }
}