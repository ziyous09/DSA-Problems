package oops.interfaces;

public class Main {
    public static void main(String [ ] args){
        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.stopMusic();
        car.stop();
        car.upgradeEngine();
        car.start();
        car.stop();
    }
}
