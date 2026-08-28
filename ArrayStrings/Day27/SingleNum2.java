package ArrayStrings.Day27;

public class SingleNum2 {
    public int singleNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            boolean isDouble = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] == nums[j]) {
                    isDouble = true;
                    break;
                }
            }
            if (isDouble == false) {
                return nums[i];
            }
        }
        return 0;
    }
}
