package ArrayStrings.Day18;

public class searchRotated {
    public static int search(int[] arr, int ele) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Prevents integer overflow: left + (right - left) / 2
            int mid = left + (right - left) / 2;

            if (arr[mid] == ele) {
                return mid;
            }

            // Determine if the left half is sorted
            if (arr[left] <= arr[mid]) {
                // Check if the target element lies within the sorted left half
                if (arr[left] <= ele && ele < arr[mid]) {
                    right = mid - 1; // Search left
                } else {
                    left = mid + 1; // Search right
                }
            }
            // Otherwise, the right half must be sorted
            else {
                // Check if the target element lies within the sorted right half
                if (arr[mid] < ele && ele <= arr[right]) {
                    left = mid + 1; // Search right
                } else {
                    right = mid - 1; // Search left
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 1, 2, 3 };
        System.out.println(search(arr, 8));

    }
}
