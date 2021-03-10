class Solution {
    public String longestCommonPrefix(String[] arr) {
        if (arr.length == 0) { return ""; }
        StringBuilder lcp = new StringBuilder();
        boolean breakFlag = false;
        for (int i = 0; i < arr[0].length(); i++) {
            char c = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].length() <= i || arr[j].charAt(i) != c) {
                    breakFlag = true;
                    break;
                }
            }
            if (breakFlag) {
                break;
            }
            lcp.append(c);
        }
        return lcp.toString();
    }
}