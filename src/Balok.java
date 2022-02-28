/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Balok extends Persegi implements BangunRuang {

    private double tinggi ;
    private double bantuan ;
    
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
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    @Override
    public double volume() {
         return tinggi * luas() ;
    }
    @Override
    public double luas_permukaan() {
        bantuan = getPanjang() * getLebar() + getPanjang() * getTinggi() + getLebar() * getTinggi();
        return 2 * bantuan;
 
    }
    
    public double tinggi_v() {
        return getVolume() / (getPanjang() * getLebar()) ;
    }
    
    public double panjang_v() {
        return getVolume() / ( getLebar() * getTinggi());
    }
    public double lebar_v() {
        return getVolume() / ( getPanjang() * getTinggi());
    }
    
    public double panjang_l() {
        return (getLuasPermukaan() / 2.0 - getLebar() * getTinggi()) / (getLebar() + getTinggi()) ;
    }
    public double lebar_l() {
        return (getLuasPermukaan() / 2.0 - getPanjang() * getTinggi()) / (getPanjang() + getTinggi()) ;
    }
    public double tinggi_l() {
        return (getLuasPermukaan() / 2.0 - getPanjang() * getLebar()) / (getPanjang() + getLebar()) ;
    }

    @Override
    public double luas_selimut() {
        return 0;
    
    }
    
}
