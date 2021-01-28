class Solution {
    public int majorityElement(int[] arr) {
        assert(arr.length > 0);
        int ans = arr[0];
        int c = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != ans) {
                c--;
                if (c == 0) {
                    ans = arr[i];
                    c = 1;
                }
            }
            else {
                c++;
            }
        }
        return ans;
    }
}