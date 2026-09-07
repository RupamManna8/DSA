package ArrayStrings.Day32;

public class StableIndex2 {
     public int getMax(int arr[],int start,int end){
        int max = arr[start];
        while(start <= end){
            if(arr[start] > max){
                max = arr[start];
            }
            if(arr[end] > max){
                max = arr[end];
            }
            start++;
            end--;
        }
        return max;
    }
    public int getMin(int arr[],int start,int end){
        int min = arr[start];
        while(start <= end){
            if(arr[start] < min){
                min = arr[start];
            }
            if(arr[end] < min){
                min = arr[end];
            }
            start++;
            end--;
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0;i< nums.length;i++){
            if((getMax(nums,0,i) - getMin(nums,i,nums.length - 1)) <= k && (getMax(nums,0,i) - getMin(nums,i,nums.length - 1)) < min){
                ans = i;
                min = (getMax(nums,0,i) - getMin(nums,i,nums.length - 1));
            }
        }
        return ans;
    }

}
