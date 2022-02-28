/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Kubus extends Persegi implements BangunRuang{

    private double volume ;
    private double luasPermukaan;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }
    @Override
    public double volume() {
        return luas() * getPanjang() ;
    }

    @Override
    public double luas_permukaan() {
        return 6 * luas();
    }

    @Override
    public double luas_selimut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double sisi_V(){
        return Math.cbrt(getVolume());
    }
    public double sisi_L(){
        return Math.sqrt(getLuasPermukaan()/6);
    }
}
