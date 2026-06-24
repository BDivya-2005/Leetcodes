class Solution {
    public int strStr(String haystack, String needle) 
    {
        int ne=needle.length();
        int ha=haystack.length();

        int i=0;
        int j=0;
        while(i<ha)
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                if(ne==1)
                {
                    return i;
                }
                if(j==ne)
                {
                    return i-j;
                }
                i++;
                j++;
            }
            else
            {
                i=i-j+1;
                j=0;
            }
            if(j==ne)
            {
                return i-j;
            }
        }
        return -1;
    }
}