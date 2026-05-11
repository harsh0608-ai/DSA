class Solution {
    public int[] separateDigits(int[] nums) {
        String ans="";
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
        }
        int answer[]=new int[ans.length()];
        for(int i=0;i<ans.length();i++){
            answer[i]=ans.charAt(i)-'0';
        }
        return answer;
    }
}