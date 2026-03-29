class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2))return true;
        String test = s1.charAt(2) +""+ s1.charAt(1) +""+ s1.charAt(0) +""+ s1.charAt(3);
        if(test.equals(s2))
        return true;
          String test1 = s1.charAt(0) +""+ s1.charAt(3) +""+ s1.charAt(2) +""+ s1.charAt(1);
          if(test1.equals(s2))
          return true;
          String test2 = test.charAt(0) +""+ test.charAt(3) +""+ test.charAt(2) +""+ test.charAt(1);
        if(test2.equals(s2))
        return true;
        
        return false;
        
    }
}