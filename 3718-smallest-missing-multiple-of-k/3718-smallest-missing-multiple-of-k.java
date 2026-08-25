class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int temp=k;
        while(map.contains(temp)){
            temp+=k;
        }
        return temp;
    }
}