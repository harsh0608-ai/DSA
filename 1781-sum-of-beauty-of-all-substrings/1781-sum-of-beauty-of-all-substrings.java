class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // Frequency array for the substring s[i...j]
            int[] freq = new int[26];
            
            for (int j = i; j < n; j++) {
                // Update frequency for the new character
                freq[s.charAt(j) - 'a']++;
                int minFreq = Integer.MAX_VALUE;
                int maxFreq = Integer.MIN_VALUE;
                // Find min and max in the current frequency array
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) { // Only consider present characters
                        minFreq = Math.min(minFreq, freq[k]);
                        maxFreq = Math.max(maxFreq, freq[k]);
                    }
                }
                
                // Add the beauty of the current substring s[i...j]
                totalBeauty += (maxFreq - minFreq);
            }
        }
        
        return totalBeauty;
    }
}