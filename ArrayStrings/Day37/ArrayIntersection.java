package ArrayStrings.Day37;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayIntersectio {
    public int[] intersection(int[] num1, int[] num2) {
        Set<Integer> set = new HashSet<>();
        for (int i : num1) {
            set.add(i);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int j : num2) {
            if (set.contains(j)) {
                intersection.add(j);
            }
        }

        int[] result = new int[intersection.size()];
        int idx = 0;
        for (int num : intersection) {
            result[idx++] = num;
        }
        return result;
    }
}
