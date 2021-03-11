class Solution {
    private String sort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String sortedStr = sort(arr[i]);
            if ( ! anagramMap.containsKey(sortedStr) ) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(arr[i]);
        }
        List<List<String>> data = new ArrayList<>(anagramMap.values());
        return data;
    }
}