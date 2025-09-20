/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        Kendaraan motor = new Motor();
        mobil.info();
        mobil.berjalan();
      
        sepeda.info();
        sepeda.berjalan();
        
        motor.info();
        motor.berjalan();
    }  
}
