/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10_soal;

/**
 *
 * @author Taniaadna
 */
public class Main {
    public static void main(String[] args) {
        Elektronik produkElektronik = new Elektronik();
        double hargaElektronik = 2000000;
        double pajakElektronik = produkElektronik.hitungPajak(hargaElektronik);
        Makanan produkMakanan = new Makanan();
        double hargaMakanan = 50000;
        double pajakMakanan = produkMakanan.hitungPajak(hargaMakanan);
        
        System.out.println("Pajak untuk produk Elektronik dengan harga RP " + hargaElektronik + " adalah RP " + pajakElektronik);
        System.out.println("Pajak untuk produk Makanan dengan harga RP " + hargaMakanan + " adalah RP " + pajakMakanan);
    }
    
}
