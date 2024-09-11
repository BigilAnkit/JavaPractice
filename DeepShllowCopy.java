import java.util.Arrays;
public class DeepShllowCopy {
    public static void main(String[] args) {
        
        // int [] numbers = {1,2,3,4,5,6};
        // int [] positiveNumbers = numbers;

        // // change value of first array  ShallowCopy
        // numbers[0] =-1;

        // for(int number:positiveNumbers){
        //     System.out.print(number+", ");
        // }

        int [] source = {1,2,3,4,5,6};
        int [] destination= new int[6];

        // iterate and copy element for source to destination DEEP COPY
        for(int i=0; i<source.length; ++i){
            destination[i]= source[i];
        }

        System.out.println(Arrays.toString(destination));


    }
}
