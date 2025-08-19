public class FirstLastElement {
    class Solution {
    public int findIndex(int[] nums, int target, boolean findStart) {
        int left = 0, right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (findStart) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        int leftMost = findIndex(nums, target, true);
        int rightMost = findIndex(nums, target, false);

        if (leftMost == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{leftMost, rightMost};
    }
}
}
