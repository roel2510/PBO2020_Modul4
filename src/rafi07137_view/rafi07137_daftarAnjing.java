package rafi07137_view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Date;
import rafi07137_Entity.Rafi07137_Anjing;
public class rafi07137_daftarAnjing {
    JFrame TdaftarA = new JFrame();
    JLabel daftar;
    JTextField txtnamaA,txtalamatA,txtnamahewanA,txtjenishewanA,txtjeniskelaminA,txttglpenA,txttglambilA,txtjenisanjing,txtnamaanjing;
    JLabel labelnamaA,labelalamatA,labeljenishewanA,labeljeniskelaminA,labeltglpenA,labeltglambilA,labelnamaanjing,labeljenisanjing,labeltgltitipA;
    JButton back,reg;
public rafi07137_daftarAnjing(){
    TdaftarA.setSize(700,630);
    TdaftarA.setLayout(null);
    TdaftarA.getContentPane().setBackground(Color.ORANGE);  
    daftar = new JLabel("Daftar Customer Anjing");
    daftar.setBounds(220,10,700,40);
    daftar.setFont(new Font("Times New Roman",Font.BOLD,25));
    TdaftarA.add(daftar);
    labelnamaA = new JLabel("Nama Customer :");
    labelnamaA.setBounds(250,50,180,40);
    TdaftarA.add(labelnamaA);
    txtnamaA = new JTextField();
    txtnamaA.setBounds(250,80,200,20);
    TdaftarA.add(txtnamaA);
    labelalamatA = new JLabel("Alamat Customer :");
    labelalamatA.setBounds(250,90,180,40);
    TdaftarA.add(labelalamatA);
    txtalamatA = new JTextField();
    txtalamatA.setBounds(250,120,200,20);
    TdaftarA.add(txtalamatA); 
    labelnamaanjing = new JLabel("Nama Anjing :");
    labelnamaanjing.setBounds(250,130,180,40);
    TdaftarA.add(labelnamaanjing);
    txtnamaanjing = new JTextField();
    txtnamaanjing.setBounds(250,160,200,20);
    TdaftarA.add(txtnamaanjing);
    labeljenisanjing = new JLabel("Jenis Anjing :");
    labeljenisanjing.setBounds(250,170,180,40);
    TdaftarA.add(labeljenisanjing);
    txtjenisanjing = new JTextField();
    txtjenisanjing.setBounds(250,200,200,20);
    TdaftarA.add(txtjenisanjing);
    labeljeniskelaminA = new JLabel("Jenis Kelamin Anjing :");
    labeljeniskelaminA.setBounds(250,210,180,40);
    TdaftarA.add(labeljeniskelaminA);
    txtjeniskelaminA = new JTextField();
    txtjeniskelaminA.setBounds(250,240,200,20);
    TdaftarA.add(txtjeniskelaminA);
    labeltgltitipA = new JLabel("Tanggal Penitipan :");
    labeltgltitipA.setBounds(250,250,180,40);
    TdaftarA.add(labeltgltitipA);
    txttglpenA = new JTextField();
    txttglpenA.setBounds(250,280,200,20);
    TdaftarA.add(txttglpenA);
    labeltglambilA = new JLabel("Tanggal Ambil :");
    labeltglambilA.setBounds(250,290,180,40);
    TdaftarA.add(labeltglambilA);
    txttglambilA = new JTextField();
    txttglambilA.setBounds(250,320,200,20);
    TdaftarA.add(txttglambilA);
    reg = new JButton("Daftar");
    reg.setBounds(270,360,150,40);
    reg.setBackground(Color.GREEN);
    TdaftarA.add(reg);
    back = new JButton("back");
    back.setBounds(270,410,150,40);
    back.setBackground(Color.red);
    TdaftarA.add(back);
    TdaftarA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    TdaftarA. setVisible(true);
    TdaftarA.setLocationRelativeTo(null);    
    back.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        rafi07137_tampilanGUI BMenu = new rafi07137_tampilanGUI();
        TdaftarA.dispose();
        }
      });         
    reg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
            try{
            String rafi07137_nama = txtnamaA.getText();
            String rafi07137_alamat2 = txtalamatA.getText();
            String rafi07137_namaanjing = txtnamaanjing.getText();
            String rafi07137_jenisanjing = txtjenisanjing.getText();
            String rafi07137_jeniskelamin = txtjeniskelaminA.getText();
            Date rafi07137_tanggalpen = new Date(txttglpenA.getText());
            Date rafi07137_tanggalambil = new Date(txttglambilA.getText());
            rafi07137_allobjctrl.admin.insertAnjing(new Rafi07137_Anjing(rafi07137_nama,rafi07137_alamat2,rafi07137_jenisanjing,
                    rafi07137_jeniskelamin,rafi07137_tanggalpen,rafi07137_tanggalambil,rafi07137_namaanjing));
            JOptionPane.showMessageDialog(null,"Daftar Berhasil","information",JOptionPane.INFORMATION_MESSAGE);
            kosongAnjing();         
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null,"Format Salah","Regristasi Gagal",JOptionPane.INFORMATION_MESSAGE);             
            }
          }
        });
    }
    void kosongAnjing(){ 
        txtnamaA.setText(null);
        txtalamatA.setText(null);
        txtnamaanjing.setText(null);
        txtjenisanjing.setText(null);
        txtjeniskelaminA.setText(null);
        txttglpenA.setText(null);
        txttglambilA.setText(null);
    }
}


