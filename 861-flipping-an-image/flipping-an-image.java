class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [] [] ans  = new int [image.length][image.length];
        int n= image.length;
        int a= 0,b=0;
        for(int i = 0; i < n; i++)
        {
            b=0;
            for(int j = n-1; j >=0 ;j --)
            {
                ans[i][b] = image[i][j];
                b++;
            }
        }
        for(int i = 0; i  <n; i++)
        {
            for(int j = 0; j < n;j++)
            {
                ans[i][j] = 1-ans[i][j];
            }
        }
        return ans;
    }
}