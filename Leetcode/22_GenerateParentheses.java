class Solution {
    private void buildData(int l, int r, int n, StringBuilder sb, List<String> data) {
        if (l == r && l == n) {
            data.add(sb.toString());
            return;
        }
        if (l < n) {
            sb.append("(");
            buildData(l+1, r, n, sb, data);
            sb.setLength(sb.length()-1);
        }
        if (l > r) {
            sb.append(")");
            buildData(l, r+1, n, sb, data);
            sb.setLength(sb.length()-1);
        }
    }
    
    public List<String> generateParenthesis(int n) {
        List<String> data = new ArrayList<>();
        buildData(0, 0, n, new StringBuilder(), data);
        return data;
    }
}