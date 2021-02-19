class NumArray {
    
    int[] sumsArr;

    public NumArray(int[] nums) {
        this.sumsArr = new int[nums.length + 1];
        this.sumsArr[0] = 0;
        for (int i = 1; i < this.sumsArr.length; i++) {
            this.sumsArr[i] = this.sumsArr[i-1] + nums[i-1];
        }
    }
    
    public int sumRange(int i, int j) {
        return (sumsArr[j+1] - sumsArr[i]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */