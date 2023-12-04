import java.sql.Array;
import java.util.Arrays;
public class Administration implements AdministrationInterface{
    public final Person[] list;

    // a) Konstruktor
    public Administration(Person... person){
        this.list = person;
    }

    // Die Methode bekommt eine Liste von Personen übergeben, und liefert eine sortierte Liste dieser zurück.
    @Override
    public Person[] sortList() throws NullPointerException, IllegalStateException{
        if(list == null) throw new NullPointerException("List cannot be null");
        if(list.length == 0) throw new IllegalStateException("List cannot be empty");



        // Bubble Sort
        /*
        Person temp;
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j].getName().compareTo(list[j+1].getName()) > 0) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }*/
        return list;
    }


    // Methode, welche die Anzahl aller weiblichen Studenten zurückgibt
    // In der Methode wird überprüft, welche Personen weiblich sind und der Klasse Studenten angehören
    @Override
    public int countFemale() throws NullPointerException, IllegalStateException{

        if(list == null)throw new NullPointerException("List cannot be null");
        if(list.length == 0)throw new IllegalStateException("List cannot be empty");

        int counter = 0;

        for (Person person : list)
            if(person.getGeschlecht() == 'w' && person instanceof Student)
                counter++;
        return counter;
    }

    // Methode, welcher eine Departmentnummer und eine Liste von Dozenten übergeben wird.
    // In der Methode wird für jede Person der Liste, welche zur Klasse Dozent gehört, überprüft, ob sie dem gegebenen Department angehören.
    // Die Methode liefert eine Liste mit Dozenten zurück, welche der übergebenen Nummer angehören.
    @Override
    public Docent[] getDocents(int department) throws NullPointerException, IllegalStateException, IllegalArgumentException {
        if(list == null) throw new NullPointerException("List cannot be null");
        if(list.length == 0)throw new IllegalStateException("List cannot be empty");
        if (department <= 0)throw new IllegalArgumentException("Department number is not valid");

        Docent[] docents = new Docent[0];

        for (Person person : list){
            if (person instanceof Docent){
                docents = Arrays.copyOf(docents, docents.length + 1);
                docents[docents.length -1] = (Docent) person;
            }
        }
        return docents;
    }

    // Methode, welcher eine Liste von Personen übergeben wird und der diese als String zurückgibt
    @Override
    public void printList(Person[] list) throws NullPointerException{
        if (list == null)throw new NullPointerException("List cannot be Null");
        System.out.println(Arrays.toString(list));
    }

    // toString Methode, welche Objekte der Klasse Administration als String zurückgibt
    @Override
    public String toString(){
        return Arrays.toString(list);
    }
}
