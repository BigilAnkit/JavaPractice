public class MultiDimensional {
    public static void main(String args[]){
        // create a 2d array
        int [][] a = {{1,2,3},{4,5,6,9},{7}};

        // System.out.println("Length of row 1: "+a[0].length);
        // System.out.println("Length of row 2: "+a[1].length);
        // System.out.println("Length of row 3: "+a[2].length);

        //iterate through for loop
        // for(int row=0; row<a.length; ++row){
        //     for(int col=0; col<a[row].length; ++col){
        //         System.out.print(" "+a[row][col]);
        //     }
        //     System.out.println();
        // }

        // iterate through forEach loop

        // for(int [] innerArray:a){
        //     for(int data : innerArray){
        //         System.out.print(" "+data);

        //     }
        //     System.out.println();
        // }

        // create a 3d array
        int [][][] test = {
            {
                {1,-2,3},
                {2,3,4}
            },
            {
                {-4,-5,6,9},
                {1},
                {2,3}
            }
        };

        for (int row = 0; row < test.length; row++) {
            for (int column = 0; column < test[row].length; column++) {
                for (int depth = 0; depth < test[row][column].length; depth++) {
                    System.out.print(test[row][column][depth] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }    
}
