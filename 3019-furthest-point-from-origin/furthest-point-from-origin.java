class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int l = moves.length();
        for(char ch : moves.toCharArray()){
            if(ch == 'L') countL++;
            if(ch == 'R') countR++;

        }
        int us = l - (countL+countR);
        if(countL > countR)
        return countL + us - countR;
        else
        return countR + us - countL;
        
    }
}