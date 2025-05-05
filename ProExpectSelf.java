class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return res;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.productExceptSelf(nums);
        System.out.print("Product except self: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
