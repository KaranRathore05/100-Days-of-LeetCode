public class ContainerWithWater {
    public class Solution {
        public int maxArea(int[] height) {
            int maxArea = 0;
            int left = 0, right = height.length - 1;
    
            while (left < right) {
                int width = right - left;
                int ht = Math.min(height[left], height[right]);
                int area = width * ht;
                maxArea = Math.max(maxArea, area);
    
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
    
            return maxArea;
        }
    }
    
}
