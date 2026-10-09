class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        int cur=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int n:nums){
            cur+=n;
            int tar=cur-k;
            if(hm.containsKey(tar)){
                c+=hm.get(tar);
            }
            hm.put(cur,hm.getOrDefault(cur,0)+1);
        }
        return c;
    }
}