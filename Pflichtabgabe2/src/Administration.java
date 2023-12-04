import java.sql.Array;
import java.util.Arrays;
public class Administration implements AdministrationInterface{
    private final Person[] person;

    // a) Konstruktor
    public Administration(Person... person) throws NullPointerException, IllegalStateException{
        if(person == null) throw new NullPointerException("List cannot be null");
        if(person.length == 0) throw new IllegalStateException("List cannot be empty");

        this.person = person;
    }

    // b) Sortieren nach Namen
    @Override
    public Person[] sortList() throws NullPointerException, IllegalStateException{
        if(sortList() == null) throw new NullPointerException("List cannot be null");
        if(sortList().length == 0) throw new IllegalStateException("List cannot be empty");


        return sortList();
    }

    // c) Anzahl weiblicher Studenten zurückgeben
    @Override
    public int countFemale() throws NullPointerException, IllegalStateException{

        if(person == null)throw new NullPointerException("List cannot be null");
        if(person.length == 0)throw new IllegalStateException("List cannot be empty");

        int counter = 0;

        for (Person person : person)
            if(person.getGeschlecht() == 'w' && person instanceof Student)
                counter++;
        return counter;
    }

    // d) Anzahl aller Dozenten von Fachbereich x
    @Override
    public Docent[] getDocents(int department) throws NullPointerException, IllegalStateException, IllegalArgumentException {
        if(person == null) throw new NullPointerException("List cannot be null");
        if(person.length == 0)throw new IllegalStateException("List cannot be empty");
        if (department <= 0)throw new IllegalArgumentException("Department number is not valid");

        Docent[] docents = new Docent[0];

        for (Person person : person){
            if (person instanceof Docent){
                docents = Arrays.copyOf(docents, docents.length + 1);
                docents[docents.length -1] = (Docent) person;
            }
        }
        return docents;
    }

    @Override
    public void printList(Person[] list) throws NullPointerException{
        if (list == null)throw new NullPointerException("List cannot be Null");
        System.out.println(Arrays.toString(list));
    }

    @Override
    public String toString(){
        return Arrays.toString(person);
    }
}
