class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans.add(nums[i]);
            }
            else{
                count++;
            }
        }
        while(count>0){
            ans.add(0);
            count--;
        }    
        for(int i=0;i<nums.length;i++){
            nums[i]=ans.get(i);
        }
        System.out.print(nums);
    }
}