import java.util.*;
public class Greater {

    

    int code(int n,int m){
        int ans = 0;

        if(n>m){
            ans = n;
        }
        else ans = m;

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 2 No. ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Greater greater = new Greater();

        int answer = greater.code(num1,num2);

        System.out.println("Greater No. is "+ answer);
    }
}
