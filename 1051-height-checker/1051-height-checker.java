class Solution {
    public int heightChecker(int[] heights) {
        int h=heights.length;
        int[] ex=new int[h];
        for(int i=0;i<h;i++){
            ex[i]=heights[i];
        }
        for(int i=0;i<h-1;i++){
            for(int j=0;j<h-i-1;j++){
                if(ex[j]>ex[j+1]){
                    int temp=ex[j];
                    ex[j]=ex[j+1];
                    ex[j+1]=temp;
                }
            }
        }
        int c=0;
        for(int i=0;i<h;i++){
            if(heights[i]!=ex[i]){
                c++;
            }
        }
        return c;
    }
}