class Solution {
    public int lengthOfLastWord(String s) {
        int l = 0, p = s.length()-1;
        while (p >= 0 && s.charAt(p) == ' ') {
            p--;
        }
        while (p >= 0 && s.charAt(p) != ' ') {
            l++;
            p--;
        }
        return l;
    }
}