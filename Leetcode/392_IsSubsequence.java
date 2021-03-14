class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0, tp = 0;
        while (sp < s.length()) {
            if (tp >= t.length()) {
                return false;
            }
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }
        return true;
    }
}