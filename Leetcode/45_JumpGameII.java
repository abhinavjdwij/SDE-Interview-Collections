class Solution {
    public int jump(int[] arr) {
        int pos = 0, maxReach = 0, jumps = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pos < i) {
                pos = maxReach;
                jumps++;
            }
            maxReach = Math.max(maxReach, i+arr[i]);
        }
        return jumps;
    }
}