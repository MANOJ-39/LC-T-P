class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        char[] str = s.toCharArray();
        char[] a = new char[len];
        int n = 0;

        for (int i = 0; i < len; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' ||
                str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U') {
                a[n++] = str[i];
            }
        }

        int m = n - 1;

        for (int i = 0; i < len; i++) {
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' ||
                str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U') {
                str[i] = a[m--];
            }
        }

        return new String(str);
    }
}

