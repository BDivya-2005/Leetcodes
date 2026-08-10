class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer>path=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        backtrack(path,res,1,n,k);
        return res;
    }
    public void backtrack(List<Integer>path,List<List<Integer>>res,int s,int n,int k){
        if(path.size()==k){
            res.add(new ArrayList(path));
            return;
        }
        for(int i=s;i<=n;i++){
            path.add(i);
            backtrack(path,res,i+1,n,k);
            path.remove(path.size()-1);
        }
    }
}