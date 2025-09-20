/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO4;

/**
 *
 * @author Taniaadna
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void tampilkanInfomobil() {
        System.out.println("Nama: " + getNama());
        System.out.println("Kecepatan Maks Mobil: " + kecepatanMaks + " km/h ");
        System.out.println("Jenis Mesin: " + jenisMesin);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
