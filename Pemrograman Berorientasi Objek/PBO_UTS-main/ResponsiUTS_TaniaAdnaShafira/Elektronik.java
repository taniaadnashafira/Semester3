/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_uts;

/**
 *
 * @author ASUS
 */
public class Elektronik extends Produk {
    private int garansi;
    
    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    public int getGransi() {
        return garansi;
    }
    public void setGransi(int garansi) {
        this. garansi = garansi;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
