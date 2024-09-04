import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentscore = sc.nextInt();
        
        

        if (studentscore>33){
            System.out.println("This is Good As well");
        }
        else if( studentscore<=89 || studentscore>= 59) System.out.println("this is also Good");
        else
        System.out.println("This is Good");

    }
}
