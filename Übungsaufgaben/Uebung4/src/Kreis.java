public class Kreis extends Figur {

    private double radius;

    public String farbe;

    public Kreis() {
        super();
    }
    public Kreis(int x, int y) {
        super(x, y);
    }

    public Kreis(Punkt punkt) {
        super(punkt);
    }

    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Kreis{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
