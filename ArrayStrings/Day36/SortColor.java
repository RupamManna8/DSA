package ArrayStrings.Day36;

public class SortColor {
    public void sortColors(int[] nums) {
        int arr[] = new int[3];
        for(int ele : nums){
            arr[ele]++;
        }
        for(int i = 0;i<nums.length;i++){
            if(i < arr[0]){
                nums[i] = 0;
            }else if(i < arr[0] + arr[1]){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }
    }
}
