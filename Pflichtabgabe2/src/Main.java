import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Lucy", 'w');
        Person p2 = new Person("Julian", 'm');
        Person p3 = new Person("Emma", 'w');

        Docent d1 = new Docent(6,"Alexander", 'w');

        Student s1 = new Student(256921,"Emma", 'w');

        Administration a1 = new Administration(p1,p2,s1,d1);

       a1.printList(a1.list);



        System.out.println("------------------------");
    }
}