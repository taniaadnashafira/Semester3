/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo6_soal;

/**
 *
 * @author Taniaadna
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> produkList;
    
    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }
    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }
    public double hitungTotalHargaSetelahDiskon() {
        double totalHarga = 0;
        double totalDiskon = 0;
        
        for (Produk produk : produkList) {
            totalHarga += produk.harga;
            totalDiskon += produk.hitungDiskon();
        }
        return totalHarga - totalDiskon;
    }
    public void tampilkanBarang() {
        System.out.println("Daftar barang yang dibeli:");
        for (Produk produk : produkList) {
            System.out.println("- " + produk.nama + " (Harga: " + produk.harga + ")");
        }
    }
}
