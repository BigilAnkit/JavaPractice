import java.util.Scanner;

/**
 * Pattern
 */

public class Pattern {

    void pattern11(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
        
    }

    void pattern10(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
    void pattern9(int n){
        int count=1;
        for(int k= 1; k<=n; k++){
            for(int m = 1; m<=k; m++){
                System.out.print(" "+count++);
            }
            System.out.println(" ");
        }
    }

    void pattern7(int n){
        for(int z=n; z>=0; z--){
            for(int j=1; j<=z; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    void pattern8(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
    void pattern6(int n){
        for(int z=1; z<=n; z++){
            for(int q=z; q<=n; q++){
                System.out.print(q);
            }
            System.out.println(" ");
        }
    }
    void pattern5(int n1, int n2){
        for(int i=1; i<=n1; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    void pattern4(int n1,int n2){
        for(int i=1; i<=n1; i++){
            for(int j=i; j<=n2; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    void pattern3(int n1, int n2){
        for(int i=1; i<=n1; i++){
            for(int j=i; j<=n2; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    void pattern2(int n,int n2){
        for(int i=0; i<=n; i++ ){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    void pattern1(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        int n = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number :-> ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number :-> ");
        int num2 = sc. nextInt();
        Pattern pattern = new Pattern();
        sc.close();
        // pattern.pattern1(n);
        // pattern.pattern2(num1,num2);
        // pattern.pattern3(num1,num2);
        // pattern.pattern4(num1,num2);
        // pattern.pattern5(num1, num2);
        // pattern.pattern7(num1);
        // pattern.pattern8(num1);
        // pattern.pattern9(num1); 
        // pattern.pattern10(num1);
        pattern.pattern11(num1);
    }
}