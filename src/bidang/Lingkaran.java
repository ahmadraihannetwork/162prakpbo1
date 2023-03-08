/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bidang;

/**
 *
 * @author ACER
 */
public class Lingkaran implements BangunBidang {
    public double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double HitungLuas(){
        return Math.PI * this.jariJari * this.jariJari;
    }
    
    @Override
    public double HitungKeliling(){
        return 2 * Math.PI * jariJari;
    }
    
}
