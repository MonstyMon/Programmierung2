public class Rechteck extends Figur{
    public double laenge;
    public double breite;

    public Rechteck(double laenge, double breite, Punkt p){
        super(p);
        this.laenge = laenge;
        this.breite = breite;
    }

    public double berechneFlaeche(){
        return (breite*laenge);
    }
}
