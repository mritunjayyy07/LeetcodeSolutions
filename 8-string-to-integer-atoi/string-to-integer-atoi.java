class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;

        long longValue = 0;
        boolean negative = false;
        int i = 0;
        char firstChar = s.charAt(0);

        if (firstChar == '-') {
            negative = true;
            i++;
        } else if (firstChar == '+') {
            i++;
        } else if (!Character.isDigit(firstChar)) {
            return 0;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            longValue = longValue * 10 + digit;

            if (!negative && longValue > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (negative && -longValue < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        if (negative) {
            longValue = -longValue;
        }

        return (int) longValue;
    }
}
