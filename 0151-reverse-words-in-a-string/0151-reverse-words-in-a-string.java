class Solution {
    public String reverseWords(String s) {
        StringBuilder rev= new StringBuilder(s);
        String ans="";
        rev.reverse();
        for(int i=0;i<s.length();i++){
            StringBuilder word=new StringBuilder();
            while (i < rev.length() && rev.charAt(i) == ' ') {
                i++;
            }
            while (i < rev.length() && rev.charAt(i) != ' ') {
                word.append(rev.charAt(i));
                i++;
            }
            word.reverse();
            if(word.length()>0){
                ans+= " "+word;
            }
        }
        return ans.substring(1);
    }
}