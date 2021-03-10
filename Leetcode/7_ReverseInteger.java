class Solution {
    public int reverse(int x) {
        boolean negative = (x < 0);
        x = Math.abs(x);
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            if (rev > ((Integer.MAX_VALUE - pop) / 10)) { return 0; }
            rev = rev*10 + pop;
            x /= 10;
        }
        if (negative) { rev *= -1; }
        return rev;
    }
}