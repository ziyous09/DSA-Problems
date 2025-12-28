package oops.abstractDemo;

public abstract class Parent {
    public abstract void greeting();
    public abstract void greeting1(String name);
    static void greeting2(){
        System.out.println("Hello from parent");
    }
    void normal(){
        System.out.println("Normal");
    }
}
