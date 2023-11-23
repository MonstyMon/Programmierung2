public class Quadrat extends Rechteck {
    public Quadrat (double breite) {
        super(breite, breite);
    }
    public Quadrat (double breite, String farbe) {
        super(breite, breite, farbe);
    }

    @Override
    public String toString() {
        return "Quadrat{} " + super.toString();
    }

    public double berechneDiagonale() {
        return Math.sqrt(2) * breite;
    }
}
