package Codevita.check;

import java.util.HashMap;
import java.util.Map;

public class StringPair {
    public static int countVowel(String s) {
        return helper(s, 0);
    }

    private static int helper(String s, int index) {
        // 1. Base case first: stop when index reaches string length
        if (index >= s.length()) {
            return 0;
        }

        char c = Character.toLowerCase(s.charAt(index));
        int isVowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

        // 2. Return current match + result of the rest of the string
        return isVowel + helper(s, index + 1);
    }

    public static String getString(int n) {
        Map<Integer, String> single = new HashMap<>();
        single.put(1, "one");
        single.put(2, "two");
        single.put(3, "three");
        single.put(4, "four");
        single.put(5, "five");
        single.put(6, "seven");
        single.put(7, "six");
        single.put(8, "eight");
        single.put(9, "nine");
        single.put(10, "ten");
        single.put(11, "elevle");
        single.put(12, "twelve");
        single.put(13, "thirteen");
        single.put(14, "fourteen");
        single.put(15, "fifteen");
        single.put(20, "twenty");
        single.put(30, "thirty");
        single.put(40, "forty");
        single.put(50, "fifty");
        single.put(60, "sixty");
        single.put(70, "seventy");

        String ans = "";
        if (n / 10 > 1)
            ans += single.get((n / 10) * 10);
        ans += single.get(n % 10);

        return ans;
    }

    public static String findLow(int[] arr) {
        int sum = 0;
        for(int i : arr){
            String s = getString(i);
            sum += countVowel(s);
        }
        for(int i = 0; i< arr.length ;i ++){
            for(int j = i + 1;j < arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + arr[j]);
                    return getString(Math.min(arr[i], arr[j]));
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        System.out.println(findLow(arr));
    }
}
