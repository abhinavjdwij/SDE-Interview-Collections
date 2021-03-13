class Solution {
    private int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        int l = 0, r = 1;
        while (r < intervals.length) {
            if (intervals[r][0] <= intervals[l][1]) {
                intervals[l][1] = Math.max(intervals[l][1], intervals[r][1]);
            }
            else {
                l++;
                intervals[l] = intervals[r]; 
            }
            r++;
        }
        return Arrays.copyOf(intervals, Math.min(l+1, intervals.length));
    }
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
        intervals = Arrays.copyOf(intervals, intervals.length + 1);
        intervals[intervals.length-1] = newInterval;
        return merge(intervals);
    }
}