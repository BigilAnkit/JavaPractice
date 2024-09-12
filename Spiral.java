import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        int value = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        // To fill the matrix in spiral order
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 1
            for (int col = colStart; col <= colEnd; col++) {
                matrix[rowStart][col] = value++;
            }
            rowStart++;

            // 2
            for (int row = rowStart; row <= rowEnd; row++) {
                matrix[row][colEnd] = value++;
            }
            colEnd--;

            // 3
            for (int col = colEnd; col >= colStart; col--) {
                matrix[rowEnd][col] = value++;
            }
            rowEnd--;

            // 4
            for (int row = rowEnd; row >= rowStart; row--) {
                matrix[row][colStart] = value++;
            }
            colStart++;
        }

        // To print the spiral order matrix
        System.out.println("The Spiral Order Matrix is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
