package OPPS;

/**
 * Lamp
 */
public class Lamp {

    //Stores the value for light
    // ture if light is on
    // false if light is off

    boolean isOn;

    // Method to turn on the light
    void turnOn(){
        isOn = true;
        System.out.println("Light on? "+isOn);
    }

    void turnOff(){
        isOn = false;
        System.out.println("Light off? "+isOn);
    }

    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOff();
        halogen.turnOn();
    }
}