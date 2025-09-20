/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author Taniaadna
 */
public class Main {
    public static void main(String[] args) {
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5));
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan: " + pengurangan.hitung(10, 5));
    }   
}
