package ArrayStrings.Day35;

import java.util.HashMap;
import java.util.Map;

public class CountGoodPairs {
        public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> myMap = new HashMap<>();
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            if(myMap.containsKey(nums[i])){
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
                count += myMap.get(nums[i]);
                continue;
            }
            myMap.put(nums[i],0);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr [] = {1,1,1,1};
        System.out.println(new CountGoodPairs().numIdenticalPairs(arr));
    }
}
