public class Vektor2D {
    private float delX, delY;
    private Punkt anker;

    public Vektor2D(float delX, float delY, Punkt anker) {
        this.delX = delX;
        this.delY = delY;
        this.anker = anker;
    }

    public String toString() {
        return "(" + delX + ", " + delY + "), anker: (" +
                anker.getX() + ", " + anker.getY() + ")";
    }
}
