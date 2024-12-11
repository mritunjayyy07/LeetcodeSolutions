class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        if(n == 1) return s;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));
        Map <Character , Integer > map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int[] arr = new int[]{entry.getKey() , entry.getValue()};
            pq.offer(arr);
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            int[] arr = pq.poll();
            for(int i = 0 ; i < arr[1] ; i++){
                sb.append((char)arr[0]);
            }
        }
        return sb.toString();
    }
}