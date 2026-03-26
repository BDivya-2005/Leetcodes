class Solution {
    public int countPrimes(int n) {
        int c=0;
        if(n<=2){
            return 0;
        }
        boolean[] pri=new boolean[n];
        Arrays.fill(pri,true);
        pri[0]=false;
        pri[1]=false;
        for(int i=2;i<n;i++){
            if(pri[i]){
                c++;
                if((long)i*i<n){
                    for(int j=i*i;j<n;j+=i){
                        pri[j]=false;
                    }
                }
            }
        }
        return c;
    }
}
