class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int ans = -1;
        int max = 0;

        for(int key : map.keySet()){
            if(key % 2 == 0){
                int freq = map.get(key);

                if(freq > max || (freq == max && key < ans)){
                    max = freq;
                    ans = key;
                }
            }
        }
        return ans;
    }
}