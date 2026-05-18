class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n= nums2.length;
        int ans[]=new int[m+n];
        for(int i=0;i<m;i++){
            ans[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            ans[m+i]=nums2[i];
        }
        Arrays.sort(ans);
        int x=ans.length;
        double median;
        if(x%2==0){
            median=(ans[x/2]+ans[x/2-1])/2.0;
        }else{
            median=ans[x/2];
        }
        return median;
    }
}