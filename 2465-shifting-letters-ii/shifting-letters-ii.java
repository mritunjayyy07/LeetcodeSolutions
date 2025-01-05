class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftArray = new int[n + 1];

       
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            
           
            if (direction == 1) {
                shiftArray[start] += 1;
                shiftArray[end + 1] -= 1;
            } else {
                shiftArray[start] -= 1;
                shiftArray[end + 1] += 1;
            }
        }

       
        for (int i = 1; i < n; i++) {
            shiftArray[i] += shiftArray[i - 1];
        }

        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int shift = shiftArray[i] % 26; 
            char originalChar = s.charAt(i);
            char newChar = (char) ((originalChar - 'a' + shift + 26) % 26 + 'a'); 
            result.append(newChar);
        }

        return result.toString();
        
    }
}