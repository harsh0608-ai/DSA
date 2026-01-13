class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)return nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans ^=nums[i];
        }
        return ans;
    }
}