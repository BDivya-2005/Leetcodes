class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String para=paragraph.toLowerCase();
        para=para.replaceAll("[^a-z]"," ");
        String[] s=para.split(" ");
        HashSet<String>ban=new HashSet<>();
        for(String w:banned){
            ban.add(w);
        }
        HashMap<String,Integer>hm=new HashMap<>();
        for(String w:s){
            if(w.length()==0){
                continue;
            }
            if(ban.contains(w)){
                continue;
            }
            hm.put(w,hm.getOrDefault(w,0)+1);
        }
        String ans="";
        int max=0;
        for(String w:hm.keySet()){
            if(hm.get(w)>max){
                max=hm.get(w);
                ans=w;
            }
        }
        return ans;
    }
}