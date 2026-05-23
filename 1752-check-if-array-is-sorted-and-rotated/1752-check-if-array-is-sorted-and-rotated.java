class Solution {
    public boolean check(int[] nums) {
        if(nums.length<=1) return true;
        
        int ir=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                ir++;
            }
        }
        return ir>1 ? false:true;
    }
}