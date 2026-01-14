class Solution {
    public static int maxElement(int arr[]){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
    public static int FindHours(int arr[],int hours){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=Math.ceil((double)arr[i]/(double)hours);
        }
        return ans;
    }

    public int minEatingSpeed(int[] piles, int h) {
    int low=1;
    int high=maxElement(piles);
    while(low<=high){
        int mid=(low+high)/2;
        int TotalHours=FindHours(piles,mid);
        if(TotalHours<=h){
            high=mid-1;
        }else{
            low=mid+1;
        }
    }
    return low;
    }
}