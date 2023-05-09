public class CodeSnippets {
    public static void main(String[] args) {
        // Iterate through matrix
        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
