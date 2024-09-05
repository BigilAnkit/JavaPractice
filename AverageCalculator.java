import java.util.Scanner;
class AverageCalculator{

    /**
     * SumOfOdd
     */
    public class SumOfOdd {  

        int sumNumber(int numbers){
           int total = 0;
           for(int i=0; i<numbers; i++){
            if(i%2!=0){
                total +=i;
            }
           }
            return total;
        }
    }

    float calculateAverage(int[] numbers){
        int sum = 0;
        for(int number:numbers){
            sum+=number;
        }
        return (float)sum/numbers.length;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elelment: ");
        int n = sc.nextInt();
        // int [] numbers = new int [n];
        // System.out.println("Enter the numbers ");
        // for(int i=0; i<n; i++){
        //     numbers[i] = sc.nextInt();
        // }
        AverageCalculator calculator = new AverageCalculator();
         SumOfOdd calculat = calculator.new SumOfOdd();
         int sum = calculat.sumNumber(n);

         System.out.println("Total odd number sum of : "+sum);
       
        // float average  = calculator.calculateAverage(numbers);

        // System.out.println("The average is: "+ average);
    }
}