/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class LimasSegiempat extends Persegi implements BangunRuang {
    
    private double alassegitiga;
    private double tinggisegitiga;
    private double sisisegiempat;
    private double sisisegiempat2;
    private double sisisegiempat3;
    private double sisisegiempat4;
    private double tinggi;
    private double bantuan;
    private double volume;
    private double luasPermukaan;

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
    
    public double getTinggisegitiga() {
        return tinggisegitiga;
    }

    public void setTinggisegitiga(double tinggisegitiga) {
        this.tinggisegitiga = tinggisegitiga;
    }
    
    public double getSisisegiempat() {
        return sisisegiempat;
    }
    
    public void setSisisegiempat(double sisisegiempat) {
        this.sisisegiempat = sisisegiempat;
    }
    
    public double getSisisegiempat2() {
        return sisisegiempat2;
    }
    
    public void setSisisegiempat2(double sisisegiempat2) {
        this.sisisegiempat2 = sisisegiempat2;
    }
    
        public double getSisisegiempat3() {
        return sisisegiempat3;
    }
    
    public void setSisisegiempat3(double sisisegiempat3) {
        this.sisisegiempat3 = sisisegiempat3;
    }
    
    public double getSisisegiempat4() {
        return sisisegiempat4;
    }
    
    public void setSisisegiempat4(double sisisegiempat4) {
        this.sisisegiempat4 = sisisegiempat4;
    }
      
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
         return 1.0 /3.0 * luas() * getTinggi();
    }

    @Override
    public double luas_permukaan() {
        bantuan = (getSisisegiempat() * getSisisegiempat()) + (4 * (getAlassegitiga() * getTinggisegitiga()/2));
        return 2 * bantuan;
    }
    
     public double panjang_v() {
        return 3.0 * getVolume() / getTinggi();
    }
     
      public double lebar_v() {
        return 3.0 * getVolume() / getTinggi();
    }
      
    public double tinggi_v() {
        return 3.0 * getVolume() / (getSisisegiempat() * getSisisegiempat());
    }
    
     public double luas_alas() {
        return getSisisegiempat() * getSisisegiempat();
    }
     
      public double keliling_alas() {
        return 4 * getSisisegiempat();
    }
    
    public double tinggi_luas_permukaan() {
        return (luas_permukaan() - (getSisisegiempat() * getSisisegiempat() / 2)) / getAlassegitiga();
    }

    @Override
    public double luas_selimut() {
        return 0;
    
    }
    
}
