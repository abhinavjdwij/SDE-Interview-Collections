class Solution {
    public double myPow(double x, int n) {
        if (n == 0) { return 1; }
        if (n == 1) { return x; }
        if (n < 0) {
            x = 1/x;
        }
        double y = myPow(x, Math.abs(n/2));
        if (n % 2 == 0) {
            return y*y;
        }
        else {
            return x*y*y;
        }
    }
}