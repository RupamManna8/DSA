package ArrayStrings.Day17;

/**
 * PalindromeNumber
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        boolean isNeg = x < 0 ? true : false;
        if(isNeg){
            x = -1 * x;
        }
        String s = Integer.toString(x);
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
        }
        return true;
    }
}