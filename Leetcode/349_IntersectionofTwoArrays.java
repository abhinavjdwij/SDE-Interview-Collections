class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> check = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            check.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (check.contains(arr2[i])) {
                common.add(arr2[i]);
            }
        }
        int[] commonArr = new int[common.size()];
        int p = 0;
        for (Integer x : common) {
            commonArr[p++] = x;
        }
        return commonArr;
    }
}