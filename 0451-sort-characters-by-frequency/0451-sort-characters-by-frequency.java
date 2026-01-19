class Solution {
    public String frequencySort(String s) {
        if(s.length()<=1){
            return s;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character>list=new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        String ans="";
        for(char c:list){
           int freq=map.get(c);
           while(freq>0){
            ans+=c;
            freq--;
           } 
        }
        return ans;
    }
}