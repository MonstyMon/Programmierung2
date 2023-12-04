public class Person {
    // Attribute
    public String name;
    public char geschlecht;

    // Konstruktor
    public Person(String name, char geschlecht){
        this.name = name;
        this.geschlecht = geschlecht;
    }

    // Setter & Getter für Name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    // Setter & Getter für Geschlecht
    public void setGeschlecht(char geschlecht){
        this.geschlecht = geschlecht;
    }
    public char getGeschlecht(){
        return geschlecht;
    }

    // toString Methode, welche Objekte der Klasse Person als String zurückgibt
    @Override
    public String toString(){
        return "Name=" + name + " & Geschlecht=" +geschlecht ;
    }

}
