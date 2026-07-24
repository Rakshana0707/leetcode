class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[128];

        for (char ch : s.toCharArray())
            freq[ch]++;

        StringBuilder ans = new StringBuilder();

        while (true) {

            int max = 0;
            int index = -1;

            for (int i = 0; i < 128; i++) {

                if (freq[i] > max) {
                    max = freq[i];
                    index = i;
                }
            }

            if (index == -1)
                break;

            while (freq[index] > 0) {
                ans.append((char) index);
                freq[index]--;
            }
        }

        return ans.toString();
    }
}