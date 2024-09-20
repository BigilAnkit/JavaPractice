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

    void fibonaccisquence(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(a);
//        System.out.println(n);
//        System.out.println(b);
        fibonaccisquence(b,c,n-1);
    }

    void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" From "+src+" to "+dest);
            return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1,src,dest,helper);

        //transfer nth from src to dest
        System.out.println("Transfer disk "+n+" From "+ src +"to"+helper);

        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1,helper,src,dest);
    }

    String reverString(String str){
        if(str.length()==1){
            return str;
        }

        char  currChar = str.charAt(0);
        String nextString = reverString(str.substring(1));
        return nextString + currChar;
    }
}
public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int sum =0;
        Recursion recursion = new Recursion();
//        recursion.reverseNum(N);

//        recursion.startNum(N,M);
//        recursion.naturalSum(N,M,sum);
//        recursion.factorial(N,1);

//        recursion.fibonaccisquence(0,1,15);
//        recursion.towerOfHanoi(N,"A","B","c");
        String str = "abcd";
     String reverse =     recursion.reverString(str);
        System.out.println(reverse);
    }
}
