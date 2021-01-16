package rafi07137_view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Date;
import rafi07137_Entity.Rafi07137_Kucing;
public class rafi07137_daftarKucing {
    JFrame TdaftarK = new JFrame();
    JLabel daftar;
    JTextField txtnamaK,txtalamatK,txtnamahewanK,txtjenishewanK,txtjeniskelaminK,txttglpenK,txttglambilK,txtjeniskucing,txtnamakucing;
    JLabel labelnamaK,labelalamatK,labeljenishewanK,labeljeniskelaminK,labeltglpenK,labeltglambilK,labelnamakucing,labeljeniskucing,labeltgltitipK;
    JButton back,reg;
public rafi07137_daftarKucing(){
    TdaftarK.setSize(700,630);
    TdaftarK.setLayout(null);
    TdaftarK.getContentPane().setBackground(Color.ORANGE); 
    daftar = new JLabel("Daftar Customer Kucing");
    daftar.setBounds(220,10,700,40);
    daftar.setFont(new Font("Times New Roman",Font.BOLD,25));
    TdaftarK.add(daftar);
    labelnamaK = new JLabel("Nama Customer :");
    labelnamaK.setBounds(250,50,180,40);
    TdaftarK.add(labelnamaK);
    txtnamaK = new JTextField();
    txtnamaK.setBounds(250,80,200,20);
    TdaftarK.add(txtnamaK);
    labelalamatK = new JLabel("Alamat Customer :");
    labelalamatK.setBounds(250,90,180,40);
    TdaftarK.add(labelalamatK);
    txtalamatK = new JTextField();
    txtalamatK.setBounds(250,120,200,20);
    TdaftarK.add(txtalamatK); 
    labelnamakucing = new JLabel("Nama Kucing :");
    labelnamakucing.setBounds(250,130,180,40);
    TdaftarK.add(labelnamakucing);
    txtnamakucing = new JTextField();
    txtnamakucing.setBounds(250,160,200,20);
    TdaftarK.add(txtnamakucing);
    labeljeniskucing = new JLabel("Jenis Kucing :");
    labeljeniskucing.setBounds(250,170,180,40);
    TdaftarK.add(labeljeniskucing);
    txtjeniskucing = new JTextField();
    txtjeniskucing.setBounds(250,200,200,20);
    TdaftarK.add(txtjeniskucing);
    labeljeniskelaminK = new JLabel("Jenis Kelamin Kucing :");
    labeljeniskelaminK.setBounds(250,210,180,40);
    TdaftarK.add(labeljeniskelaminK);
    txtjeniskelaminK = new JTextField();
    txtjeniskelaminK.setBounds(250,240,200,20);
    TdaftarK.add(txtjeniskelaminK);
    labeltgltitipK = new JLabel("Tanggal Penitipan :");
    labeltgltitipK.setBounds(250,250,180,40);
    TdaftarK.add(labeltgltitipK);
    txttglpenK = new JTextField();
    txttglpenK.setBounds(250,280,200,20);
    TdaftarK.add(txttglpenK);
    labeltglambilK = new JLabel("Tanggal Ambil :");
    labeltglambilK.setBounds(250,290,180,40);
    TdaftarK.add(labeltglambilK);
    txttglambilK = new JTextField();
    txttglambilK.setBounds(250,320,200,20);
    TdaftarK.add(txttglambilK);
    reg = new JButton("Daftar");
    reg.setBounds(270,360,150,40);
    reg.setBackground(Color.GREEN);
    TdaftarK.add(reg);
    back = new JButton("back");
    back.setBounds(270,410,150,40);
    back.setBackground(Color.red);
    TdaftarK.add(back);
    TdaftarK.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    TdaftarK. setVisible(true);
    TdaftarK.setLocationRelativeTo(null);    
    back.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        rafi07137_tampilanGUI BMenu = new rafi07137_tampilanGUI();
        TdaftarK.dispose();
        }
      });
    reg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent ae){
            try{
            String rafi07137_nama = txtnamaK.getText();
            String rafi07137_alamat1 = txtalamatK.getText();
            String rafi07137_namakucing = txtnamakucing.getText();
            String rafi07137_jeniskucing = txtjeniskucing.getText();
            String rafi07137_jeniskelamin = txtjeniskelaminK.getText();
            Date rafi07137_tanggalpen = new Date(txttglpenK.getText());
            Date rafi07137_tanggalambil = new Date(txttglambilK.getText());
            rafi07137_allobjctrl.admin.insertKucing(new Rafi07137_Kucing(rafi07137_nama,rafi07137_alamat1,rafi07137_jeniskucing,
                    rafi07137_jeniskelamin,rafi07137_tanggalpen,rafi07137_tanggalambil,rafi07137_namakucing)); 
            JOptionPane.showMessageDialog(null,"Daftar Berhasil","information",JOptionPane.INFORMATION_MESSAGE);
            kosongKucing();        
            }catch(Exception exception){
               JOptionPane.showMessageDialog(null,"Format Salah","Regristasi Gagal",JOptionPane.INFORMATION_MESSAGE); 
            }
          }
            });           
    }
    void kosongKucing(){
        txtnamaK.setText(null);
        txtalamatK.setText(null);
        txtnamakucing.setText(null);
        txtjeniskucing.setText(null);
        txtjeniskelaminK.setText(null);
        txttglpenK.setText(null);
        txttglambilK.setText(null);   
    }
}




