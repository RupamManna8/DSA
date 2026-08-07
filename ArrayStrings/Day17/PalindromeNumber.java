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
    }
}