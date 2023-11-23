public class Rechteck extends Figur {
    public double laenge;
    public double breite;

    public Rechteck(double laenge, double breite) {
        super();
        this.laenge = laenge;
        this.breite = breite;
    }

    public Rechteck(int x, int y, double laenge, double breite) {
        super(x, y);
        this.laenge = laenge;
        this.breite = breite;
    }

    public Rechteck(Punkt punkt, double laenge, double breite) {
        super(punkt);
        this.laenge = laenge;
        this.breite = breite;
    }

    public Rechteck(double laenge, double breite, String farbe) {
        super(farbe);
        this.laenge = laenge;
        this.breite = breite;
    }

    public Rechteck(int x, int y, double laenge, double breite, String farbe) {
        super(x, y, farbe);
        this.laenge = laenge;
        this.breite = breite;
    }

    public Rechteck(Punkt punkt, String farbe, double laenge, double breite) {
        super(punkt, farbe);
        this.laenge = laenge;
        this.breite = breite;
    }

    public double berechneFlaeche() {
        return laenge * breite;
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "laenge=" + laenge +
                ", breite=" + breite +
                "} " + super.toString();
    }
}
