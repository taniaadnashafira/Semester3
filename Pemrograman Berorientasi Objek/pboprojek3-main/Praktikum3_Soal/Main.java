/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3_Soal;

/**
 *
 * @author Taniaadna
 */
public class Main {
    public static void main(String[] args) {
        Mobil MobilTania = new Mobil("Porsche", "Porsche 911", 2019, "Pink");
        Mobil MobilLala = new Mobil("Ferrari", "812 GTS", 2022, "Merah");
        
        MobilTania.displayInfo();
        MobilTania.setWarna("Putih");
        MobilTania.displayInfo();
        
        MobilLala.displayInfo();
        MobilLala.setWarna("Hitam");
        MobilLala.displayInfo();
        
        MobilTania.startEngine();
        MobilLala.startEngine();
    }
}
