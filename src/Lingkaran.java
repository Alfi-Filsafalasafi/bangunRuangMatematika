
public class Lingkaran {
    private double jarijari;
    private double phi = 22.0 / 7.0;

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }
    
    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    
    public double luas() {
        return getPhi() * jarijari * jarijari;
    }
    public double keliling(){
    return 2 * 3.14 * jarijari;
    }
    
}
