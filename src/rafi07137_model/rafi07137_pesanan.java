package rafi07137_model;


import rafi07137_Entity.Rafi07137_Anjing;
import rafi07137_Entity.Rafi07137_Kucing;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class rafi07137_pesanan implements rafi07137_layanan {
    public ArrayList<Rafi07137_Kucing> dataKucing;
    public ArrayList<Rafi07137_Anjing> dataAnjing;
    static Scanner input = new Scanner(System.in);
    
    public rafi07137_pesanan(){
        this.dataKucing = new ArrayList<>();
        this.dataAnjing = new ArrayList<>();
    }
    public void dataKucing (Rafi07137_Kucing pesan){
        dataKucing.add(pesan);
        
    }
    public void dataAnjing (Rafi07137_Anjing pesan){
        dataAnjing.add(pesan);
    }
    public ArrayList<Rafi07137_Kucing>viewkucing(){
        return dataKucing;
    }
    public ArrayList<Rafi07137_Anjing>viewanjing(){
        return dataAnjing;
    }
    
    public ArrayList<Rafi07137_Kucing> getArrKucing(){
        return dataKucing;
    }
    public ArrayList<Rafi07137_Anjing> getArrAnjing(){
        return dataAnjing;
    }
    
    
    
    @Override    
    public void remove(String rafi07137_nama,Date rafi07137_tanggalambil){
        for(int i=0;i<dataKucing.size();i++){
            if(rafi07137_nama.equals(dataKucing.get(i).setNamapel())&&
                    rafi07137_tanggalambil.equals(dataKucing.get(i).setTanggalambil())){
                dataKucing.remove(i);
            }
        }
        for(int i=0;i<dataAnjing.size();i++){
            if(rafi07137_nama.equals(dataAnjing.get(i).setNamapel())&&
                    rafi07137_tanggalambil.equals(dataAnjing.get(i).setTanggalambil())){
                dataAnjing.remove(i);
        }
    }
        }
    
    @Override
    public void update(Date rafi07137_tanggalambil,Date newtglambil) {
        for(int i=0;i<dataKucing.size();i++){
            if(rafi07137_tanggalambil.equals(dataKucing.get(i).getTanggalambil())){
                dataKucing.get(i).setTanggalambil(newtglambil);
            }
        }
            for(int a=0;a<dataAnjing.size();a++){
                if(rafi07137_tanggalambil.equals(dataAnjing.get(a).getTanggalambil())){
                    dataAnjing.get(a).setTanggalambil(newtglambil);
                }
            }
           
    } 
    @Override
    public void view() {
    }
}