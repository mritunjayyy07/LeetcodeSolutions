class NumArray {
    private int [] data;

    public NumArray(int[] nums) {
        this.data = nums;
    }
    
    public int sumRange(int left, int right) {
        int [] prefix_sum = new int [data.length];
        prefix_sum[0] = data[0];
        for(int i = 1; i < data.length; i++){
            prefix_sum[i] = prefix_sum[i-1] + data[i];
        }
        if(left == 0) return prefix_sum[right];
        else return (prefix_sum[right] - prefix_sum[left-1]);
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */