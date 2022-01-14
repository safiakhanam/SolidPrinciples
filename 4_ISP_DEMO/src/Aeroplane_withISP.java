interface Vehicle2 {
    void setPrice(double price);
    void setColor(String color);
}

interface Movable {
    void start();
    void stop();
}

interface Flyable {
    void fly();
}

class Car2 implements Vehicle2, Movable {
    double price;
    String color;

    @Override
    public void setPrice(double price) {

        this.price = price;
    }
    @Override
    public void setColor(String color) {

        this.color=color;
    }
    @Override
    public void start(){
        // Implementation
    }
    @Override
    public void stop(){
        // Implementation
    }
}
 class Aeroplane implements Vehicle2, Movable, Flyable {
    double price;
    String color;

    @Override
    public void setPrice(double price) {

        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }
    @Override
    public void start(){
        // Implementation
    }
    @Override
    public void stop(){
        // Implementation
    }
    @Override
    public void fly(){
        // Implementation
    }
}

public class Aeroplane_withISP {
    public static void main(String[] args){

    }
}