package oops.interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Starting the Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the Electric Engine");
    }
    @Override
    public void acc(){
        System.out.println("Accelerating the Electric Engine");
    }
}
