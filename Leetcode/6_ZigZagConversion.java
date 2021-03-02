class Solution {
    public String convert(String s, int n) {
        if (n < 2) { return s; }
        StringBuilder[] data = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            data[i] = new StringBuilder();
        }
        int pos = 0, dir = 1;
        for (int i = 0; i < s.length(); i++) {
            data[pos].append(s.charAt(i));
            pos += dir;
            if (pos == n) {
                pos = n-2;
                dir *= -1;
            }
            else if (pos == -1) {
                pos = 1;
                dir *= -1;
            }
        }
        StringBuilder finalSb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            finalSb.append(data[i]);
        }
        return finalSb.toString();
    }
}