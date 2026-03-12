class Solution {
    public int[][] merge(int[][] intervals) {
        List<int [] > lst = new ArrayList<>();
        Arrays.sort(intervals , (a,b) -> a[0] - b[0]);
        for(int [] interval : intervals)
        {
            if(lst.isEmpty() || lst.get(lst.size()-1)[1]  < interval[0])
            lst.add(interval);
            else
            {
                int max = Math.max(interval[1] ,lst.get(lst.size()-1)[1] );
                lst.get(lst.size()-1)[1] = max;
            }
        }
        return lst.toArray(new int [lst.size()][]);

        

        
    }
}