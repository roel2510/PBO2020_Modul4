package rafi07137_Entity;
public abstract class Rafi07137_Hewan {
    protected String rafi07137_namakucing;
    protected String rafi07137_namaanjing;
    protected String rafi07137_jenisanjing;
    
    public Rafi07137_Hewan(String rafi07137_namakucing,String rafi07137_namaanjing,String rafi07137_jenisanjing) {
        this.rafi07137_namakucing = rafi07137_namakucing;
        this.rafi07137_namaanjing = rafi07137_namaanjing;
        this.rafi07137_jenisanjing = rafi07137_jenisanjing;
    }
    public Rafi07137_Hewan() {
    }   
    void setRafi07137_namakucing(String rafi07137_namakucing) {
        this.rafi07137_namakucing = rafi07137_namakucing;
    }
    void setRafi07137_namaanjing(String rafi07137_namaanjing) {
        this.rafi07137_namaanjing = rafi07137_namaanjing;
    }
    void setRafi07137_jenisanjing(String rafi07137_jenisanjing) {
       this.rafi07137_jenisanjing = rafi07137_jenisanjing;
    }
    public String getRafi07137_Namakucing() {
        return rafi07137_namakucing;
    }
    public String getRafi07137_Namaanjing() {
        return rafi07137_namaanjing;
    }
    public String getRafi07137_Jenisanjing() {
        return rafi07137_jenisanjing;
    }
}
