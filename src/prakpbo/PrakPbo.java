/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prakpbo;

import java.util.Scanner;
import ruang.Balok;
import ruang.Tabung;

/**
 *
 * @author ACER
 */
public class PrakPbo {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner pilih = new Scanner(System.in);
        int menu;
        
        do {
            System.out.println("MENU");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
            menu = pilih.nextInt();
        
            switch (menu){
                case 1:
                    System.out.print("Panjang = "); int panjang = pilih.nextInt();
                    System.out.print("Lebar = "); int lebar = pilih.nextInt();
                    System.out.print("Tinggi = "); int tinggi = pilih.nextInt();
                    
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    
                    System.out.println("Luas Persegi Panjang : " + balok.HitungLuas());
                    System.out.println("Keliling Persegi Panjang : " + balok.HitungKeliling());
                    System.out.println("Volume Balok : " + balok.HitungVolume());
                    System.out.println("Luas Permukaan Balok : " + balok.HitungLuasPermukaan());
                    
                    break;
                    
                case 2 :
                    System.out.print("Tinggi = "); int Tinggi = pilih.nextInt();
                    System.out.print("Jari-jari = "); double jari = pilih.nextDouble();
                    
                    Tabung tabung = new Tabung(jari, Tinggi);
                    
                    System.out.println("Luas Lingkaran : " + tabung.HitungLuas());
                    System.out.println("Keliling Lingkaran : " + tabung.HitungKeliling());
                    System.out.println("Volume Tabung : " + tabung.HitungVolume());
                    System.out.println("Luas Permukaan Tabung : " + tabung.HitungLuasPermukaan());
                    
                    break;
                    
                case 3 :
                    System.out.println("Keluar..");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (menu != 3);
    } 
    
}
