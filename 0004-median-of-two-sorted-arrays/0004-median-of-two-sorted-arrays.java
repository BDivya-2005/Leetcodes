class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int m=nums2.length;
        int[] len=new int[n+m];
        for(int i=0;i<n;i++)
        {
            len[i]=nums1[i];
        }
        for(int j=0;j<m;j++)
        {
            len[n+j]=nums2[j];
        }
        Arrays.sort(len);
        int l=len.length;
        int mid=l/2;
        if(l%2!=0)
        {
            return (double)len[mid];
        }
        else
        {
            int s=len[mid]+len[mid-1];
            return s/2.0;
        }
        
    }
}