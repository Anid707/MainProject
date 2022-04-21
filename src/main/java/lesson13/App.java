package lesson13;

public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        a=25;
        System.out.println("b="+b);


        Person p1 = new Person("Anna");
        Person p2 = p1;

        p1.setName("David");
        Person p3 = new Person("David");
        System.out.println("p2="+p2.getName());

        System.out.println(p1==p2);
        System.out.println(p1.equals(p3));

        Object p4 = new Person("Ddd");

    }
}
