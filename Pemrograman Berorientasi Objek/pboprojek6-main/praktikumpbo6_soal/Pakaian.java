/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo6_soal;

/**
 *
 * @author Taniaadna
 */
public class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }
    @Override
    public double hitungDiskon() {
        double diskon = 0.2;
        return harga * diskon;
    }
}


