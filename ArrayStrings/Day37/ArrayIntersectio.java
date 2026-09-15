package ArrayStrings.Day37;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayIntersectio {
        public int[] intersection(int[] num1, int[] num2) {
        List<Integer> myList = new ArrayList<>();
        Set<Integer> mySet = new HashSet<>();
        Set<Integer> dupCheck = new HashSet<>();
        for(int i : num1){
            mySet.add(i);
        }
        for(int j : num2){
            if(mySet.contains(j) && !dupCheck.contains(j)){
                myList.add(j);
                dupCheck.add(j);
            }
        }

        return myList.stream().mapToInt(Integer::intValue).toArray();
    }
}
