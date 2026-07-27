class Solution {

    public int myAtoi(String s) {

        int i = 0;
        int sign = 1;
        int ans = 0;

        while (i < s.length() && s.charAt(i) == ' ')
            i++;

        if (i < s.length() &&
            (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-')
                sign = -1;

            i++;
        }

        while (i < s.length() &&
               Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            if (ans > Integer.MAX_VALUE / 10 ||
                (ans == Integer.MAX_VALUE / 10 &&
                 digit > 7)) {

                if (sign == 1)
                    return Integer.MAX_VALUE;

                return Integer.MIN_VALUE;
            }

            ans = ans * 10 + digit;

            i++;
        }

        return ans * sign;
    }
}