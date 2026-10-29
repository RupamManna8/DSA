package ArrayStrings.Day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Arrays.sort(nums);
        int right = 0 + nums.length / 3;
        int left = 0;
        while (right < nums.length) {
            if (nums[right] == nums[left]) {
                seen.add(nums[left]);
            }
            left++;
            right++;
        }
        return new ArrayList<>(seen);
    }
}
