package ArrayStrings.Day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
        public void rotate(int[] nums, int k) {
     // Normalize k in case k >= nums.length (for cyclic shifts)
        k = k % nums.length; 

        int last = nums.length - k;
        int arr[] = new int[k];
        int idx = 0;

        while (last < nums.length) {
            arr[idx] = nums[last];
            idx++;
            last++;
        }
        int end = nums.length - 1;
        for(int i = (nums.length - 1 ) - k; i >= 0;i--){
            nums[end--] = nums[i];
        }
        for(int i = 0;i < k;i++){
            nums[i] = arr[i];
        }    
    }
}
