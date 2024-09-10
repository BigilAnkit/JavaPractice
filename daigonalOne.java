import java.util.Scanner;

public class daigonalOne {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // int [][] twodarray = new int [rows][cols];

        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         twodarray[i][j]=sc.nextInt();
        //     }
        // }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==j){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
