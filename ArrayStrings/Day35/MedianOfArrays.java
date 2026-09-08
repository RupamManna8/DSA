package ArrayStrings.Day35;

public class MedianOfArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;


        while (idx1 < nums1.length && idx2 < nums2.length) {
            if (nums1[idx1] <= nums2[idx2]) {
                arr[idx] = nums1[idx1];
                idx1++; 
            } else {
                arr[idx] = nums2[idx2];
                idx2++; 
            }
            idx++;
        }

        while (idx1 < nums1.length) {
            arr[idx] = nums1[idx1];
            idx++;
            idx1++;
        }

        while (idx2 < nums2.length) {
            arr[idx] = nums2[idx2];
            idx++;
            idx2++;
        }

        double median;
        if (arr.length % 2 == 0) {
            median = (arr[(arr.length - 1) / 2] + arr[((arr.length - 1) / 2) + 1]) / 2.0;
        } else {
            median = arr[(arr.length - 1) / 2];
        }

        return median;
    }

}
