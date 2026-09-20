class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i = 0; i <= s.length()-1; i++){
            char ch = s.charAt(i);
            int rev_idx = 26 - (ch - 'a');
            int product = rev_idx * (i + 1);
            ans += product;
        }
        return ans;
    }
}