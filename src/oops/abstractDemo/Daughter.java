package oops.abstractDemo;

public class Daughter extends Parent{
    @Override
    public void greeting() {
        System.out.println("Good Afternoon! I am the Daughter");
    }

    @Override
    public void greeting1(String name) {
        System.out.println("Hello "+name+" i am the daughter");
    }
}
