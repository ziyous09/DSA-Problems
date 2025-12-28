package oops.polymorphism;

public class Triangle extends Shapes{
    private double base;
    private double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    void setBase(double base){
        this.base = base;
    }
    void setHeight(double height){
        this.height = height;
    }
     double area(){
        return 0.5*base*height;
     }
}
