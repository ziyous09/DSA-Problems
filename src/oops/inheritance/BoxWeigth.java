package oops.inheritance;

public class BoxWeigth extends Box{
    private int weight;

    BoxWeigth(){
        this.weight = -1;
    }
    BoxWeigth(int h, int w, int l, int weight){
        super(h,w,l);
        this.weight = weight;
    }
    BoxWeigth(BoxWeigth other){
        super(other);
        this.weight = other.weight;
    }
    void displayDetails(){
        super.displayInformation();
        System.out.print("Weight: "+ this.weight);
    }
}
