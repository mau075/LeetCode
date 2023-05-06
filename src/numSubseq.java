import java.util.ArrayList;
import java.util.Collections;

/*
    1498. Number of Subsequences That Satisfy the Given Sum Condition
*/
public class numSubseq {
    static int counter = 0;
    public static void printSubsequences(int[] arr, int index, ArrayList<Integer> path, int target)
    {

        // Print the subsequence when reach
        // the leaf of recursion tree
        if (index == arr.length)
        {

            // Condition to avoid printing
            // empty subsequence
            if (path.size() > 0) {
                int min = Collections.min(path);
                int max = Collections.max(path);
                System.out.println(path + " - " + min + " - " + max);
                if(max + min <= target)
                    counter++;
            }
        }

        else
        {

            // Subsequence without including
            // the element at current index
            printSubsequences(arr, index + 1, path, target);

            path.add(arr[index]);

            // Subsequence including the element
            // at current index
            printSubsequences(arr, index + 1, path, target);

            // Backtrack to remove the recently
            // inserted element
            path.remove(path.size() - 1);
        }
        return;
    }

    public static void main(String[] args) {
        int[] arr = { 3,3,6,8 };
        ArrayList<Integer> path = new ArrayList<>();
        printSubsequences(arr,0,path, 10);
        System.out.println(counter);
    }
}
