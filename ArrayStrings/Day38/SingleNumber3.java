package ArrayStrings.Day38;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> myMap = new HashMap<>();
        Set<Integer> mySet = new HashSet<>();
        for(int num : nums){
            if(mySet.contains(num)){
                mySet.remove(num);
                continue;
            }
            if(myMap.containsKey(num)){
                 continue;
            }
            myMap.put(num,num);
            mySet.add(num);
        }

        int [] ans = new int[mySet.size()];
        int idx = 0;
        for(int s : mySet){
            ans[idx] = s;
            idx++;
        }
        return ans;
    }
}
