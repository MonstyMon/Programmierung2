public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Lucy", 'w');
        System.out.println(p1.toString());

        Docent d1 = new Docent(2,"Alexander", 'w');
        System.out.println(d1.toString());

        Student s1 = new Student(256921,"Emma", 'w');
        System.out.println(s1.toString());

        System.out.println(s1.getGeschlecht());
    }
}