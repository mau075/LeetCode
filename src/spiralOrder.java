import com.sun.javafx.image.IntPixelGetter;

import java.util.*;

/**
    54. Spiral Matrix
    @author Brisa Castillo
    @version 09 April 2023 12:05 BOT
 */
public class spiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;

        int direction = 1;
        List<Integer> list = new LinkedList<>();

        while(top <= bottom && left <= right){
            if (direction == 1){
                for (int i = left; i <= right ; ++i) {
                    list.add(matrix[top][i]);
                }
                ++top;
                direction = 2;
            } else if (direction == 2) {
                for (int i = top; i <=bottom ; ++i) {
                    list.add(matrix[i][right]);
                }
                --right;
                direction=3;
            } else if (direction == 3) {
                for (int i = right; i >= left ; --i) {
                    list.add(matrix[bottom][i]);
                }
                --bottom;
                direction = 4;
            } else if (direction == 4) {
                for (int i = bottom; i >= top ; --i) {
                    list.add(matrix[i][left]);
                }
                ++left;
                direction = 1;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(spiralOrder(mat));
    }
}
