package lesson10;

public class App {
    private final static int x = 1;
    public static void main(String[] args) {
        Person anna = new Person("Anna","Wilson",1995);
        System.out.println(anna);

        Student david = new Student("David","Dole",1999,"Math");
        System.out.println(david);

        Teacher mrJones = new Teacher("Jim","Jones",1985,"History");
        System.out.println(mrJones);

        mrJones.setGender("Male");

//        x=3;


    }
}
