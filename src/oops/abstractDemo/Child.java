package oops.abstractDemo;

public class Child extends Parent{

    @Override
    public void greeting() {
        System.out.println("Good Morning");
    }

    @Override
    public void greeting1(String name) {
        System.out.println("Good Morning "+name);
    }
    @Override
    public void normal(){
        int n= 10;
        System.out.println(n);
    }
}
