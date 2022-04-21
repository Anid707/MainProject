package lesson8;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Peterson";
        anna.year = 1998;

        Person david = new Person();
        david.name = "David";
        david.lastName = "Dole";
        david.year = 1999;


//        System.out.println(david.lastName);

        Person steve = new Person();
        steve.year = 1995;
        steve.name = "Steve";
        steve.lastName = "Wilson";

        Vehicle myCar = new Vehicle();
        myCar.color = "Violet";
        myCar.make = "Toyota";
        myCar.model = "Camry";

//        System.out.println(myCar.color+" "+myCar.year);
        myCar.drive();

        Vehicle irinasCar = new Vehicle();
        irinasCar.model = "3";
        irinasCar.make = "Tesla";
        irinasCar.year = 2021;
        irinasCar.color="White";
        irinasCar.drive();

        irinasCar.stopping();
        myCar.stopping();

        anna.sayHello("John");
        david.printInfo();
        steve.printInfo();
    }
}
