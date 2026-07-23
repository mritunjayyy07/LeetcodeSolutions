import java.util.HashSet;

class Solution {
    public int findMaximumXOR(int[] nums) {
        int maxXor = 0;
        int mask = 0;

        // Check bits from MSB (31st) to LSB (0th)
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);

            HashSet<Integer> prefixes = new HashSet<>();

            // Store prefixes up to the current bit
            for (int num : nums) {
                prefixes.add(num & mask);
            }

            // Assume current bit can be 1
            int candidate = maxXor | (1 << i);

            // Check if there exist two prefixes whose XOR is candidate
            for (int prefix : prefixes) {
                if (prefixes.contains(prefix ^ candidate)) {
                    maxXor = candidate;
                    break;
                }
            }
        }

        return maxXor;
    }
}