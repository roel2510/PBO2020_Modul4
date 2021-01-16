package rafi07137_view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class rafi07137_view {
    String col[] = {"nama","alamat","nama kucing","jenis kucing","jenis kelamin","tanggal penititipan","tanggal pengambilan"};
    String colajg[] = {"nama","alamat","nama anjing","jenis anjing","jenis kelamin","tanggal penititipan","tanggal pengambilan"};
    JFrame view = new JFrame();
    JButton back,updateK,updateA,ref;
    DefaultTableModel mod = new DefaultTableModel(col, 0);
    DefaultTableModel modajg = new DefaultTableModel(colajg, 0);
    JTable tabel = new JTable(mod);
    JTable tabelajg = new JTable(modajg);
    JScrollPane scroll =new JScrollPane();
    JScrollPane scrollajg =new JScrollPane();
    JLabel dataK,dataA,upK,upA,labeltglambilK,labeltglambilA,labeltglbaruK,labeltglbaruA;
    JTextField txttglambilK,txttglambilA,txttglbaruK,txttglbaruA;
    public rafi07137_view(){
    for(int i=0;i<rafi07137_allobjctrl.admin.viewkucing().size();i++){
        String rafi07137_nama = rafi07137_allobjctrl.admin.getKucing().get(i).setNamapel();
        String rafi07137_alamat1 = rafi07137_allobjctrl.admin.getKucing().get(i).setAlamatpel();
        String rafi07137_namakucing = rafi07137_allobjctrl.admin.getKucing().get(i).getRafi07137_Namakucing();
        String rafi07137_jeniskucing = rafi07137_allobjctrl.admin.getKucing().get(i).setJenisKucing();
        String rafi07137_jeniskelamin = rafi07137_allobjctrl.admin.getKucing().get(i).setJeniskelamin();
        String rafi07137_tanggalpen =new SimpleDateFormat("dd-MM-yyyy").format(rafi07137_allobjctrl.admin.getKucing().get(i).setTanggalpen());
        String rafi07137_tanggalambil =new SimpleDateFormat("dd-MM-yyyy").format(rafi07137_allobjctrl.admin.getKucing().get(i).setTanggalambil());
        Object[] object = {rafi07137_nama,rafi07137_alamat1,rafi07137_namakucing,rafi07137_jeniskucing,rafi07137_jeniskelamin,rafi07137_tanggalpen,rafi07137_tanggalambil};
       mod.addRow(object);
    }
    for(int b=0;b<rafi07137_allobjctrl.admin.viewanjing().size();b++){
        String rafi07137_nama = rafi07137_allobjctrl.admin.viewanjing().get(b).setNamapel();
        String rafi07137_alamat2 = rafi07137_allobjctrl.admin.viewanjing().get(b).setAlamatpel();
        String rafi07137_namaanjing = rafi07137_allobjctrl.admin.viewanjing().get(b).getRafi07137_Namaanjing();
        String rafi07137_jenisanjing = rafi07137_allobjctrl.admin.viewanjing().get(b).setJenisAnjing();
        String rafi07137_jeniskelamin = rafi07137_allobjctrl.admin.viewanjing().get(b).setJeniskelamin();
        String rafi07137_tanggalpenA =new SimpleDateFormat("dd-MM-yyyy").format(rafi07137_allobjctrl.admin.viewanjing().get(b).setTanggalpen());
        String rafi07137_tanggalambilA=new SimpleDateFormat("dd-MM-yyyy").format(rafi07137_allobjctrl.admin.viewanjing().get(b).setTanggalambil());
        Object[] objectajg = {rafi07137_nama,rafi07137_alamat2,rafi07137_namaanjing,rafi07137_jenisanjing,rafi07137_jeniskelamin,rafi07137_tanggalpenA,rafi07137_tanggalambilA};
    modajg.addRow(objectajg);
    }
    scroll.setViewportView(tabel);
    scrollajg.setViewportView(tabelajg);
    view.setSize(1000,600);
    view.setLayout(null);
    view.getContentPane().setBackground(Color.ORANGE);
    dataK = new JLabel("Data Kucing");
    dataK.setBounds(180,10,700,30);
    dataK.setFont(new Font("Times New Roman",Font.BOLD,25));
    view.add(dataK);  
    scroll.setBounds(30,45,650,200);
    tabel.setModel(mod);
    view.add(scroll);   
    dataA = new JLabel("Data Anjing");
    dataA.setBounds(180,250,700,30);
    dataA.setFont(new Font("Times New Roman",Font.BOLD,25));
    view.add(dataA);  
    scrollajg.setBounds(30,280,650,200);
    tabelajg.setModel(modajg);
    view.add(scrollajg);   
    upK = new JLabel("Update Tanggal Kucing");
    upK.setBounds(700,10,700,40);
    upK.setFont(new Font("Times New Roman",Font.BOLD,25));
    view.add(upK);
    updateK = new JButton("Update Kucing");
    updateK.setBounds(720,160,150,40);
    updateK.setBackground(Color.GREEN);
    view.add(updateK);   
    labeltglambilK = new JLabel("Masukkan Tanggal Lama :");
    labeltglambilK.setBounds(700,50,180,40);
    view.add(labeltglambilK);
    txttglambilK = new JTextField();
    txttglambilK.setBounds(700,80,200,20);
    view.add(txttglambilK);  
    labeltglbaruK = new JLabel("Masukkan Tanggal Baru :");
    labeltglbaruK.setBounds(700,100,180,40);
    view.add(labeltglbaruK);
    txttglbaruK = new JTextField();
    txttglbaruK.setBounds(700,130,200,20);
    view.add(txttglbaruK);   
    upA = new JLabel("Update Tanggal Anjing");
    upA.setBounds(700,250,700,40);
    upA.setFont(new Font("Times New Roman",Font.BOLD,25));
    view.add(upA);
    labeltglambilA = new JLabel("Masukkan Tanggal Lama :");
    labeltglambilA.setBounds(700,285,180,40);
    view.add(labeltglambilA);
    txttglambilA = new JTextField();
    txttglambilA.setBounds(700,315,200,20);
    view.add(txttglambilA);  
    labeltglbaruA = new JLabel("Masukkan Tanggal Baru :");
    labeltglbaruA.setBounds(700,325,180,40);
    view.add(labeltglbaruA);
    txttglbaruA = new JTextField();
    txttglbaruA.setBounds(700,355,200,20);
    view.add(txttglbaruA);
    updateA = new JButton("Update Anjing");
    updateA.setBounds(720,385,150,40);
    updateA.setBackground(Color.GREEN);
    view.add(updateA);
    back = new JButton("Kembali");
    back.setBounds(30, 500, 150, 40);
    back.setBackground(Color.RED);
    view.add(back);         
    view.setLocationRelativeTo(null);
    view.setVisible(true);
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
            rafi07137_tampilanGUI kembali = new rafi07137_tampilanGUI();
            view.dispose();
            }
        });
    updateK.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed (ActionEvent ae){
            try{
                Date tanggalambilK =new Date(txttglambilK.getText());
                Date newtglambilK =new Date(txttglbaruK.getText());
                rafi07137_allobjctrl.admin.updateTgl(tanggalambilK, newtglambilK);
                JOptionPane.showMessageDialog(null,"Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
            kosong();
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null, "Data Salah", "Update Gagal",JOptionPane. INFORMATION_MESSAGE);               
            }
            view.dispose();
             }
             }); 
    
    updateA.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed (ActionEvent ae){
            try{
                Date tanggalambilA =new Date(txttglambilA.getText());
                Date newtglambilA =new Date(txttglbaruA.getText());
                rafi07137_allobjctrl.admin.updateTgl(tanggalambilA, newtglambilA);
                JOptionPane.showMessageDialog(null,"Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
            kosong();
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null, "Data Salah", "Update Gagal",JOptionPane. INFORMATION_MESSAGE);               
            }
            view.dispose();
             }
             });   
    }
     void kosong(){
        txttglambilK.setText(null);
        txttglambilA.setText(null);   
        txttglbaruA.setText(null);
        txttglbaruK.setText(null);      
    }
}
  