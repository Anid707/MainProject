package lesson9;

public class App {
    public static void main(String[] args) {
        Person anna1 = new Person();
        Person anna = new Person("Anna", "Peterson",1997);
        anna.setName("Anna");
        anna.setLastName("Peterson");

        System.out.println(anna.getName());
        anna.setYear(1899);

        Person david = new Person("David","wilson");
        david.setYear(1995);


        Person steve = new Person();

        Vehicle myCar = new Vehicle();
        myCar.setColor("Green");
        myCar.setMake("Toyota");
        myCar.setYear(2011);
        myCar.setModel("Prius");
    }

}
