import java.util.*;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt(5);

        if(age>18){
            System.out.println("This is an Adult "+age);
        }
        else System.out.println("This is not an Adult");

    }
}
