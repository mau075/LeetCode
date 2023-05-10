/**
     59. Spiral Matrix II
     @author Brisa Castillo
     @version 10 April 2023 09:14 BOT
 */
public class generateMatrix {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;

        int direction = 1;
        int counter = 1;

        while(top <= bottom && left <= right){
            if (direction == 1){
                for (int i = left; i <= right ; ++i) {
                    matrix[top][i] = counter++;
                }
                ++top;
                direction = 2;
            } else if (direction == 2) {
                for (int i = top; i <=bottom ; ++i) {
                    matrix[i][right] = counter++;
                }
                --right;
                direction=3;
            } else if (direction == 3) {
                for (int i = right; i >= left ; --i) {
                    matrix[bottom][i] = counter++;
                }
                --bottom;
                direction = 4;
            } else if (direction == 4) {
                for (int i = bottom; i >= top ; --i) {
                    matrix[i][left] = counter++;
                }
                ++left;
                direction = 1;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] mat = generateMatrix(6);
        for (int[] x : mat) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
