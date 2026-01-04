class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return palindrome(0,s);
    }
    public static boolean palindrome(int i, String s){
         int n=s.length();
        if(i>=n/2){
            return true;
        }else if(s.charAt(i)!= s.charAt(n-i-1)){
            return false;
        }
        return palindrome(i+1,s);
    }
}