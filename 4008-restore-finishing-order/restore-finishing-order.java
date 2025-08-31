class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int [] ans = new int [friends.length];
        int a =0;
        for(int i : order)
        {
            int c =0;
            for(int j : friends)
            {
                if( i == j)
                c= 1;
            }
            if(c==1)
            ans[a++] = i;
        }
        return ans;
        
    }
}