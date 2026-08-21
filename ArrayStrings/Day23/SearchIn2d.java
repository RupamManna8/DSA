package ArrayStrings.Day23;

public class SearchIn2d {
    public static int count = 0;
    public static boolean BinarySearch(int arr[],int target){
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
            count++;
        }
        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int check = matrix[mid][matrix[mid].length -1];
            if(target >= matrix[mid][0] && target <= check){
                return BinarySearch(matrix[mid], target);
            }
            if(target > check){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
            count++;
        }
        return false;
    }

    public static void main(String[] args) {
      int  [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}; 
      int target = 11;
      System.out.println(searchMatrix(matrix, target));
      System.out.println("count:" + count);
    }
}
