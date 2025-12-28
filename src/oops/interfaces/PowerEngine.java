package oops.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starting Power Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stoping the Power Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating the Power Engine");
    }
}
