package oops.abstractDemo;

public class Main {
    public static void main(String [] args){
        Child child = new Child();
        Daughter daughter = new Daughter();
        child.greeting();
        child.greeting1("Kunal");
        daughter.greeting();
        daughter.greeting1("Nisha");
        Parent.greeting2();
        child.normal();
    }
}
