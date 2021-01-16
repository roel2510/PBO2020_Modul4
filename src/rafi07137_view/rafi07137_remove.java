package rafi07137_view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class rafi07137_remove {
    JFrame del =new JFrame();
    JLabel ambil,labelnamapelK,labeltglambilK,labelnamapelA,labeltglambilA;
    JTextField txtnamapelK,txttglambilK,txtnamapelA,txttglambilA;
    JButton back,dels,delsA; 
public rafi07137_remove(){
    del.setSize(700,400);
    del.setLayout(null);
    del.getContentPane().setBackground(Color.ORANGE);  
    ambil = new JLabel("Ambil Hewan");
    ambil.setBounds(220,10,700,40);
    ambil.setFont(new Font("Times New Roman",Font.BOLD,40));
    del.add(ambil);
    labelnamapelK = new JLabel("Nama Customer Kucing:");
    labelnamapelK.setBounds(50,50,180,40);
    del.add(labelnamapelK);
    txtnamapelK = new JTextField();
    txtnamapelK.setBounds(50,80,200,20);
    del.add(txtnamapelK);
    labeltglambilK = new JLabel("Tanggal Pengambilan Kucing :");
    labeltglambilK.setBounds(50,90,180,40);
    del.add(labeltglambilK);
    txttglambilK = new JTextField();
    txttglambilK.setBounds(50,120,200,20);
    del.add(txttglambilK);
    labelnamapelA = new JLabel("Nama Customer Anjing:");
    labelnamapelA.setBounds(450,50,180,40);
    del.add(labelnamapelA);
    txtnamapelA = new JTextField();
    txtnamapelA.setBounds(450,80,200,20);
    del.add(txtnamapelA);  
     labeltglambilA = new JLabel("Tanggal Pengambilan Kucing :");
    labeltglambilA.setBounds(450,90,180,40);
    del.add(labeltglambilA);
    txttglambilA = new JTextField();
    txttglambilA.setBounds(450,120,200,20);
    del.add(txttglambilA);   
    back = new JButton("back");
    back.setBounds(270,250,150,40);
    back.setBackground(Color.red);
    del.add(back); 
    dels = new JButton("Ambil Kucing");
    dels.setBounds(65,200,150,40);
    dels.setBackground(Color.GREEN);
    del.add(dels);
    delsA = new JButton("Ambil Anjing");
    delsA.setBounds(470,200,150,40);
    delsA.setBackground(Color.GREEN);
    del.add(delsA);
    del.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    del. setVisible(true);
    del.setLocationRelativeTo(null);   
    back.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        rafi07137_tampilanGUI BMenu = new rafi07137_tampilanGUI();
        }
      });    
    dels.addActionListener(new ActionListener(){           
        @Override
            public void actionPerformed (ActionEvent ae){
                try{
            String rafi07137_namaK = txtnamapelK.getText();
            Date rafi07137_tanggalambilK =new Date (txttglambilK.getText());
            rafi07137_allobjctrl.admin.Ambil(rafi07137_namaK,rafi07137_tanggalambilK);
            JOptionPane.showMessageDialog(null,"Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
                kosong();
        }catch(Exception exception) {
        JOptionPane.showMessageDialog(null, "Data Salah", "Pengambilan Gagal",JOptionPane. INFORMATION_MESSAGE);
          }
         }       
        });
    delsA.addActionListener(new ActionListener(){           
        @Override
            public void actionPerformed (ActionEvent ae){
                try{
            String rafi07137_namaA = txtnamapelA.getText();
            Date rafi07137_tanggalambilA =new Date (txttglambilA.getText());
            rafi07137_allobjctrl.admin.Ambil(rafi07137_namaA,rafi07137_tanggalambilA);
            JOptionPane.showMessageDialog(null,"Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
                kosong();
        }catch(Exception exception) {
        JOptionPane.showMessageDialog(null, "Data Salah", "Pengambilan Gagal",JOptionPane. INFORMATION_MESSAGE);
          }
         }       
        });  
    }void kosong(){
        txtnamapelK.setText(null);
        txttglambilK.setText(null);
        txtnamapelA.setText(null);
        txttglambilA.setText(null);
    }
   
}
            