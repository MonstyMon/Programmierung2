public class Kreis extends Figur{
    private int radius;

    public Kreis(int radius, Punkt anker){
        super(anker);
        this.radius = radius;
    }

    public double berechneFlaeche(){
        return -1;
    }
}
