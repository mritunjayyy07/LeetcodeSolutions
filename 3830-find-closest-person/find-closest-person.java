class Solution {
    public int findClosest(int x, int y, int z) {
        int diff1 = 0;
        int diff2 = 0;
        if(z>x)
        diff1 = z-x;
        else
        diff1 = x-z;
        if(z>y)
        diff2 = z-y;
        else
        diff2 = y-z;
        if(diff1 == diff2)
        return 0;
        if(diff1 < diff2)
        return 1;
        else
        return 2;        
    }
}