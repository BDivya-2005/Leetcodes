class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>res=new ArrayList<>();
        List<List<Integer>>path=new ArrayList<>();
        backtrack(res,path,nums);
        return path;
    }
    public void backtrack(List<Integer>res,List<List<Integer>>path,int[]nums){
        if(res.size()==nums.length){
            path.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(res.contains(nums[i])){
                continue;
            }
            res.add(nums[i]);
            backtrack(res,path,nums);
            res.remove(res.size()-1);
        }
    }
}