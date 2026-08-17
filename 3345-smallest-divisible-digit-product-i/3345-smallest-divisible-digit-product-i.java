class Solution {
    public int smallestNumber(int n, int t) {
        while(product(n)%t!=0){
            n++;
        }
        return n;
    }
    public int product(int n){
        int ans=1;
        while(n>0){
            ans*=n%10;
            n/=10;
        }
        return ans;
    }
}