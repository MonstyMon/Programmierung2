import org.junit.jupiter.api.Test;

public class GeometryTest  {

    public static void main(String[] args) {
        Figur f1 = new Figur(0,0, "blau");
        Rechteck r1 = new Rechteck(5, 6, "green");
        Quadrat q1 = new Quadrat(5, "yellow");
        System.out.println(q1);
        System.out.println(q1.berechneFlaeche());
        System.out.println(q1.berechneDiagonale());
        System.out.println(r1.berechneXAbstand(q1));
    }

    @Test
    public void testPunkt() {

    }
    @Test
    public void testColors() {

    }

    @Test
    public void testFigur() {

    }

    @Test
    public void testRechteck() {

    }

    @Test
    public void testQuadrat() {

    }
}
