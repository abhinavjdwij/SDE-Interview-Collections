class Solution {
    private int pushNegativesToRight(int[] arr) {
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l++;
            }
        }
        return l;
    }
    
    public int firstMissingPositive(int[] arr) {
        int len = pushNegativesToRight(arr);
        for (int i = 0; i < len; i++) {
            int x = Math.abs(arr[i])-1; // 1 based indexing
            if (x < len && arr[x] > 0) {
                arr[x] *= -1;
            }
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] > 0) {
                return i+1;
            }
        }
        return len+1;
    }
}