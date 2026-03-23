class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(r>l){
            char inl=s.charAt(l);
            char inr=s.charAt(r);

            if(!Character.isLetterOrDigit(inl)){
                l++;
            }
            else if(!Character.isLetterOrDigit(inr)){
                r--;
            }
        else if(Character.toLowerCase(inl)!=Character.toLowerCase(inr)){
            return false;
        }
        else{
            l++;
            r--;    
        }
        }
        return true;
        
    }
}