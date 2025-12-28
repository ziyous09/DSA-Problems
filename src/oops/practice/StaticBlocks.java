package oops;

public class StaticBlocks {
    static int a=5;
    static int b;

    static void math(int x){
        System.out.println("x:"+x);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    static{
        System.out.println("Static block is initialized");
        b=a*4;
    }

    static void main() {
        math(45);
    }

}
