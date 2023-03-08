/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

import bidang.PersegiPanjang;

/**
 *
 * @author ACER
 */
public class Balok extends PersegiPanjang implements BangunRuang {
    
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double HitungVolume() {
        return this.HitungLuas()*this.tinggi;
    }

    @Override
    public double HitungLuasPermukaan() {
        return 2*((this.panjang*this.lebar) + (this.panjang*this.tinggi) + (this.lebar*this.tinggi)) ;
    }
    
}
        
