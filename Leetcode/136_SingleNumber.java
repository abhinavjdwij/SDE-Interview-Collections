class Solution {
    public int singleNumber(int[] arr) {
        assert(arr.length > 0);
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }
}
