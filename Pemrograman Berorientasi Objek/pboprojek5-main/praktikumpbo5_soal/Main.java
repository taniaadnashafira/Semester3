/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo5_soal;

/**
 *
 * @author Taniaadna
 */
public class Main {
    public static void main(String[] args) {
        Kucing lala = new Kucing();
        lala.nama = "Lala";
        lala.jenis = "Himalaya";
        lala.suara = "Meow";
        System.out.println("Info Kucing");
        lala.InfoHewan();
        
        Anjing lili = new Anjing();
        lili.nama = "Lili";
        lili.jenis = "Bichon Frise";
        lili.suara = "Guk-guk";
        System.out.println("\nInfo Anjing");
        lili.InfoHewan();
    }
}