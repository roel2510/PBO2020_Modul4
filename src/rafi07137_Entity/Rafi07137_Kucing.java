package rafi07137_Entity;
import java.util.Date;
public class Rafi07137_Kucing extends Rafi07137_Hewan {
    private String rafi07137_nama,rafi07137_alamat1,rafi07137_jeniskucing,rafi07137_jeniskelamin;
    public Date rafi07137_tanggalpen;
    public Date rafi07137_tanggalambil;
    public Rafi07137_Kucing( String rafi07137_nama,String rafi07137_alamat1,String rafi07137_jeniskucing,String rafi07137_jeniskelamin,Date rafi07137_tanggalpen,
        Date rafi07137_tanggalambil,String rafi07137_namakucing){
        super(rafi07137_namakucing,rafi07137_namakucing,rafi07137_jeniskucing);            
        this.rafi07137_nama=rafi07137_nama;
        this.rafi07137_alamat1=rafi07137_alamat1;
        this.rafi07137_jeniskucing=rafi07137_jeniskucing;
        this.rafi07137_jeniskelamin=rafi07137_jeniskelamin;
        this.rafi07137_tanggalpen=rafi07137_tanggalpen;
        this.rafi07137_tanggalambil=rafi07137_tanggalambil;  
    }
    public String setNamapel(){
        return this.rafi07137_nama;
    }
    public String setAlamatpel(){
        return this.rafi07137_alamat1;    
    }
    public String setJenisKucing(){
        return this.rafi07137_jeniskucing;
    }    
    public String setJeniskelamin() {
        return this.rafi07137_jeniskelamin;
    }
    public Date setTanggalpen() {
        return this.rafi07137_tanggalpen;
    }
    public Date setTanggalambil() {
        return this.rafi07137_tanggalambil;
    }
    public Date getTanggalambil(){
        return this.rafi07137_tanggalambil;
    }
    public void setTanggalambil(Date tanggalambilK){
        this.rafi07137_tanggalambil = tanggalambilK;
    }
}
    