class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max=  -1;
        for(int i : nums)
        {
            int sum = 0;
            int num = i;
            while(num>0)
            {
                sum += num%10;
                num = num/10;
            }
            if(map.containsKey(sum))
            {
                if(i+map.get(sum) > max)
                max = i+map.get(sum);
                map.put(sum,i>map.get(sum)?i:map.get(sum));
            }
            else
            map.put(sum,i);
            
        }
        return max;
        
        
    }
}