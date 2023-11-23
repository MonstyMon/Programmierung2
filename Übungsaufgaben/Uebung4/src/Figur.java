public class Figur {
    private Punkt anker;
    public String farbe;

    public Figur() {
        this.farbe = null;
        anker = new Punkt(0,0);
    }
    public Figur(String farbe) {
        this.farbe = farbe;
        anker = new Punkt(0,0);
    }
    public Figur(int x, int y, String farbe) {
        this.farbe = farbe;
        anker = new Punkt(x,y);
    }
    public Figur(int x, int y) {
        this.farbe = null;
        anker = new Punkt(x,y);
    }

    public Figur(Punkt punkt, String farbe) {
        anker = punkt;
        this.farbe = farbe;
    }
    public Figur(Punkt punkt) {
        anker = punkt;
        this.farbe = null;
    }

    public Punkt getAnker() {
        return anker;
    }

    public void setAnker(Punkt anker) {
        this.anker = anker;
    }

    public Figur verschiebeAnker(Punkt anker) {
        this.anker.verschiebe(anker);
        return this;
    }

    public int berechneXAbstand(Figur f) {
        return getAnker().getX() - f.getAnker().getX();
    }

    public String getFarbe() {
        return farbe;
    }

    @Override
    public String toString() {
        return "Figur{" +
                "anker=" + anker + ", " +
                "farbe=" + farbe +
                '}';
    }
}
