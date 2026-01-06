class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                idx=i;
                break;
            }else if(target < nums[i]){
                idx=i;
                break;
            }
        }
        if(target>nums[nums.length-1]){
            idx=nums.length;
        }
        return idx;
    }
}