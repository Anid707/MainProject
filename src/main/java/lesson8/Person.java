package lesson8;

public class Person {
    public String name;
    public String lastName;
    public int year;

    public void sayHello(String name){
        System.out.println(this.name+" said hello to "+name);
    }

    public void printInfo(){
        System.out.println("Name: "+this.name+"\nLastName: "+lastName+"\nYear: "+this.year);
    }
}
