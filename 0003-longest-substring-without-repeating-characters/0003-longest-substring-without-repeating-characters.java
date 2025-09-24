class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, maxLen = 0;

        for (int r = 0; r < s.length(); r++) {
            char x = s.charAt(r);
            if (map.containsKey(x) && map.get(x) >= l) {
                l = map.get(x) + 1;  // move left pointer
            }
            map.put(x, r);  // update index of character
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}
