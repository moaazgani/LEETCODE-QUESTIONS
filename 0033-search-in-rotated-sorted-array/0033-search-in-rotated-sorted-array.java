class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low +(high - low) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            // Check which half is properly sorted
            if (nums[low] <= nums[mid]) {
                // Left half is sorted
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1; // target is in the sorted left half
                } else {
                    low = mid + 1;  // target must be in the right half
                }
            } else {
                // Right half is sorted
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;  // target is in the sorted right half
                } else {
                    high = mid - 1; // target must be in the left half
                }
            }
        }
        
        return -1;
    }
}