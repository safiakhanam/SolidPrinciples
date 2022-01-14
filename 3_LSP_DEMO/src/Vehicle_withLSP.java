class Engine2 {
    private String model;
    private String chassisNo;
}

class TransportationDevice2
{
    String name;
    String getName() {
        return this.name;
    }
    void setName(String n) {
        this.name = n;
    }
    double speed;
    double getSpeed() {
        return this.speed;
    }
    void setSpeed(double d) {
        this.speed = d;
    }
}

class DevicesWithEngines extends TransportationDevice2
{
    Engine2 engine;

    Engine2 getEngine() {
        return this.engine;
    }
    void setEngine(Engine2 e) {
        this.engine = e;
    }
    public void startEngine() {
        System.out.println("Engine started");
    }
}

class DevicesWithoutEngines extends TransportationDevice
{
    void startMoving() {
        System.out.println("Vehicle started moving");
    }
}

class Car2 extends DevicesWithEngines
{
    @Override
    public void startEngine() {
        System.out.println("Car Engine started");
    }
}

class Bicycle2 extends DevicesWithoutEngines
{
    @Override
    public void startMoving(){
        System.out.println("Bicycle started moving");
    }
}

public class Vehicle_withLSP{
    public static void main(String[] args){
        System.out.println("\nDemo to demonstrate Following the LSP rule");

        Car2 carObj = new Car2();
        carObj.startEngine();

        Bicycle2 bicycleObj = new Bicycle2();
        bicycleObj.startMoving();
    }


}
