/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO4_Soal;

/**
 *
 * @author Taniaadna
 */
public class Pekerja extends Manusia {
    private int gaji;
    
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    @Override
    public String toString() {
        return "Nama        : " + getNama() + "\n" +
               "Usia        : " + usia + "\n" +
               "Pekerjaan   : " + pekerjaan + "\n" +
               "Gaji        : " + gaji + "\n"; 
    }
}
