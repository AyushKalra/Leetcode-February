public class Solution {
    public boolean isSubsequence(String str, String s) {
       
        
        int j = 0;
        for (int i = 0; i < s.length() && j < str.length(); i++){
            if (str.charAt(j) == s.charAt(i))
                j++;
        }
        
        if( j == str.length())
            return true;
        else
            return false;
    }
    
    
    
    
    public String findLongestWord(String s, List < String > d) {
        String ans_str = "";
        for (String str: d) {
            
           if(isSubsequence(str, s)){
                
                if ( str.length() > ans_str.length() || (str.length() ==                 ans_str.length() && str.compareTo(ans_str) < 0))
                    ans_str = str;
            
           }
        }
        return ans_str;
    }
}