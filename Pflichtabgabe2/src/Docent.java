public class Docent extends Person{
    // Attribute
    private int fachbereichnr;

    // Konstruktor
    public Docent(int fachbereichnr, String name, char geschlecht){
        super(name, geschlecht);
        this.fachbereichnr = fachbereichnr;
    }

    @Override
    public String toString(){
        return super.toString()+ "Fachbereichsnummer: " + fachbereichnr;
    }
}
