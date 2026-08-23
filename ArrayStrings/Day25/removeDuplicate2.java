package ArrayStrings.Day25;

public class removeDuplicate2 {
      public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int n : nums) {
            if (k < 2 || n > nums[k - 2]) {
                nums[k] = n;
                k++;
            }
        }
        return k;
    }
}
