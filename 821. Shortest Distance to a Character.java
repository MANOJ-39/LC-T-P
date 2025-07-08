class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        boolean firstTime = true;
        int left = 0, right = s.indexOf(c);
        for (int i = 0; i < right; i++) {
            result[i] = right - i;
        }
        left = right;

        while (s.indexOf(c, left+1) >= 0) {
            right = s.indexOf(c, left+1);
            for (int i = left+1; i < right; i++) {
                result[i] = Math.min(right - i, i - left);
            }
            left = right;
        }

        for (int i = right+1; i < s.length(); i++) {
            result[i] = i-right;
        }
        return result;
    }
}
