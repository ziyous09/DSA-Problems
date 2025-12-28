package oops.inheritance;

public class Box {
    private int h;
    private int w;
    private int l;

    Box(){
        this.h =-1;
        this.l =-1;
        this.w =-1;
    }
    Box(int h, int w, int l){
        this.h = h;
        this.w = w;
        this.l = l;
    }
    Box(int side){
        this.h = side;
        this.l= side;
        this.w = side;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    void displayInformation(){
        System.out.println("Height: "+this.h+" Width: "+this.w+" Length: "+this.l);
    }

}
