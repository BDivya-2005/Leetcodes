class Solution {
    public boolean isHappy(int n) {
        Set<Integer> v=new HashSet<>();
        while(n!=1 && !v.contains(n)){
            int sum=0;
            v.add(n);
            while(n!=0){
                int d=n%10;
                sum+=d*d;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}