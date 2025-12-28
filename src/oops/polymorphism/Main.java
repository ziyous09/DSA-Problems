package oops.polymorphism;

public class Main {
    static void main() {
        Shapes [] shapes = new Shapes[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Triangle(4,9);
        System.out.println(shapes[0].area());
        System.out.println(shapes[1].area());
    }
}
