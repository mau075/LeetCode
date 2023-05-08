/**
    1572. Matrix Diagonal Sum
    @author Brisa Castillo
    @version 08 April 2023 04:02 BOT
 */

public class diagonalSum {
    public static int diagonalSum(int[][] mat) {
        int total = 0;
        int inverse = mat.length - 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]);
                if(i==j) total += mat[i][j];
                if(j==inverse) {
                    total += mat[i][j];
                    inverse -= 1;
                }
            }
            System.out.println();
        }
        if(mat.length % 2 != 0)
            return total - mat[mat.length/2][mat.length/2];
        else
            return total;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}
