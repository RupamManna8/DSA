package ArrayStrings.Day24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsicutiveSequence {
public static int longestConsecutive(int[] nums) {
    if (nums == null || nums.length == 0) return 0;

    Set<Integer> mySet = new HashSet<>();
    for (int num : nums) {
        mySet.add(num);
    }

    int maxStreak = 0;

    for (int num : mySet) {
        // Only start from the smallest element in a consecutive chain
        if (!mySet.contains(num - 1)) {
            int currentNum = num;
            int currentStreak = 1;

            while (mySet.contains(currentNum + 1)) {
                currentNum++;
                currentStreak++;
            }

            maxStreak = Math.max(maxStreak, currentStreak);
        }
    }

    return maxStreak;
}

    public static void main(String[] args) {
        int[] nums = { 1, 5, 6, 7, 2, 4, 0 };
        System.out.println(longestConsecutive(nums));
    }
}
