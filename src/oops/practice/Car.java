package oops;

public class Car extends Vehicle {
    private String bodyStyle;
    public int fuelCap = 30;
    Car(String make, String color, String model, int year, String bodyStyle){
        super(make,color,model,year);
        this.bodyStyle = bodyStyle;
    }
    public void carDetails(){
        showDetails();
        System.out.println(bodyStyle);
    }
    public void getFuelCap(){
        System.out.println(fuelCap);
        System.out.println(super.fuelCap);
    }

}
