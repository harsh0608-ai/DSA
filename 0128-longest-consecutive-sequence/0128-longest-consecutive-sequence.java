class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        int longest=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(Integer s:set){
            if(!set.contains(s-1)){
                int curr=s;
                int len=1;
                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
                longest=Math.max(longest,len);
            }
        }
        return longest;
    }
}