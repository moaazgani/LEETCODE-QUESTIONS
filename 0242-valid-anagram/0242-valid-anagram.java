class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s2 = s.toCharArray();
        Arrays.sort(s2);
        String s3 = new String(s2);

        char[] t2 = t.toCharArray();
        Arrays.sort(t2);
        String t3 = new String(t2);

        if(s3.equals(t3)){
            return true;
        }
        return false;
    }
}