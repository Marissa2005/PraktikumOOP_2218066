/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author MARIA YASINTA WULANG
 */
public class MainTugas1 {
    public static void main(String[] args) {
 // membuat object dengan nama “tgs” dari class Tugas1
 Tugas1 tgs = new Tugas1(); 
 //ketika akan menggunakan method dari class Tugas1 maka harus menyertakan nama object
 //paragraf pertama ini merupakan Data Peminjam
 
 tgs.setNama("Maria Yasinta Wulang");
 tgs.setJenKel("Perempuan ");
 tgs.setAlamat("Jl.Golf");
 tgs.setJmlP("1.000.000.000");
 //tgs.DataSBunga("5%");
 tgs.setSBB("0,05/12");
 tgs.setAngpB("10.000.000");
 //tgs.setSisa("800.000.000");
 tgs.setJdp("Tanggal 15 / bln");
 tgs.setJW("240 bln");
 tgs.setJA("10.000.000");
 
 
 System.out.println("Data Pembayaran KPR");
 System.out.println("-------------------"); //system.out.println digunakan untuk memunculkan pada hasil running semua objek yang berada di dalam tanda ("") 
 System.out.println("Nama Peminjam          : "+ tgs.getNama()); //tgs.cetak digunakan untuk memunculkan data Peminjam pada hasil running 
 System.out.println("Jenis Kelamin          : "+ tgs.getJenKel()); 
 System.out.println("Alamat Peminjam        : "+ tgs.getAlamat());
 System.out.println("Jumlah Pinjaman        : "+ tgs.getJmlP()); 
 //System.out.println("Suku Bunga /thn      : "t6.getText()); 
 System.out.println("Suku Bunga /bln        : "+ tgs.getSBB()); 
 System.out.println("Angsuran/bln           : "+ tgs.getJAngpB()); 
 //System.out.println("Sisa Angsuran          : "+ tgs.getSisa()); 
 System.out.println("Tanggal Pembayaran/bln : "+ tgs.getJdp()); 
 System.out.println("Jangka Waktu Pembayaran: "+ tgs.getJW());
 System.out.println("Jml Angsuran           : "+ tgs.getJA());
 }
}
 
 
 /*tgs.DataNama("Maria Yasinta Wulang");
 tgs.DataJenKel("Perempuan ");
 tgs.DataAlamat("Jl.Golf");
 tgs.DataJmlP("1.000.000.000");
 //tgs.DataSBunga("5%");
 tgs.DataSBB("0,05/12");
 tgs.DataAngpB("10.000.000");
 tgs.DataSisa("800.000.000");
 tgs.DataJdp("Tanggal 15 / bln");
 tgs.DataJW("240 bln");
 tgs.DataJA("10.000.000");
 
 
 System.out.println("Data Pembayaran KPR");
 System.out.println("-------------------"); //system.out.println digunakan untuk memunculkan pada hasil running semua objek yang berada di dalam tanda ("") 
 System.out.println("Nama Peminjam          : "+ tgs.cetakNama()); //tgs.cetak digunakan untuk memunculkan data Peminjam pada hasil running 
 System.out.println("Jenis Kelamin          : "+ tgs.cetakJenKel()); 
 System.out.println("Alamat Peminjam        : "+ tgs.cetakAlamat());
 System.out.println("Jumlah Pinjaman        : "+ tgs.cetakJmlP()); 
 //System.out.println("Suku Bunga /thn      : "t6.getText()); 
 System.out.println("Suku Bunga /bln        : "+ tgs.cetakSBB()); 
 System.out.println("Angsuran/bln           : "+ tgs.cetakJAngpB()); 
 System.out.println("Sisa Angsuran          : "+ tgs.cetakSisa()); 
 System.out.println("Tanggal Pembayaran/bln : "+ tgs.cetakJdp()); 
 System.out.println("Jangka Waktu Pembayaran: "+ tgs.cetakJW());
 System.out.println("Jml Angsuran           : "+ tgs.cetakJA());
 }8*/

