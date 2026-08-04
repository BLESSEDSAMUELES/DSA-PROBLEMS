class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0;
        int ans = 0;

        HashSet<Character> set = new HashSet<>();
        while (r < s.length()) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            r++;
            ans = Math.max(ans, r - l);

        }
        return ans;
    }
}