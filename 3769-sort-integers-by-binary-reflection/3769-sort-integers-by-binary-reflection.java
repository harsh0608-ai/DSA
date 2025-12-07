class Solution {
    public static int binaryReflection(int n) {
        int rev = 0;
        while (n > 0) {
            rev = (rev << 1) | (n & 1);
            n >>= 1;
        }
        return rev;
    }
    public int[] sortByReflection(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int ri = binaryReflection(nums[i]);
                int rj = binaryReflection(nums[j]);
        
                if (ri > rj || (ri == rj && nums[i] > nums[j])) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}