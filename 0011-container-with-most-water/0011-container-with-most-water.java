class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<=right){
            int length=Math.min(height[left],height[right]);
            int breath=Math.abs(left-right);
            int area= length*breath;
            max=Math.max(area,max);
            if(height[left]<=height[right])
            {
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}