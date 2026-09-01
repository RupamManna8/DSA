package ArrayStrings.Day29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> myList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                myList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                myList.add("Fizz");
            } else if (i % 5 == 0) {
                myList.add("Buzz");
            } else {
                myList.add("" + i);
            }
        }
    
        return myList;
    }
    public static void main(String[] args) {
        Set<Character> my = new HashSet<>();
        my.add('a');
        // my.remove('a');
        System.out.println(my);
    }
}
