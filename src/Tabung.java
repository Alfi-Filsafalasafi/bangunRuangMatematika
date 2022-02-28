/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Tabung extends Lingkaran implements BangunRuang {
    
    double tinggi;
    double volume;
    double luaspermukaan;

    
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double getLuaspermukaan() {
    return luaspermukaan;
    }
    public void setLuaspermukaan (double luaspermukaan){
    this.luaspermukaan = luaspermukaan; }

    
    @Override
    public double volume() {
          return getTinggi() * luas() ;
    }

    @Override
    public double luas_permukaan() {
        return (keliling() * tinggi) + (2 * luas());
    }
    
    public double jari_volume() {
       return Math.sqrt(getVolume() / ( getPhi() * getTinggi()));
    }
    
     public double tinggi_volume() {
     return (getVolume() / (3.14 * getJarijari() * getJarijari()));
    }
     
     public double jari_luaspermukaan() {
    return 0;
    }
     
public double tinggi_luaspermukaan() {
   return (getLuaspermukaan() /( 2 * getPhi() * getJarijari())) - getJarijari();
    }
    
    
    @Override
    public double luas_selimut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
