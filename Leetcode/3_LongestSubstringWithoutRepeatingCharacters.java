class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, maxL = 0, maxR = 0;
        HashMap<Character, Integer> check = new HashMap<>();
        while (r < s.length()) {
            Character cR = s.charAt(r);
            while (check.getOrDefault(cR, 0) > 0 && l < r) {
                Character cL = s.charAt(l);
                check.put(cL, check.get(cL)-1);
                l++;
            }
            check.put(cR, check.getOrDefault(cR, 0) + 1);
            if (r-l > maxR-maxL) {
                maxR = r;
                maxL = l;
            }
            r++;
        }
        return Math.min(maxR-maxL+1, s.length());
    }
}