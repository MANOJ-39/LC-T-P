class Solution {
      static {
        for (int i = 0; i < 500; i++) countBinarySubstrings("0011");
    }

 public static int countBinarySubstrings(String s) {
        char[] ch = s.toCharArray();
        int prev = 0, curr = 1, res = 0, n = ch.length;

        for (int i = 1; i < n; i++) {
            if (ch[i] == ch[i - 1])
                curr++;
            else {
                res += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        return res + Math.min(prev, curr);
    }
}
