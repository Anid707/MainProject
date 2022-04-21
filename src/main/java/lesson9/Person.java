package lesson9;

public class Person extends Object{
    public Person(String name, String lastName, int year){ // Person(String, String, int)
        this.year = year;
        this.name = name;
        this.lastName = lastName;
    }
    public Person(String name, String lastName){ // Person(string,String)
        this.name = name;
        this.lastName = lastName;
    }
    public  Person(){} // Person()

    private String name;
    private String lastName;
    private int year;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setYear(int year) {
        if(year>2022 || year<1900){
            throw new IllegalArgumentException("Wrong year - year should be in diapason 1900-2022");
        }
        this.year=year;
    }

}
