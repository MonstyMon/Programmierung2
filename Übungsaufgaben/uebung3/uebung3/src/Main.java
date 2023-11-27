public class Main {
    public static void main(String[] args) {


        Punkt p1 = new Punkt(1,2);
        Kreis k1 = new Kreis(2, p1);
        System.out.println(k1.berechneFlaeche());

        Quadrat q1 = new Quadrat(3, p1);
        System.out.println(q1.berechneFlaeche());
    }
}