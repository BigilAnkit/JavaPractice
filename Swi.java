import java.util.Scanner;

public class Swi {
    public static void main(String[] args) {
        System.out.println("Enter the no. do you want to print day :-> ");
        Scanner sc = new Scanner(System.in);
        

        String day = sc.next();
        // int num1 = sc.nextInt();

        switch (day) {
            case "Monday":
            case "monday":
                System.out.println("Monday");
                break;
                
            case "Tuesday":
            System.out.println("Tuseday");
            break;
            
            case "Wednesday":
                System.out.println("Wednsday");
                break;
                
            case "Thursday":
            System.out.println("Thusday");
            break;
            
            case "Friday":
                System.out.println("Friday");
                break;
                
            case "Saturday":
            System.out.println("Saturday");
            break;
            
            case "Sunday":
                System.out.println("Sunday");
                break;
        
            default:
            System.out.println("Wrong Input");
                break;
        }
    }
}
