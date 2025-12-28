package oops.polymorphism;

public class Circle extends Shapes{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }

    double area(){
        return 3.14*radius*radius;
    }
}
