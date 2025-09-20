/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO4_Soal;

/**
 *
 * @author Taniaadna
 */
public class Main {
    public static void main(String[] args) {
        Pekerja Adna = new Pekerja("Adna",18,"Hacker",1000000000);
        
        System.out.println("Informasi Pekerja:");
        System.out.println(Adna.toString());
        
        Adna.setNama("Tania");
        System.out.println("\nInformasi setelah diperbarui:");
        System.out.println(Adna.toString());
    }
}