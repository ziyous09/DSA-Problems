package oops;

public class Constructor {
    private int a;
    private int b;
    private int c;

    Constructor(){
        this.a = 10;
        this.b = 20;
        this.c = 30;
    }

    Constructor(int a ,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void displayValue(){
        System.out.println(a+" "+b+" "+c);
    }

}
