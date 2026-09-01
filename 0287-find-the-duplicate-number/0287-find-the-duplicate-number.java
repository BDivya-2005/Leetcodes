class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer>hs=new HashSet<>();
        for(int n:nums){
            if(hs.contains(n)){
                return n;
            }
            hs.add(n);
        }

        return -1;
    }
}