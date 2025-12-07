class Solution {
    public static boolean isPrime(int num){
            if(num<=1) return false;
            if(num<=3) return true;
            if((num%2==0)|| (num%3==0)) return false;
            int j=5;
            while(j*j<=num){
                if((num%j==0)||(num%(j+2)==0))return false;
                j+=6;
            }
        return true;
    }
    public boolean completePrime(int num) {
        if(num<10) return isPrime(num);
        String string=Integer.toString(num);
        int prefix=0;
        for(int i=0;i<string.length();i++){
            int digit=string.charAt(i)-'0';
            prefix=prefix*10+digit;
            if(!isPrime(prefix)) return false;
        }
        int suffix=0;
        int pow=1;
        for(int i=string.length()-1;i>=0;i--){
            int digit=string.charAt(i)-'0';
            suffix=digit*pow+suffix;
            pow*=10;
            if(!isPrime(suffix)) return false;
        }
        return true;
    }
}