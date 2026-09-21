class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(String w:words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        List<String>list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            if(map.get(a)!=map.get(b)){
                return map.get(b)-map.get(a);
            }
            return a.compareTo(b);
        });
        return list.subList(0,k);
    }
}