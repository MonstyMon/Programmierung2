public class Student extends Person{
    // Attribute
    private int matrikelnr;

    // Konstruktor
    public Student(int matrikelnr, String name, char geschlecht){
        super(name, geschlecht);
        this.matrikelnr = matrikelnr;
    }

    @Override
    public String toString(){
        return super.toString()+ "Matrikelnummer: " + matrikelnr;
    }
}
