class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        int ans = 0;
        int i = 0;
        int sign = 1;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length()) {
            int num = s.charAt(i) - '0';
            if (num < 0 || num > 9) break;

            // Overflow check BEFORE multiplying
            if (ans > Integer.MAX_VALUE / 10 || 
                (ans == Integer.MAX_VALUE / 10 && num > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            ans = ans * 10 + num;
            i++;
        }

        return ans * sign;
    }
}
