class Solution {
    public void merge(int[] arr1, int l1, int[] arr2, int l2) {
        for (int i = l1-1; i >= 0; i--) { // shift arr1
            arr1[i+l2] = arr1[i];
        }
        int p1 = l2, p2 = 0, p = 0;
        while (p1 < l1+l2 && p2 < l2) {
            if (arr1[p1] < arr2[p2]) {
                arr1[p++] = arr1[p1++];
            }
            else {
                arr1[p++] = arr2[p2++];
            }
        }
        while (p1 < l1+l2) {
            arr1[p++] = arr1[p1++];
        }
        while (p2 < l2) {
            arr1[p++] = arr2[p2++];
        }
    }
}
