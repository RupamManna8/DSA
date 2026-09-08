package ArrayStrings.Day35;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
        public int firstMissingPositive(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int num : nums){
            mySet.add(num);
        }
        int number = 1;
        while(true){
            if(!mySet.contains(number)){
                return number;
            }
            number++;
        }
    }
}
