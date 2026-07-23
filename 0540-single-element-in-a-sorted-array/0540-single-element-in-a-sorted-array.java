class Solution {
    public int singleNonDuplicate(int[] nums) {
        Set<Integer>hs=new HashSet<>();
		for(int x:nums){
			if(hs.contains(x)){
				hs.remove(x);
			}else{
				hs.add(x);
			}
		}
        for(int a:hs){
            return a;
        }
        return -1;
    }
}