/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO4;

/**
 *
 * @author Taniaadna
 */
public class PraktikumPBO4 {
    
    public static void main(String[] args) {
        Kendaraan tania = new Kendaraan("Lamborghini", 350, "Mahal");
        System.out.println("Informasi Kendaraan: ");
        tania.tampilkanInfokendaraan();
        
        Mobil adna = new Mobil("Porsche", 308, "Mahal", 4);
        System.out.println("\nInformasi Mobil: ");
        adna.tampilkanInfomobil();
    }
}