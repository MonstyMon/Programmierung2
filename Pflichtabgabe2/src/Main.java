import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Lucy", 'w');
        Person p2 = new Person("Julian", 'm');
        Person p3 = new Person("Emma", 'w');

        Docent d1 = new Docent(2,"Alexander", 'w');

        Student s1 = new Student(256921,"Emma", 'w');

        Administration a1 = new Administration(p1,p2,s1,d1);

        System.out.println(Arrays.toString(a1.getDocents(2)));
        System.out.println(a1.countFemale());
        System.out.println(a1.toString());

        Person[] list = {p1,p2,p3};
        a1.printList(list);

        System.out.println("------------------------");
    }
}