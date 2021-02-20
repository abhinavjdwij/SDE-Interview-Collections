class Solution {
    public int search(int[] arr, int x) {
        int l = 0, r = arr.length-1, m;
        while (l <= r) {
            m = (l+r) / 2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] >= arr[l]) { // l..m is sorted
                if (x >= arr[l] && x < arr[m]) {
                    r = m-1;
                }
                else {
                    l = m+1;
                }
            }
            else { // m..r is sorted (m not necessarily pivot)
                if (x > arr[m] && x <= arr[r]) {
                    l = m+1;
                }
                else {
                    r = m-1;
                }
            }
        }
        return -1;
    }
}