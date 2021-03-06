class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int x = a.length, y = b.length;
        if (x > y) { // function needs x to be less than or equal to y
            return findMedianSortedArrays(b, a);
        }
        int l = 0, r = x, pA, pB, maxLeftA, maxLeftB, minRightA, minRightB;
        while (l <= r) {
            pA = (l+r) / 2; // point of bifurcation for A
            pB = (x+y+1)/2 - pA; // point of bifurcation for B since pA + pB = (x+y+1) / 2
            maxLeftA = (pA == 0) ? Integer.MIN_VALUE : a[pA-1];
            minRightA = (pA == x) ? Integer.MAX_VALUE : a[pA];
            maxLeftB = (pB == 0) ? Integer.MIN_VALUE : b[pB-1];
            minRightB = (pB == y) ? Integer.MAX_VALUE : b[pB];
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if ((x+y) % 2 == 0) {
                    double med1 = (double) Math.max(maxLeftA, maxLeftB);
                    double med2 = (double) Math.min(minRightA, minRightB);
                    return (med1 + med2) / 2.0;
                }
                else {
                    return ((double) Math.max(maxLeftA, maxLeftB));
                }
            }
            else if (maxLeftA > minRightB) {
                r = pA-1;
            }
            else {
                l = pA+1;
            }
        }
        return -1;
    }
}