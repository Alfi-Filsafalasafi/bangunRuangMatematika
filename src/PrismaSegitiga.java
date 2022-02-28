/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class PrismaSegitiga extends Segitiga implements BangunRuang {

    private double TinggiPrisma;
    private double luasAlas;
    private double kelAlas;
    private double volume;
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

    public double getLuasAlas() {
        return luasAlas;
    }

    public void setLuasAlas(double luasAlas) {
        this.luasAlas = luasAlas;
    }

    public double getKelAlas() {
        return kelAlas;
    }

    public void setKelAlas(double kelAlas) {
        this.kelAlas = kelAlas;
    }

    public double getTinggiPrisma() {
        return TinggiPrisma;
    }

    public void setTinggiPrisma(double TinggiPrisma) {
        this.TinggiPrisma = TinggiPrisma;
    }
    @Override
    public double volume() {
        return luas() * getTinggiPrisma();
    }

    @Override
    public double luas_permukaan() {
        return 2.0 * getLuasAlas() + getKelAlas() * getTinggiPrisma();
    }

    @Override
    public double luas_selimut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double TinggiPris_V(){
        return getVolume() / luas();
    }
    public double alasPris_V(){
        return getVolume() / getTinggiPrisma() / ( 0.5 * getTinggi());
    }
    public double tinggi_V(){
        return getVolume() / getTinggiPrisma() / ( 0.5 * getAlas());
    }
    
    public double Lalas_L(){
        return (getLuasPermukaan() - getKelAlas() * getTinggiPrisma()) / 2;
    }
    public double Kalas_L(){
        return (getLuasPermukaan() - 2 * getLuasAlas()) / getTinggiPrisma();
    }
    public double TinggiPris_L(){
        return (getLuasPermukaan() - 2 * getLuasAlas()) / getKelAlas();
    }
}
