class Solution {
    public int[] plusOne(int[] digits) {
        int c = 1;
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i] += c;
            c = digits[i] / 10;
            digits[i] %= 10;
        }
        if (c > 0) {
            int[] ans = new int[digits.length+1];
            ans[0] = c;
            for (int i = 0; i < digits.length; i++) {
                ans[i+1] = digits[i];
            }
            return ans;
        }
        return digits;
    }
}