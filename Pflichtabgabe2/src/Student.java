public class Student extends Person{
    // Attribute
    private int matrikelnr;

    // Konstruktor
    public Student(int matrikelnr, String name, char geschlecht) throws IllegalArgumentException{
        super(name, geschlecht);

        if (matrikelnr < 100000 || matrikelnr > 999999){
            throw new IllegalArgumentException("Matrikelnummer muss sechsstellig sein und darf keine führenden Nullen haben");
        }

        this.matrikelnr = matrikelnr;
    }

    // Setter & Getter für Fachbereichsnummer
    public void setMatrikelnr(int matrikelnr){
        this.matrikelnr = matrikelnr;
    }
    public int getMatrikelnr(){
        return matrikelnr;
    }

    // toString Methode, welche Objekte der Klasse Student als String zurückgibt
    @Override
    public String toString(){
        return "Student: "+super.toString()+ " & Matrikelnummer=" + matrikelnr;
    }
}
