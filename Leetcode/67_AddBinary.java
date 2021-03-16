class Solution {
    public String addBinary(String a, String b) {
        int c = 0;
        StringBuilder sb = new StringBuilder();
        int x = a.length()-1, y = b.length()-1;
        while (x >= 0 && y >= 0) {
            int aVal = (a.charAt(x--) == '1' ? 1 : 0);
            int bVal = (b.charAt(y--) == '1' ? 1 : 0);
            int sVal = (aVal + bVal + c) % 2;
            c = (aVal + bVal + c) / 2;
            sb.append(sVal == 1 ? '1' : '0');
        }
        while (x >= 0) {
            int aVal = (a.charAt(x--) == '1' ? 1 : 0);
            int sVal = (aVal + c) % 2;
            c = (aVal + c) / 2;
            sb.append(sVal == 1 ? '1' : '0');
        }
        while (y >= 0) {
            int bVal = (b.charAt(y--) == '1' ? 1 : 0);
            int sVal = (bVal + c) % 2;
            c = (bVal + c) / 2;
            sb.append(sVal == 1 ? '1' : '0');
        }
        if (c == 1) { sb.append('1'); }
        sb.reverse();
        return sb.toString();
    }
}