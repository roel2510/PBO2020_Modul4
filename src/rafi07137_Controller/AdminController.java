
package rafi07137_Controller;
import java.util.ArrayList;
import java.util.Date;
import rafi07137_Entity.Rafi07137_Anjing;
import rafi07137_Entity.Rafi07137_Kucing;
import rafi07137_model.rafi07137_pesanan;

public class AdminController {

    public void insertKucing(Rafi07137_Kucing pesan){
       AllObject.pesan.dataKucing(pesan);
    }
    public void insertAnjing(Rafi07137_Anjing pesan){
        AllObject.pesan.dataAnjing(pesan);
    }
    public void Ambil(String rafi07137_nama,Date rafi07137_tanggalambil){
        AllObject.pesan.remove(rafi07137_nama, rafi07137_tanggalambil);
    }
    public void updateTgl(Date rafi07137_tanggalambil,Date newtglambil){
        AllObject.pesan.update(rafi07137_tanggalambil,newtglambil);
    }
    public void Tampil(){
        AllObject.pesan.view();
    }
    public ArrayList<Rafi07137_Kucing>viewkucing(){
        return AllObject.pesan.dataKucing;
    }
    public ArrayList<Rafi07137_Anjing>viewanjing(){
        return AllObject.pesan.dataAnjing;
    }

    public ArrayList<Rafi07137_Kucing> getKucing(){
        return AllObject.pesan.getArrKucing();
    }
    public ArrayList<Rafi07137_Anjing> getAnjing(){
        return AllObject.pesan.getArrAnjing();
    }
}
 



