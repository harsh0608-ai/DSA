class Solution {
    public static boolean isPrime(int num){
        if(num<=1)return false;
        if(num<=3)return true;
        if(num%2==0 || num%3==0)return false;
        int i=5;
        while(i*i<=num){
            if(num%i==0 || num%(i+2)==0)return false;
            i+=6;
        }
        return true;
    }
    public int largestPrime(int n) {
        int lt=n;
        if(lt<2)return 0;
        long sum=0L;
        int ans=0;
        int p=2;
        while(sum+p <= lt){
            sum+=p;
            if(isPrime((int)sum)){
                ans=(int)sum;
            }
            int next=p+1;
            while(!isPrime(next)){
                next++;
            }
            p=next;
        }
        return ans;
    }
}