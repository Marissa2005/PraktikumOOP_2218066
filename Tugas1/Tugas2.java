/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author MARIA YASINTA WULANG
 */
public abstract class Tugas2 extends abstrak2 implements Interface2 {
   String ktp;
   String gaji;
   
   //void setgaji(double Gaji){
    void setgaji (String Gaji){
       this.gaji = Gaji;
    }
    void setktp(String KTP){
        this.ktp = KTP;
    }
    
    //double getgaji(){
   @Override
    String getgaji(){
       return gaji;
    }
   @Override
    String getktp(){
        return ktp; 
    }
   //Mthod Overide
   @Override
    String getNama(){
        return nama;
    }
}

    
   /*void datagaji(double Gaji){
       this.gaji = Gaji;
    }
    void dataktp(String KTP){
        this.ktp = KTP;
    }
    
    double cetakgaji(){
       return gaji;
    }
    String cetakktp(){
        return ktp;
    }*/

 