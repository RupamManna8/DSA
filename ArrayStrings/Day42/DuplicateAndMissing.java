package ArrayStrings.Day42;

import java.util.HashSet;
import java.util.Set;

public class DuplicateAndMissing {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> seen = new HashSet<>();
        int duplicate = -1;
        int sum = 0;
        int n = grid.length * grid.length;
        for (int[] outer : grid) {
            for (int inner : outer) {
                if (seen.contains(inner)) {
                    duplicate = inner;
                }
                seen.add(inner);
                sum += inner;
            }
        }
        int missing = ((n * (n + 1)) / 2) - (sum - duplicate);

        return new int[] { duplicate, missing };
    }
}
