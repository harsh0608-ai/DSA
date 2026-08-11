class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int max=0;
        HashSet <Integer>map=new HashSet<>();
        for(int i=0;i<n;i++){
            max+=nums[i];
            if(i==n-1 ||nums[i]+1!=nums[i+1]) break;
        }
        for(int i=0;i<n;i++){
            map.add(nums[i]);
        }
        while(map.contains(max)){
            max++;
        }
        return max;
    }
}