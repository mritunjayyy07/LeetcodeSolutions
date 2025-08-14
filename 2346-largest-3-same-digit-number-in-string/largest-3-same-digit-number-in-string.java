class Solution {
    public String largestGoodInteger(String num) {
        String [] arr = {"000","111","222","333","444","555","666","777","888","999"};
        for(int i = 9; i >=0; i --){
            if(num.indexOf(arr[i]) >=0)
            return arr[i];
        }
        return "";
        
        
    }
}