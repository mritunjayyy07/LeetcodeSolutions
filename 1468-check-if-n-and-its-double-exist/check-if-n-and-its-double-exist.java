class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++)
        {
            if(map.containsKey(2*arr[i])) 
            {
                
                return true;
            }
            if(map.containsKey(arr[i]/2))
            {
                if(arr[map.get(arr[i]/2)]*2 == arr[i])
                return true;
            }
            map.put(arr[i] , i);
        }
        return false;
        
    }
}