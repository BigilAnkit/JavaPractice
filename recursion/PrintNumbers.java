package recursion;

import java.util.Scanner;

class Recursion{
    void reverseNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        reverseNum(n-1);
    }

    void startNum(int n,int m){

        if(n==m){

            return;
        }

        System.out.println(n+" sum "+m);
        startNum(n+1,m);
    }

    void naturalSum(int n,int m,int sum){

        if(n==m){
            return;
        }
        sum=(n*(n-1)/2);

        System.out.println(n+" M "+sum);
        naturalSum(n+1,m,sum);
    }

    void factorial(int n,int fact){
        if(n==0){
            return;
        }
        fact*=n;
        System.out.println(fact);
        factorial(n-1,fact);
    }
}
public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum =0;
        Recursion recursion = new Recursion();
//        recursion.reverseNum(N);

//        recursion.startNum(N,M);
//        recursion.naturalSum(N,M,sum);
        recursion.factorial(N,1);
    }
}
