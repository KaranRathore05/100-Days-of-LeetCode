import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);
        

        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            res = Math.min(res, nums[i + k - 1] - nums[i]);
        }

        return res;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {1, 3, 6, 19, 20};
        int k = 3;
        int result = obj.minimumDifference(nums, k);
        System.out.println("Minimum difference: " + result); // Output: Minimum difference: 2
    }
}
