public class Player {

    private final Car car = new Car();

    public void turnOn(){
        car.TurnOn();
    }
    public void speedUp(){
        car.go();
    }
    public void stepBreak(){
        car.stop();
    }
    public void turnOff(){
        car.turnOff();
    }

}
