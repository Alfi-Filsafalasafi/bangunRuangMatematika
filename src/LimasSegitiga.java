/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class LimasSegitiga extends Segitiga implements BangunRuang {

    double alassegitiga;
    double alassegitiga2;
    double alassegitiga3;
    double tinggisegitiga;
    private double tinggiLimas;
    double bantuan;
    double volume;
    double luasPermukaan;

    public double luas(){
        return super.luas();
    }
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
    
    public double getAlassegitiga() {
        return alassegitiga;
    }

    public void setAlassegitiga(double alassegitiga) {
        this.alassegitiga = alassegitiga;
    }
    
     public double getAlassegitiga2() {
        return alassegitiga2;
    }

    public void setAlassegitiga2(double alassegitiga2) {
        this.alassegitiga2 = alassegitiga2;
    }
    
     public double getAlassegitiga3() {
        return alassegitiga3;
    }

    public void setAlassegitiga3(double alassegitiga3) {
        this.alassegitiga3 = alassegitiga3;
    }
    
    public double getTinggisegitiga() {
        return tinggisegitiga;
    }

    public void setTinggisegitiga(double tinggisegitiga) {
        this.tinggisegitiga = tinggisegitiga;
    }
    

    
    @Override
    public double volume() {
         return 1.0/3.0 * ( luas() * getTinggiLimas());
    }

    @Override
    public double luas_permukaan() {
        bantuan = (getAlassegitiga() * getTinggisegitiga()/2) + (3 * (getAlassegitiga() * getTinggisegitiga()/2));
        return 2 * bantuan;
 
    }
    
    public double alassegitiga_v() {
         return 3 * getVolume() * 2 / (getTinggiLimas()* getTinggi());
    }
    
    public double tinggisegitiga_v() {
        return 3 * getVolume() * 2 / (getTinggi()* getAlas());
    }
    
    public double tinggi_v() {
        return 3 * getVolume() * 2 / (getAlas() * getTinggiLimas()) ;
    }
    
     public double luas_alas() {
        return luas();
    }
    
     public double keliling_alas() {
        return getAlassegitiga() * getAlassegitiga() * getAlassegitiga();
    }
    
    public double luas_sisitegak() {
        return 4 * (getAlassegitiga() * getTinggisegitiga()/2);
    }

    @Override
    public double luas_selimut() {
        return 0;
    
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }

    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }
    
}
