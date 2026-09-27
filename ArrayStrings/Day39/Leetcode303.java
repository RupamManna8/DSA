package ArrayStrings.Day39;

import java.util.ArrayList;
import java.util.List;

public class Leetcode303 {
    class NumArray {
        List<Integer> array = new ArrayList<>();

        public NumArray(int[] nums) {
            int temp = 0;
            for (int num : nums) {
                int sum = num + temp;
                array.add(sum);
                temp = sum;
            }
        }

        public int sumRange(int left, int right) {
            return left - 1 < 0 ? array.get(right) : array.get(right) - array.get(left - 1);
        }
    }
}
