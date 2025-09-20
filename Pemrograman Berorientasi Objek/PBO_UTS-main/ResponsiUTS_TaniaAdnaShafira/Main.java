/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_uts;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
        
        Pegawai pegawai1 = new PegawaiTetap("Tania", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Andi", 3000000, 12);
        
        System.out.println("1. Output Produk: ");
        produk1.tampilkanInfo();
        System.out.println();
        
        System.out.println("2. Ouput Pegawai: ");
        pegawai1.tampilkanInfo();
        System.out.println();
        
        System.out.println("3. Ouput Polimorfisme: ");
        produk2.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
             
    }
}
