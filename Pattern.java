import java.util.Scanner;

/**
 * Pattern
 */

public class Pattern {

    void pattern15(int num1){
        int n= num1;
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *


//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1


        //upper part
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // lower part
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern14(int num1){
        int len = num1;
        
//      1
//     212
//    32123
//   4321234
//  543212345

        for(int i=1; i<=len; i++){
            //spaces
            for(int j=1; j<=len-i; j++){
                System.out.print(" ");
            } 
            // first part
            for(int j=i; j>=1; j--){
                System.out.print(" "+j);
            }

            // second part
            for(int j=2; j<=i; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    void pattern13(int n2){
        int index = n2;
// 1
// 0 0
// 1 1 1
// 0 0 0 0
// 1 1 1 1 1
        for(int i=1; i<= index; i++){
            for(int j=1; j<=i; j++){
                if((i+1) % 2 ==0)
                System.out.print(1+" ");
                else
                    System.out.print(0+" ");  
            }
            System.out.println(); 
        }
    }

    void pattern12(int n1,int n2){
        int index = n1, index2 = n2;
// *****
// *   *
// *   *
// *   *
// *****

        for(int i=0; i<index; i++){
            for(int j=0; j<index2; j++){
                if(i==0 || i==index-1 || j==0 || j==index2-1){
                 
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }

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
        // pattern.pattern11(num1);
        // pattern.pattern12(num1,num2);
        // pattern.pattern13(num1);
        // pattern.pattern14(num1);
        pattern.pattern15(num1);
    }
}