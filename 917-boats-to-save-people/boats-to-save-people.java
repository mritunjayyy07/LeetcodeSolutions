class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0; 
        int r = people.length-1;
        int count=0;
        while(l <= r){
            while((l<=r) && (people[l] + people[r] > limit)){
                count++;
                r--;
            }
            while( (l < r) && (people[l] + people[r] <= limit)){
                count++;
                l++;
                r--;
            }
            if(l == r){
                count++;
                break;
            }
        }
        return count;
        
    }
}