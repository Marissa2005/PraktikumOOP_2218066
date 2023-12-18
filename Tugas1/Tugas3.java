/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author MARIA YASINTA WULANG
 */

public class Tugas3 extends Tugas1{
   int Tgl;
   
   void setTgl(int Tgl){
       try {
           this.Tgl = Tgl;
       } catch (Exception e) {
           System.out.println("Gagal menetapkan tanggal");
       }
   }
   
   int getgl(){
       try {
           return Tgl;
       } catch (Exception e) {
           System.out.println("Gagal mengambil tanggal");
           return 0;
       }
   }
   
   @Override
   void setNama(String Nama){
       try {
           super.setNama(Nama);
       } catch (Exception e) {
           System.out.println("Gagal menetapkan nama");
       }
   }
   
   @Override
   String getNama(){
       try {
           return super.getNama();
       } catch (Exception e) {
           System.out.println("Gagal mengambil nama");
           return null;
       }
   }
}
/*public class Tugas3 extends Tugas1{
   String tgl;
   
   void settgl(String Tgl){
       this.tgl = Tgl;
   }
   
   String gettgl(){
       return tgl;
   }
   
   @Override
   void setNama(String Nama){
       super.setNama(Nama);
   }
   
   @Override
   String getNama(){
       return super.getNama();
   }
}*/
   
  

