package oops;

public class Vehicle {
    private String make;
    private String color;
    private String model;
    private int year;
    public int fuelCap = 50;

    Vehicle(String make, String color, String model, int year){
        this.make = make;
        this.color = color;
        this.model = model;
        this.year = year;
    }
    void showDetails(){
        System.out.println(make);
        System.out.println(color);
        System.out.println(model);
        System.out.println(year);
    }
}
