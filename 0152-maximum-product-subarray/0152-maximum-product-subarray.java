class Solution {
    public int maxProduct(int[] nums) {
        int Min = nums[0];
        int Max = nums[0];
        int result = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            int temp = Max;

            Max = Math.max(nums[i], Math.max(Max * nums[i], Min * nums[i]));
            Min = Math.min(nums[i], Math.min(temp * nums[i], Min * nums[i]));

            result = Math.max(result, Max);
        }
        return result;
    }
}