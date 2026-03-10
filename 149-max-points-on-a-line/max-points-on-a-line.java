class Solution {
    public int maxPoints(int[][] points) {
        if(points.length == 1)
        return 1;
        int result = 0;
        double slope = 0.0;
        for(int i = 0 ; i < points.length; i++)
        {
           
            for(int j = i+1; j < points.length; j++)
            {
                 int count = 2;
                int dy = (points[j][1]-points[i][1]);
                int dx = (points[j][0]-points[i][0]);
                
            
            for(int k = 0; k < points.length; k++)
            {
                if(k!=i && k !=j)
                {
                    int dy3 = (points[k][1]-points[i][1]);
                    int dx3 = (points[k][0]-points[i][0]);
                    if(dx*dy3 == dy*dx3)
                    count++;
                }
            }

            result = Math.max(result,count);
            }
        }
        return result;
        
    }
}