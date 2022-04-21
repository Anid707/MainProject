package lesson9;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String color;

    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
