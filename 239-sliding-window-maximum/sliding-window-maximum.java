class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int[] ans = new int[nums.length - k + 1];

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[j]) {
                dq.pollLast();
            }

            
            dq.offerLast(j);

            
            if (dq.peekFirst() < j - k + 1) {
                dq.pollFirst();
            }

            
            if (j >= k - 1) {
                ans[i++] = nums[dq.peekFirst()];
            }
        }

        return ans;
           
    }
}