package oops.interfaces;

public class Car implements Engine,Brake{

    @Override
    public void start(){
        System.out.println("I am starting the engine");
    }

    @Override
    public void stop(){
        System.out.println("I am stopping the Engine");
    }

    @Override
    public void acc(){
        System.out.println("I am accelerating the Enigne");
    }

    @Override
    public void brake(){
        System.out.println("I am pressing brake of engine");
    }
}
