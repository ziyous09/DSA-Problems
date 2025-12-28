package oops.inheritance;

public class Main {
    static void main() {
//        Box box = new Box();
//        Box box1 = new Box(5,50,51);
//        Box box2 = new Box(box1);
//        box.displayInformation();
//        box1.displayInformation();
//        box2.displayInformation();
        BoxWeigth box = new BoxWeigth(2,5,8,188);
//        box.displayDetails();
        BoxWeigth box1 = new BoxWeigth(box);
        box1.displayDetails();


    }
}
