interface Switch {
    boolean isOn();
    void press();
}

interface Switchable {
    void turnOn();
    void turnOff();
}

class ElectricPowerSwitch2 implements Switch {
    public Switchable client;
    public boolean on;
    public ElectricPowerSwitch2(Switchable client) {
        this.client = client;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }
    }
}

class LightBulb2 implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}


public class ElectricalDevices_withDIP {
    public static void main(String[] args) {
        System.out.println("\nDemo to demonstrate Following the DIP rule\n");

        Switchable switchableBulb = new LightBulb2();
        Switch bulbPowerSwitch = new ElectricPowerSwitch2(switchableBulb);
        bulbPowerSwitch.press();
        //Delay
        for(long i = 1000000000; i > 0; i--);
        bulbPowerSwitch.press();
        System.out.println("\n");

        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch2(switchableFan);
        fanPowerSwitch.press();
        //Delay
        for(long j = 1000000000; j > 0; j--);
        fanPowerSwitch.press();


    }
}
