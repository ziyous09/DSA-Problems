package oops.polymorphism;

public class Square extends Shapes{
    private double side;

    Square(double side){
        this.side = side;
    }
    double area(){
        return side*side;
    }
}
