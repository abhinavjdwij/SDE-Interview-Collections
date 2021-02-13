public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c = 0;
        while (n != 0) {
            n = n & (n-1);
            c++;
        }
        return c;
    }
}