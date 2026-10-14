package ArrayStrings.Day40;
/**
 * MargeInterval
 */

import java.util.*;

public class MargeInterval {

public boolean checkOverlap(List<Integer> arr1, int[] arr2) {
        int a0 = arr1.get(0), a1 = arr1.get(1);
        int b0 = arr2[0], b1 = arr2[1];

        if ((a0 >= b0 && a0 <= b1) || (a1 >= b0 && a1 <= b1)) {
            return true;
        } else if ((b0 >= a0 && b0 <= a1) || (b1 >= a0 && b1 <= a1)) {
            return true;
        }
        return false;
    }

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> myList = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            List<Integer> temp = new ArrayList<>();
            
            if (myList.isEmpty()) {
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                myList.add(temp);
                continue;
            }

            List<Integer> last = myList.get(myList.size() - 1);
            boolean check = checkOverlap(last, intervals[i]);

            if (check) {
                temp.add(Math.min(last.get(0), intervals[i][0]));
                temp.add(Math.max(last.get(1), intervals[i][1]));
                myList.set(myList.size() - 1, temp);
            } else {
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                myList.add(temp);
            }
        }

        int[][] ans = new int[myList.size()][2];
        for (int i = 0; i < ans.length; i++) {
            ans[i][0] = myList.get(i).get(0);
            ans[i][1] = myList.get(i).get(1);
        }

        return ans;
    }
}