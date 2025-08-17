class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n <= 1) return n;

        int[] c = new int[n];
        Arrays.fill(c, 1); // everyone gets at least 1

        // left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                c[i] = c[i - 1] + 1;
            }
        }

        // right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                c[i] = Math.max(c[i], c[i + 1] + 1);
            }
        }

        // sum
        int total = 0;
        for (int candies : c) total += candies;

        return total;
    }
}
