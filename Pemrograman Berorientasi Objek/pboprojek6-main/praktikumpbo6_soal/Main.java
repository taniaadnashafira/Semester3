/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo6_soal;

/**
 *
 * @author Taniaadna
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(new Buku("Belajar Java", 100000));
        keranjang.tambahProduk(new Elektronik("Smartphone", 3000000));
        keranjang.tambahProduk(new Pakaian("Kaos", 150000));
        
        keranjang.tampilkanBarang();
        double totalHargaSetelahDiskon = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);
    }
}
