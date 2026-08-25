package ArrayStrings.Day26;

import java.util.ArrayList;
import java.util.List;

/**
 * SpiralOrder
 */
public class SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int top = 0;
        int left = 0;
        while (top <= bottom && left <= right) {
            int i = left;
            while (i <= right) {
                ans.add(matrix[top][i]);
                i++;
            }
            top++;
            int j = top;
            while (j <= bottom) {
                ans.add(matrix[j][right]);
                j++;
            }
            right--;
            if (top <= bottom) {
                int k = right;
                while (k >= left) {
                    ans.add(matrix[bottom][k]);
                    k--;
                }
                bottom--;
            }
            if (left <= right) {
                int l = bottom;
                while (l >= top) {
                    ans.add(matrix[l][left]);
                    l--;
                }
                left++;
            }
        }
        return ans;
    }
}