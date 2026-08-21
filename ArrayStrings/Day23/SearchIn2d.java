package ArrayStrings.Day23;

public class SearchIn2d {
    public boolean BinarySearch(int arr[],int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return true;
            }
            if(target > arr[mid]){
               left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] i : matrix){
            if(i[0] <= target && target <= i[i.length - 1]){
                return BinarySearch(i, target);
            }
        }
        return false;
    }
}
