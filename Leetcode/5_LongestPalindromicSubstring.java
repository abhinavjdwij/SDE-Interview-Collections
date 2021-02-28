class Solution {
    public String longestPalindrome(String s) {
        int n = s.length(), l, r;
        int maxL = 0, maxR = 0;
        for (int i = 0; i < n; i++) { // palindromes with i as center
            // even length
            l = i-1;
            r = i;
            while (l >= 0 && r < n) {
                if (s.charAt(l) != s.charAt(r)) {
                    break;
                }
                if (r-l > maxR-maxL) {
                    maxR = r;
                    maxL = l;
                }
                l--;
                r++;
                
            }
            // odd length
            l = i-1;
            r = i+1;
            while (l >= 0 && r < n) {
                if (s.charAt(l) != s.charAt(r)) {
                    break;
                }
                if (r-l > maxR-maxL) {
                    maxR = r;
                    maxL = l;
                }
                l--;
                r++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (; maxL <= maxR; maxL++) {
            sb.append(s.charAt(maxL));
        }
        return sb.toString();
    }
}