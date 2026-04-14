import java.util.*;

class Solution {
    final int MOD = 1_000_000_007;

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;

        // kyuki bc math.pow TLE de raha tha 
        int[] pow = new int[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % MOD;
        }

        int l = 0, r = n - 1;
        long count = 0;

        while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                count = (count + pow[r - l]) % MOD;
                l++;
            } else {
                r--;
            }
        }

        return (int) count;
    }
}