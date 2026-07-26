class Solution {

    public int romanToInt(String s) {

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i + 1 < s.length()) {

                String pair = s.substring(i, i + 2);

                if (pair.equals("IV")) {
                    ans += 4;
                    i++;
                    continue;
                }

                if (pair.equals("IX")) {
                    ans += 9;
                    i++;
                    continue;
                }

                if (pair.equals("XL")) {
                    ans += 40;
                    i++;
                    continue;
                }

                if (pair.equals("XC")) {
                    ans += 90;
                    i++;
                    continue;
                }

                if (pair.equals("CD")) {
                    ans += 400;
                    i++;
                    continue;
                }

                if (pair.equals("CM")) {
                    ans += 900;
                    i++;
                    continue;
                }
            }

            char ch = s.charAt(i);

            if (ch == 'I') ans += 1;
            else if (ch == 'V') ans += 5;
            else if (ch == 'X') ans += 10;
            else if (ch == 'L') ans += 50;
            else if (ch == 'C') ans += 100;
            else if (ch == 'D') ans += 500;
            else ans += 1000;
        }

        return ans;
    }
}