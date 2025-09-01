class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> 
            Double.compare(
                (b[0] + 1) / (b[1] + 1) - b[0] / b[1], 
                (a[0] + 1) / (a[1] + 1) - a[0] / a[1]
            )
        );
        
        
        for (int[] c : classes) {
            pq.offer(new double[]{c[0], c[1]});
        }
        
       
        while (extraStudents > 0) {
            double[] curr = pq.poll();
            double pass = curr[0];
            double total = curr[1];
           
            pq.offer(new double[]{pass + 1, total + 1});
            extraStudents--;
        }
        
        
        double sumRatio = 0.0;
        while (!pq.isEmpty()) {
            double[] curr = pq.poll();
            sumRatio += curr[0] / curr[1];
        }
        
        return sumRatio / classes.length;
    }
}