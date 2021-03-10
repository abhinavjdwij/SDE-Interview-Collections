class Solution {
    public boolean canJump(int[] arr) {
        int maxReach = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxReach < i) {
                return false;
            }
            maxReach = Math.max(maxReach, i+arr[i]);
        }
        return true;
    }
}