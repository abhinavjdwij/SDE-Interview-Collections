class Solution {
    public int removeElement(int[] arr, int x) {
        int l = 0, r = 0;
        while (r < arr.length) {
            if (arr[r] != x) {
                arr[l++] = arr[r];
            }
            r++;
        }
        return l;
    }
}
