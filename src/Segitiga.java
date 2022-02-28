
public class Segitiga {
    double alas;
    double tinggi;
    double luas;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }
    
    public double luas() {
        return 0.5 * getAlas() * getTinggi();
    }
    
}
