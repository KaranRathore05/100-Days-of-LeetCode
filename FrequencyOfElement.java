import java.util.Arrays;

public class FrequencyOfElement {
    class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int start = 0;
        long sum = 0;
        int res = 1;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum + k < (long) nums[end] * (end - start + 1)) {
                sum -= nums[start];
                start++;
            }

            res = Math.max(res, end - start + 1);
        }

        return res;
    }
}

}
