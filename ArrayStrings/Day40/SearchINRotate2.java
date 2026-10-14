package ArrayStrings.Day40;

public class SearchINRotate2 {
    public boolean search(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
        return false;
    }

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return true;
        }

        // 1. Shrink when boundary duplicates make direction ambiguous
        if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
            left++;
            right--;
        }
        // 2. Target is strictly inside the sorted left half
        else if (nums[left] <= nums[mid] && target >= nums[left] && target < nums[mid]) {
            right = mid - 1;
        }
        // 3. Target is outside the sorted left half -> must be on the right
        else if (nums[left] <= nums[mid]) {
            left = mid + 1;
        }
        // 4. Target is strictly inside the sorted right half
        else if (nums[mid] < target && target <= nums[right]) {
            left = mid + 1;
        }
        // 5. Target is outside the sorted right half -> must be on the left
        else {
            right = mid - 1;
        }
    }

    return false;
}
}
