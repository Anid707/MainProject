package lesson15;

public class Person {
    private String name;
    private static int countC;
    private int countX;

    public Person(String name) {
        this.name = name;
        countC++;
        countX++;
    }

    public String getName() {
        return name;
    }

    public int getCountC() {
        hi();
        return countC;
    }

    public int getCountX() {
        return countX;
    }

    public static void hi(){
        System.out.println("Hi");
        System.out.println(countC);
    }
}
