package lesson15;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna");
        System.out.println(anna.getCountC());
        System.out.println(anna.getCountX());

        Person david = new Person("David");
        System.out.println(anna.getCountC());
        System.out.println(anna.getCountX());
        System.out.println(david.getCountC());

        Person steve = new Person("Steve");
        System.out.println(anna.getCountC());
        System.out.println(anna.getCountX());


        Person.hi();
        hello();
    }
    public static void hello(){
        System.out.println("hello");
    }
}
