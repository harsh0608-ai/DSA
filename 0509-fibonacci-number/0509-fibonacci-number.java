class Solution {
    public int fib(int n) {
        int fibonacci_num=recursion_call(n);
        return fibonacci_num;
    }
    public static int recursion_call(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return recursion_call(n-1)+recursion_call(n-2);
        }
    }
}