public class Docent extends Person{
    // Attribute
    private int department;

    // Konstruktor
    public Docent(int department, String name, char geschlecht) throws IllegalArgumentException{
        super(name, geschlecht);

        if (department < 1 || department > 6){
            throw new IllegalArgumentException("Department must lay between 1 and 6");
        }

        this.department = department;
    }

    // Setter & Getter für Fachbereichsnummer
    public void setDepartment(int department){
        this.department = department;
    }
    public int getDepartment(){
        return department;
    }

    // toString Methode, welche Objekte der Klasse Docent als String zurückgibt
    @Override
    public String toString(){
        return "Docent: "+super.toString()+ " & Department number=" + department;
    }
}
