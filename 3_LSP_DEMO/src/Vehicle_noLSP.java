class Engine {
    private String model;
    private String chassisNo;
}

class TransportationDevice
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

    Engine engine;
    Engine getEngine() {
        return this.engine;
    }

    void setEngine(Engine e) {
        this.engine = e;
    }

    public void startEngine() {

        System.out.println("Engine started");
    }
}
class Car extends TransportationDevice
{
    @Override
    public void startEngine() {
        System.out.println("Car Engine started");
    }
}

class Bicycle extends TransportationDevice
{

    @Override
    public void startEngine(){

        System.out.println("Sorry!! No Engine in Bicycle");
    }/*problem!*/
}

public class Vehicle_noLSP{
    public static void main(String[] args){
        System.out.println("\nDemo to demonstrate violation the LSP rule");

        Car carObj = new Car();
        carObj.startEngine();

        Bicycle bicycleObj = new Bicycle();
        bicycleObj.startEngine();
    }


}