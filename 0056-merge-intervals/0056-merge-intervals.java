class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        int st=intervals[0][0];
        int end=intervals[0][1];
        List<int[]>m=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int nst=intervals[i][0];
            int nend=intervals[i][1];
            if(end<nst){
                m.add(new int[]{st,end});
                st=nst;
                end=nend;
            }
            else{
                end=Math.max(nend,end);
            }
        }
        m.add(new int[]{st,end});
        return m.toArray(new int[m.size()][]);
        
    }
}