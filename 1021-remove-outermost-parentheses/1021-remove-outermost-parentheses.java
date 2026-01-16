class Solution {
    public String removeOuterParentheses(String s) {
        String answer="";
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')')count--;
            if(count!=0){
                answer+=s.charAt(i);
            }
            if(s.charAt(i)=='(')count++;
        }
        return answer;
    }
}