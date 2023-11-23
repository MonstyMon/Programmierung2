public class Quadrat extends Figur{
    // private Punkt anker;
    private int breite;

    public Quadrat(int st, Punkt p){
        super(p);
        breite = st;
    }

    public int berechneFlaeche(){
        return -1;
    }
}
