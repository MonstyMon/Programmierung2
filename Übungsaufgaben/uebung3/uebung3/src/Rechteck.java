public class Rechteck extends Figur{

    private int breite;
    private int laenge;

    public Rechteck(int st, Punkt p){
        super(p);
        breite = st;
    }

    public int berechneFlaeche(){
        return -1;
    }
}
