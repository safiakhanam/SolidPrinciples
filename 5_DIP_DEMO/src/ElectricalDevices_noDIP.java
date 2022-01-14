class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}

class ElectricPowerSwitch {
    public LightBulb lightBulb;
    public boolean on;
    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            lightBulb.turnOff();
            this.on = false;
        } else {
            lightBulb.turnOn();
            this.on = true;
        }
    }
}

public class ElectricalDevices_noDIP {
    public static void main(String[] strings){

        System.out.println("\nDemo to demonstrate violation the DIP rule\n");

        LightBulb wiproBulb = new LightBulb();
        ElectricPowerSwitch powerSwitch = new ElectricPowerSwitch(wiproBulb);

        powerSwitch.press();
        //Delay
        for(long i = 1000000000; i > 0; i--);
        powerSwitch.press();
    }
}
