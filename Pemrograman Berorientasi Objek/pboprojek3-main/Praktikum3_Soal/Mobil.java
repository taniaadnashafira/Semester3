/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3_Soal;

/**
 *
 * @author Taniaadna
 */
public class Mobil {
    private String merek;
    private String model;
    private int tahun;
    private String warna;
    
    public Mobil(String merek, String model, int tahun, String warna) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getTahun() {
        return tahun;
    }
    public void getTahun(int tahun) {
        this.tahun = tahun;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    void displayInfo() {
        System.out.println(" Mobil bermerek "+ this.merek + " dengan model " +
                this.model +" dan produksi tahun " + this.tahun + " berwana " + this.warna);
    }
    void startEngine() {
        System.out.println(" Mesin Mobil " + this.merek + " menyala ");      
    }
}
