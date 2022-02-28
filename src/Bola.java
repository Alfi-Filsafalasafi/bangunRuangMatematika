/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Bola extends Lingkaran implements BangunRuang {

    private double volume;
    private double luas_permukaan;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLuas_permukaan() {
        return luas_permukaan;
    }

    public void setLuas_permukaan(double luas_permukaan) {
        this.luas_permukaan = luas_permukaan;
    }
    
    @Override
    public double volume() {
        return 4.0 / 3.0 * luas() * getJarijari()  ;
    }

    @Override
    public double luas_permukaan() {
        return 4 * luas();
    }

    @Override
    public double luas_selimut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double jari_jari_v(){
        return Math.cbrt((3*getVolume()) / (4*getPhi()) );
    }
    
    public double jari_jari_L() {
        return Math.sqrt(getLuas_permukaan() / ( 4 * getPhi()));
    }
    
}
