package rafi07137_Entity;
import java.util.Date;
public class Rafi07137_Anjing extends Rafi07137_Hewan {
    private String rafi07137_nama,rafi07137_alamat2,rafi07137_namaanjing,rafi07137_jenisanjing,rafi07137_jeniskelamin;
    public Date rafi07137_tanggalpen;
    public Date rafi07137_tanggalambil;
    public Rafi07137_Anjing(String rafi07137_nama,String rafi07137_alamat2, String rafi07137_jenisanjing, String rafi07137_jeniskelamin, Date rafi07137_tanggalpen, 
            Date rafi07137_tanggalambil,String rafi07137_namaanjing){    
        super(rafi07137_namaanjing,rafi07137_namaanjing,rafi07137_jenisanjing);              
        this.rafi07137_nama = rafi07137_nama;
        this.rafi07137_alamat2 = rafi07137_alamat2;
        this.rafi07137_jenisanjing = rafi07137_jenisanjing;
        this.rafi07137_jeniskelamin = rafi07137_jeniskelamin;
        this.rafi07137_tanggalpen = rafi07137_tanggalpen;
        this.rafi07137_tanggalambil = rafi07137_tanggalambil;
    }
    public String setNamapel(){
        return this.rafi07137_nama;
    }
    public String setAlamatpel(){
        return this.rafi07137_alamat2;
    }
    public String setJenisAnjing() {
        return this.rafi07137_jenisanjing;
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
    public Date getTanggalambil() {
        return this.rafi07137_tanggalambil;
    }
    public void setTanggalambil(Date tanggalambilA){
        this.rafi07137_tanggalambil = tanggalambilA;
    }
}