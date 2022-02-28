/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
public class Kerucut extends Lingkaran implements BangunRuang {
    private double tinggi;
    private double selimut;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSelimut() {
        return selimut;
    }

    public void setSelimut(double selimut) {
        this.selimut = selimut;
    }
    
    @Override
    public double volume() {
        return 1.0/3.0 * getPhi() * getJarijari() * getJarijari() * getTinggi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double luas_permukaan() {
         return  getPhi() * getJarijari() * (getJarijari() + getSelimut() ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double luas_selimut() {
        return getPhi() * getJarijari() * getSelimut(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
