class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int width = right - left;
            int currH = Math.min(height[left], height[right]);
            maxArea = Math.max(currH * width, maxArea);

            if(height[right] > height[left]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}