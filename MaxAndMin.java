class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxPos = 0;
        int minPos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxPos = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minPos = i;
            }
        }
        int front = Math.max(minPos, maxPos) + 1;
        int back = nums.length - Math.min(minPos, maxPos);
        int mid = Math.min(minPos + 1 + (nums.length - maxPos), maxPos + 1 + (nums.length - minPos));

        int res = Math.min(front, back);
        res = Math.min(res, mid);
        return res;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {2, 10, 6, 14, 5, 3};
        int result = obj.minimumDeletions(nums);
        System.out.println("Minimum deletions: " + result); // Output: Minimum deletions: 3
    }
}