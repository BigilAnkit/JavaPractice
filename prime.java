import java.util.Scanner;
/**
 * prime
 */
public class prime {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n<=1){
            System.out.println("This is neither prime nor composite");
        }
        else if( n ==2){
            System.out.println("This is a prime number");
        }
        else if(n%2 ==0){
            System.out.println("This is not a prime number");
        }
        else{
            boolean isPrime = true;
            for(int i=3; i<= Math.sqrt(n); i+=2){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println("This is a prime Number");
            }
            else{
                System.out.println(" This is not a prime Number");
            }
        }
    }
    
}