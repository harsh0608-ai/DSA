class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[]=new int[m+n];
        int left=0;
        int right=0;
        int idx=0;
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                ans[idx]=nums1[left];
                left++;
                idx++;
            }else{
                ans[idx]=nums2[right];
                right++;
                idx++;
            }
        }
        while(left<m){
            ans[idx]=nums1[left];
            left++;
            idx++;
        }
        while(right<n){
            ans[idx]=nums2[right];
            right++;
            idx++;
        }
        for(int i=0;i<n+m;i++){
            nums1[i]=ans[i];
        }
    }
}