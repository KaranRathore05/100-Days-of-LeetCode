

public class Median2Number {
    
    


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = new int[m + n];

        // Merge both arrays
        System.arraycopy(nums1, 0, nums3, 0, m);
        System.arraycopy(nums2, 0, nums3, m, n);

        // Sort the merged array
        Arrays.sort(nums3);

        // Find median
        int len = nums3.length;
        if (len % 2 == 0) {
            return (nums3[len / 2 - 1] + nums3[len / 2]) / 2.0;
        } else {
            return nums3[len / 2];
                }}
}

