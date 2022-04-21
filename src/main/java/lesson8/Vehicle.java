package lesson8;

public class Vehicle {
    public int year;
    public String make;
    public String model;
    public String color;

    public void drive(){
        System.out.println(this.make+" "+this.model+" "+"Driving");
    }

    public void stopping(){
        System.out.println(color+" car has stopped");
    }

}
