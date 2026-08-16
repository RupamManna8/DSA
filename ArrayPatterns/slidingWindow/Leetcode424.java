package ArrayPatterns.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class Leetcode424 {
    public static int characterReplacement(String s, int k) {
        int len = 1;
        int idx = 1;
        int maxLen = 0;
        while(s.charAt(idx) == s.charAt(idx - 1)){
            len++;
            idx++;
        }
        
        while(idx < s.length()){

            if(s.charAt(idx) != s.charAt(idx-1) && k >= 0){
                k--;
                len++;
            }else if(s.charAt(idx) == s.charAt(idx-1)){
                len++;
            }else{
                len = 0;
            }
            maxLen = Math.max(maxLen, len);
            idx++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 2));
        List<Integer> m = new ArrayList<>();
        
        System.out.println();
    }
}
