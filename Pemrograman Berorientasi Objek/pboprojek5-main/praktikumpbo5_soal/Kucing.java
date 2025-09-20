/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo5_soal;

/**
 *
 * @author Taniaadna
 */
public class Kucing extends Hewan {
    String suara;
    
    @Override
    public void InfoHewan() {
        super.InfoHewan();
        System.out.println("Suara kucing: " + suara);
    }
}

