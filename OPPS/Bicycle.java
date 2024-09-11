package OPPS;
import java.util.*;

/**
 * Bicycle
 */
public class Bicycle {

  static  int gear = 5;

    void braking(){
        System.out.println("Braking the cycle");
    }

    
public static void main(String[] args) {
    Bicycle sportsBicycle = new Bicycle();

    System.out.println(sportsBicycle.gear);
    sportsBicycle.braking();
}
    
}