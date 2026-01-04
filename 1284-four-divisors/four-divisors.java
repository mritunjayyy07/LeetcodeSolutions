class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i : nums)
        {
            int tempsum = 1+i;
            int count = 0;
            for(int j = 2; j <=(int) Math.sqrt(i); j++)
            {
                if(i%j == 0)
                {

                    count ++;
                    tempsum += j;
                    if(i/j != j)
                    {
                        count++;
                        tempsum += i/j;
                    }
                }
                if(count > 2)
                break;

            }
            if(count == 2)
            {
                sum+=tempsum;
            }
        }
        return sum;
        
    }
}