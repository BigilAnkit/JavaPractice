import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        for(int i=1; i<num1; i++){
            if(i%2 !=0){
                System.out.println("Odd no. -> "+i);
            }
            else{
                System.out.println("Even no. -> "+i);
            }
        }
    }
}
