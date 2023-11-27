public class Quadrat extends Rechteck{

    // Quadrat & Aufruf von Super
    public Quadrat(double laenge, Punkt p){
        super(laenge, laenge, p);
    }

    // Berechnungen
    public double berechneFlaeche(){
        return (laenge*laenge);
    }
    public double berechneDiagonale(){ return Math.sqrt(2)*laenge;}


    // Überschreiben der toString Methode
    @Override
    public String toString(){
        return "Quadrat{} " + super.toString();
    }
}
