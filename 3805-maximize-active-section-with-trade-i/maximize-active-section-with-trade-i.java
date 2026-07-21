class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t = "1" + s + "1";
        int n = t.length();

        int initialOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') initialOnes++;
        }

        int ans = initialOnes;

        int i = 0;
        while (i < n) {
            char ch = t.charAt(i);
            int j = i;

            while (j < n && t.charAt(j) == ch) {
                j++;
            }

            // Current run is [i, j-1]
            if (ch == '1' && i > 0 && j < n) {
                // Internal 1-block (surrounded by zeros)

                int leftZero = 0;
                int k = i - 1;
                while (k >= 0 && t.charAt(k) == '0') {
                    leftZero++;
                    k--;
                }

                int rightZero = 0;
                k = j;
                while (k < n && t.charAt(k) == '0') {
                    rightZero++;
                    k++;
                }

                ans = Math.max(ans, initialOnes + leftZero + rightZero);
            }

            i = j;
        }

        return ans;
    }
}