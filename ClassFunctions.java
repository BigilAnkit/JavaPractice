import java.util.*;
public class ClassFunctions {
    
    /**
     * RaduisCalcuate
     */
   
     class  Loop{
        //infinit
        int loop(int n) {
            int ans = n;
            
            // Create a new thread for the infinite loop
            new Thread(() -> {
                do {
                    for (int i = 0; i < n; i++) {
                        System.out.println("Hare Krishna");
                    }
                } while (true);
            }).start();
            
            return ans;
        }
    }

    protected class RaduisCalcuate {
        int container(int n){
            return n*n;
        }    
    }

    protected class CheckEligiblety {
    int eligibleOrNot(int n){
        if(n>=18){
            return n;
        }
        else return n;
    }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius value");
        int r = sc.nextInt();
        System.out.println("Enter the age of person");
        int age = sc.nextInt();

        sc.close();

        ClassFunctions radius = new ClassFunctions();
        RaduisCalcuate calculate = radius.new RaduisCalcuate();
        CheckEligiblety check = radius.new CheckEligiblety();
        Loop infinite = radius.new Loop();

        int answer = calculate.container(r);
        System.out.println(" Answer radius :-> "+answer);

        answer = check.eligibleOrNot(age);

        if(answer>18){
            System.out.println("Elegible for Vote :-> "+answer);

        }
        else System.out.println("Not Elegible for Vote :-> "+answer);

        answer = infinite.loop(answer);

    }
}
