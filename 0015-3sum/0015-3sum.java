public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // skip duplicate 'i' values
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // early exit: if smallest number is already > 0, no triplet can sum to 0
            if (nums[i] > 0) break;

            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // skip duplicate 'left' values
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    // skip duplicate 'right' values
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum < 0) {
                    left++;   // sum too small, increase it
                } else {
                    right--;  // sum too big, decrease it
                }
            }
        }
        return result;
    }
}