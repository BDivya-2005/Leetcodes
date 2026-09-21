class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char t:tasks){
            freq[t-'A']++;
        }
        int max=0;
        for(int i=0;i<26;i++){
            max=Math.max(max,freq[i]);
        }
        int f=0;
        for(int i=0;i<26;i++){
            if(max==freq[i]){
                f++;
            }
        }
        int res=(max-1)*(n+1)+f;
        return Math.max(tasks.length,res);
    }
}