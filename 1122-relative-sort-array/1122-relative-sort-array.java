class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count=new int[1001];
        for(int i=0;i<arr1.length;i++){
            count[arr1[i]]++;
        }
        int ind=0;
        for(int i=0;i<arr2.length;i++){
            int n=arr2[i];
            while(count[n]>0){
                arr1[ind]=n;
                ind++;
                count[n]--;
            }
        }
        for (int num = 0; num < count.length; num++) {
            while (count[num] > 0) {
                arr1[ind] = num;
                ind++;
                count[num]--;
            }
        }
        return arr1;
    }
}