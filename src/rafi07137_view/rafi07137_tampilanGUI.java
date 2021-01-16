package rafi07137_view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class rafi07137_tampilanGUI {
    JFrame TamAwal = new JFrame();
    JLabel judul;
    JButton daftarK,daftarA,update,ambil,tampil;
public rafi07137_tampilanGUI(){
TamAwal.setSize(760,300);
TamAwal.setLayout(null);
TamAwal.getContentPane().setBackground(Color.yellow);
judul = new JLabel("Animal Care Surabaya");
judul.setBounds(180,10,700,40);
judul.setFont(new Font("Times New Roman",Font.BOLD,40));
TamAwal.add(judul);
daftarK = new JButton("Daftar Kucing");
daftarK.setBounds(290,100,200,20);
daftarK.setBackground(Color.ORANGE);
daftarK.setFont(new Font("Times New Roman",Font.BOLD,20));
TamAwal.add(daftarK);
daftarA = new JButton("Daftar Anjing");
daftarA.setBounds(290,130,200,20);
daftarA.setBackground(Color.ORANGE);
daftarA.setFont(new Font("Times New Roman",Font.BOLD,20));
TamAwal.add(daftarA);
ambil = new JButton("Ambil Hewan");
ambil.setBounds(290,160,200,20);
ambil.setBackground(Color.ORANGE);
ambil.setFont(new Font("Times New Roman",Font.BOLD,20));
TamAwal.add(ambil);
tampil = new JButton("Lihat Data");
tampil.setBounds(290,190,200,20);
tampil.setBackground(Color.ORANGE);
tampil.setFont(new Font("Times New Roman",Font.BOLD,20));
TamAwal.add(tampil);
TamAwal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
TamAwal. setVisible(true);
TamAwal.setLocationRelativeTo(null);
daftarK.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        rafi07137_daftarKucing daftarK = new rafi07137_daftarKucing();
        TamAwal.dispose();
        }
      });
daftarA.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        rafi07137_daftarAnjing daftarA = new rafi07137_daftarAnjing();
        TamAwal.dispose();
        }
      });
tampil.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        rafi07137_view view = new rafi07137_view();
        }
      });
ambil.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        rafi07137_remove dels = new rafi07137_remove();
        }
      });
    }
  }
