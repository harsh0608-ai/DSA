class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;int r=0;
        int count=0;
        int arr[]=new int[3];
        while(r<s.length()){
            arr[s.charAt(r)-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                count+=s.length()-r;

                arr[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return count;
    }
}