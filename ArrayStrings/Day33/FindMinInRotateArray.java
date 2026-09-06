package ArrayStrings.Day33;

public class FindMinInRotateArray {
        public int findMin(int[] nums) {
        int first  = 0;
        int last = nums.length - 1;
        if(nums[first] < nums[last]){
            return nums[first];
        }
        int ans = nums[last];

        while(first <= last){
            int mid = (first + last) / 2;
            if(nums[mid] <= ans){
               ans = nums[mid];
               last = mid - 1;
            }else if(nums[mid] >= ans){
               first = first + 1;
            }
        }
        return ans;
    }
}
