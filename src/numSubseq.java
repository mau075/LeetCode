import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    1498. Number of Subsequences That Satisfy the Given Sum Condition
*/
public class numSubseq {
    public int numSubseq(int[] nums, int target) {
        int res = 0, mod = 1000000007, l = 0, r = nums.length - 1;
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        for (int i = 1; i <= nums.length; ++i) {
            pre.add((pre.get(i - 1) << 1) % mod);
        }

        Arrays.sort(nums);

        while (l <= r) {
            if (nums[l] + nums[r] > target) {
                r--;
            } else {
                res = (res + pre.get(r - l++)) % mod;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3,3,6,8 };
        int counter = 0;
        ArrayList<Integer> path = new ArrayList<>();
        System.out.println();
    }
}
