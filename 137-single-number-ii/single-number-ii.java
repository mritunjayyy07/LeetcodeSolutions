class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i <=31; i++)
        {
            int temp = (1<<i);
            int countzero = 0;
            int countone = 0;
            for(int num : nums)
            {
                if((num & temp) == 0)
                countzero++;
                else
                countone++;
            }
            if(countone %3 != 0)
            res = res|temp;
        }
        return res;
        
    }
}